package com.codies.quizapp.Repository;

import android.app.Application;
import android.util.Log;

import com.codies.quizapp.Models.RetrofitModels.ExamData;
import com.codies.quizapp.Models.RetrofitModels.ExamQuestions;
import com.codies.quizapp.Models.RetrofitModels.OptionForMCQ;
import com.codies.quizapp.Models.RoomModels.ExamClasses;
import com.codies.quizapp.Models.RoomModels.ExamConfigs;
import com.codies.quizapp.Models.RoomModels.FiB;
import com.codies.quizapp.Models.RoomModels.MCQ;
import com.codies.quizapp.Models.RoomModels.OptionForFiB;
import com.codies.quizapp.Models.RoomModels.Subjects;
import com.codies.quizapp.Models.RoomModels.TrueFalse;
import com.codies.quizapp.NetworkUtils.GetQuiz;
import com.codies.quizapp.NetworkUtils.NetworkClient;
import com.codies.quizapp.Repository.LocalRepo;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class OnlineRepo {
    public static final String KEY = "Ibtihaj";
    public static final String TAG = "OnlineRepo";

    LocalRepo localRepo;
    private Retrofit retrofit;
    ExamData examData;


    public OnlineRepo(Application application) {
        retrofit = NetworkClient.getRetrofit();
        localRepo = new LocalRepo(application);
    }

    public void getExam() {

        GetQuiz getQuiz = retrofit.create(GetQuiz.class);
        Call<JsonObject> call = getQuiz.getQuiz(KEY);
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
//

                        int counterFib=1, counterMcq= 1, counterTrueFalse = 1;

                        JsonObject jsonObject = response.body();
                        ExamData retrofitExamData = new Gson().fromJson(jsonObject, ExamData.class);
                        int examId = retrofitExamData.getExamId();

                        convertAndInsertExamData(retrofitExamData);
                        JsonArray jsonArray = response.body().getAsJsonArray("ExamQuestions");
                        Log.i(TAG, "onResponse: " + jsonArray.size());
                        for (int i = 0; i < jsonArray.size(); i++) {
                            ExamQuestions examQuestions = new Gson().fromJson(jsonArray.get(i), ExamQuestions.class);
                            if (examQuestions.getFiB() != null) {
                                com.codies.quizapp.Models.RetrofitModels.FiB fiB = examQuestions.getFiB();
                                convertAndInsertFib(fiB, examId, counterFib);
                                for (int j = 0; j < fiB.getOptions().size(); j++) {
                                    convertAndInsertFibOption(fiB.getOptions().get(j), examId, counterFib);
                                }
                                counterFib++;
                            }
                            if (examQuestions.getMCQ() != null) {
                                com.codies.quizapp.Models.RetrofitModels.MCQ mcq = examQuestions.getMCQ();
                                convertAndInsertMcq(mcq, examId, counterMcq);
                                for (int j = 0; j < mcq.getOptions().size(); j++) {
                                    convertAndInsertMcqOption(mcq.getOptions().get(j), examId, counterMcq);
                                }
                                counterMcq++;
                            }
                            if (examQuestions.getTrueFale()!= null) {
                                com.codies.quizapp.Models.RetrofitModels.TrueFalse trueFalse = examQuestions.getTrueFale();
                                convertAndInsertTrueFalse(trueFalse, examId, counterTrueFalse);
                                counterTrueFalse++;
                            }
                        }

                        //todo retrofit wala examquestion b kam rhy lkin dsry waly nahe

                    }
                }
            }
            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Log.i(TAG, "onFailure: " + t.getLocalizedMessage());
                Log.i(TAG, "onFailure: " + t.getMessage());
//                data.setValue(null);
                examData = null;
            }
        });
    }

    public void convertAndInsertExamData(ExamData examData) {
        Gson gson = new Gson();
        String subjectsGson = gson.toJson(examData.getSubjects());
        String examClassesGson = gson.toJson(examData.getExamClasses());
        String examConfigsGson = gson.toJson(examData.getExamConfigs());
        Subjects subjects = gson.fromJson(subjectsGson, Subjects.class);
        ExamClasses examClasses = gson.fromJson(examClassesGson, ExamClasses.class);
        ExamConfigs examConfigs = gson.fromJson(examConfigsGson, ExamConfigs.class);

        com.codies.quizapp.Models.RoomModels.ExamData localExamData = new com.codies.quizapp.Models.RoomModels.ExamData(examData.getExamId(), examData.getExamTitle(), examData.getExaminerId(), examData.getExaminerName(), examData.getCreateDate(), examData.getStartDate(), examData.getEndDate(), examData.getDuration(), examData.getTotalMarks(), examData.getExamStatus(), examData.getSelectedSubjectId(), examData.getSelectedSubjectName(), subjects, examClasses, examConfigs);
        localRepo.insertExamData(localExamData);

    }

    public void convertAndInsertMcq(com.codies.quizapp.Models.RetrofitModels.MCQ mcq,int examId,int mcqId) {
        MCQ localMcq = new MCQ(examId, mcqId, mcq.getTopicId(), mcq.getDifficultyValue(), mcq.getTopicTitle(), mcq.getCreatorId(), mcq.getCreatorName(), mcq.getStatement(), mcq.getBasedOnPassage(), mcq.getIsAttemptedInExam(), null, mcq.getStudentAnswer());
        localRepo.insertMcq(localMcq);
    }

    public void convertAndInsertTrueFalse(com.codies.quizapp.Models.RetrofitModels.TrueFalse trueFalse,int examId,int trueFalseId) {
        TrueFalse localTrueFalse = new TrueFalse(examId, trueFalseId, trueFalse.getTopicId(), trueFalse.getTopicTitle(), trueFalse.getDifficultyValue(), trueFalse.getCreatorId(), trueFalse.getCreatorName(), trueFalse.getStatement(), trueFalse.getNotDuplicate(), trueFalse.getIsTrue(), trueFalse.getVisibilityStatus(), trueFalse.getStudentAnswer());
        localRepo.insertTrueFalse(localTrueFalse);
    }

    public void convertAndInsertFib(com.codies.quizapp.Models.RetrofitModels.FiB fiB, int examId, int fibId) {
        FiB localFib = new FiB(examId, fibId, fiB.getTopicId(), fiB.getDifficultyValue(), fiB.getTopicTitle(), fiB.getCreatorId(), fiB.getCreatorName(), fiB.getStatement(), fiB.getNotDuplicate(), fiB.getVisibilityStatus(), null, fiB.getStudentAnswer());
        localRepo.insertFib(localFib);
    }

    public void convertAndInsertMcqOption(OptionForMCQ optionForMCQ, int examId, int mcqId) {
        com.codies.quizapp.Models.RoomModels.OptionForMCQ localOption = new com.codies.quizapp.Models.RoomModels.OptionForMCQ(examId, mcqId, optionForMCQ.getOption(), optionForMCQ.getIsCorrectOption(), optionForMCQ.getOptionId());
        localRepo.insertMcqOption(localOption);
    }

    public void convertAndInsertFibOption(com.codies.quizapp.Models.RetrofitModels.OptionForFiB optionForFiB, int examId, int fibId) {
        OptionForFiB localOption = new OptionForFiB(examId, fibId, optionForFiB.getAnswer(), optionForFiB.getFillInBlankId());
        localRepo.insertFibOption(localOption);
    }

}
