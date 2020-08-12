package com.codies.quizapp.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.codies.quizapp.LocatDB.ExamDAO;
import com.codies.quizapp.LocatDB.FibDao;
import com.codies.quizapp.LocatDB.FibOptionsDao;
import com.codies.quizapp.LocatDB.LocalDatabase;
import com.codies.quizapp.LocatDB.McqDao;
import com.codies.quizapp.LocatDB.McqOptionsDao;
import com.codies.quizapp.LocatDB.TrueFalseDAO;
import com.codies.quizapp.Models.RoomModels.ExamData;
import com.codies.quizapp.Models.RoomModels.FiB;
import com.codies.quizapp.Models.RoomModels.MCQ;
import com.codies.quizapp.Models.RoomModels.OptionForFiB;
import com.codies.quizapp.Models.RoomModels.OptionForMCQ;
import com.codies.quizapp.Models.RoomModels.TrueFalse;

import java.util.List;

public class LocalRepo {
    private ExamDAO examDAO;
    private FibDao fibDao;
    private TrueFalseDAO trueFalseDAO;
    private McqDao mcqDao;
    private FibOptionsDao fibOptionsDao;
    private McqOptionsDao mcqOptionsDao;

    public LocalRepo(Application application) {
        LocalDatabase localDatabase = LocalDatabase.getLocalDatabase(application);
        examDAO = localDatabase.examDAO();
        fibDao = localDatabase.fibDao();
        mcqDao = localDatabase.mcqDao();
        fibOptionsDao = localDatabase.fibOptionsDao();
        mcqOptionsDao = localDatabase.mcqOptionsDao();
        trueFalseDAO = localDatabase.trueFalseDAO();
    }

    //CRUD on EXAMDATA
    public void insertExamData(ExamData examData) {
        new InsertExamData(examDAO).execute(examData);
    }

    public void updateExamData(ExamData examData) {
        new UpdateExamData(examDAO).execute(examData);
    }

    public void deleteExamData(ExamData examData) {
        new DeleteExamData(examDAO).execute(examData);
    }

    public void deleteAllExamData() {
        new DeleteAllExamData(examDAO).execute();
    }

    public LiveData<List<ExamData>> getAllExamData() {
        return examDAO.getAllExamData();
    }

    //CRUD on FIB

    public void insertFib(com.codies.quizapp.Models.RoomModels.FiB fiB) {
        new InsertFib(fibDao).execute(fiB);
    }

    public void updateFib(FiB fiB) {
        new UpdateFib(fibDao).execute(fiB);
    }

    public void deleteFib(FiB fiB) {
        new DeleteFib(fibDao).execute(fiB);
    }

    public void deleteAllFib(int examId) {
        new DeleteAllFib(fibDao).execute(examId);
    }

    public LiveData<List<FiB>> getAllFib(int examId) {
        return fibDao.getFib(examId);
    }


    //CRUD on TrueFalse

    public void insertTrueFalse(com.codies.quizapp.Models.RoomModels.TrueFalse trueFalse) {
        new InsertTrueFalse(trueFalseDAO).execute(trueFalse);
    }

    public void updateTrueFalse(TrueFalse trueFalse) {
        new UpdateTrueFalse(trueFalseDAO).execute(trueFalse);

    }

    public void deleteTrueFalse(TrueFalse trueFalse) {
        new DeleteTrueFalse(trueFalseDAO).execute(trueFalse);
    }

    public void deleteAllTrueFalse(int examId) {
        new DeleteAllTrueFalse(trueFalseDAO).execute(examId);
    }

    public LiveData<List<TrueFalse>> getTrueFalse(int examId) {
        return trueFalseDAO.getTrueFalse(examId);
    }


    //Crud on mcq
    public void insertMcq(MCQ mcq) {
        new InsertMcq(mcqDao).execute(mcq);
    }

    public void updateMcq(MCQ mcq) {
        new UpdateMcq(mcqDao).execute(mcq);
    }

    public void deleteMcq(MCQ mcq) {
        new DeleteMcq(mcqDao).execute(mcq);
    }

    public void deleteAllMcq(int examId) {
        new DeleteAllMcq(mcqDao).execute(examId);
    }

    public LiveData<List<MCQ>> getAllMcq(int examId) {
        return mcqDao.getAllMcq(examId);
    }

    // crud on mcqOptions

    public void insertMcqOption(OptionForMCQ optionForMCQ) {
        new InsertMcqOption(mcqOptionsDao).execute(optionForMCQ);
    }

    public void updateMcqOption(OptionForMCQ optionForMCQ) {
        new UpdateMcqOption(mcqOptionsDao).execute(optionForMCQ);
    }

    public void deleteMcqOption(OptionForMCQ optionForMCQ) {
        new DeleteMcqOption(mcqOptionsDao).execute(optionForMCQ);
    }

    public void deleteALlMcqOptions(int examId) {
        new DeleteAllMcqOption(mcqOptionsDao).execute(examId);
    }

    public LiveData<List<OptionForMCQ>> getAllMcqOptions(int mcqId, int examId) {
        return mcqOptionsDao.getAllOptions(examId, mcqId);
    }

    //crud on fibOptions

    public void insertFibOption(OptionForFiB optionForFiB) {
        new InsertFibOption(fibOptionsDao).execute(optionForFiB);
    }

    public void updateFibOption(OptionForFiB optionForFiB) {
        new UpdateFibOption(fibOptionsDao).execute(optionForFiB);
    }

    public void deleteFibOption(OptionForFiB optionForFiB) {
        new DeleteFibOption(fibOptionsDao).execute(optionForFiB);
    }

    public void deleteALlFibOptions(int examId) {
        new DeleteAllFibOption(fibOptionsDao).execute(examId);
    }

    public LiveData<List<OptionForFiB>> getAllFibOptions(int fibId, int examId) {
        return fibOptionsDao.getFibOptions(examId, fibId);
    }


    //The async tasks to perform crud operations

    public static class InsertExamData extends AsyncTask<ExamData, Void, Void> {
        ExamDAO examDAO;

        public InsertExamData(ExamDAO examDAO) {
            this.examDAO = examDAO;
        }

        @Override
        protected Void doInBackground(ExamData... examData) {
            examDAO.insert(examData[0]);
            return null;
        }
    }

    public static class InsertFib extends AsyncTask<FiB, Void, Void> {
        FibDao fibDao;

        public InsertFib(FibDao fibDao) {
            this.fibDao = fibDao;
        }

        @Override
        protected Void doInBackground(FiB... fiBS) {
            fibDao.insert(fiBS[0]);
            return null;
        }
    }

    public static class InsertTrueFalse extends AsyncTask<TrueFalse, Void, Void> {
        TrueFalseDAO trueFalseDAO;

        public InsertTrueFalse(TrueFalseDAO trueFalseDAO) {
            this.trueFalseDAO = trueFalseDAO;
        }

        @Override
        protected Void doInBackground(TrueFalse... trueFalses) {
            trueFalseDAO.insert(trueFalses[0]);
            return null;
        }
    }

    public static class InsertMcq extends AsyncTask<MCQ, Void, Void> {
        McqDao mcqDao;

        public InsertMcq(McqDao mcqDao) {
            this.mcqDao = mcqDao;
        }

        @Override
        protected Void doInBackground(MCQ... mcqs) {
            mcqDao.insert(mcqs[0]);
            return null;
        }
    }


    public static class UpdateExamData extends AsyncTask<ExamData, Void, Void> {
        ExamDAO examDAO;

        public UpdateExamData(ExamDAO examDAO) {
            this.examDAO = examDAO;
        }

        @Override
        protected Void doInBackground(ExamData... examData) {
            examDAO.update(examData[0]);
            return null;
        }
    }

    public static class UpdateFib extends AsyncTask<FiB, Void, Void> {
        FibDao fibDao;

        public UpdateFib(FibDao fibDao) {
            this.fibDao = fibDao;
        }

        @Override
        protected Void doInBackground(FiB... fiBS) {
            fibDao.update(fiBS[0]);
            return null;
        }
    }

    public static class UpdateTrueFalse extends AsyncTask<TrueFalse, Void, Void> {
        TrueFalseDAO trueFalseDAO;

        public UpdateTrueFalse(TrueFalseDAO trueFalseDAO) {
            this.trueFalseDAO = trueFalseDAO;
        }


        @Override
        protected Void doInBackground(TrueFalse... trueFalses) {
            trueFalseDAO.update(trueFalses[0]);
            return null;
        }
    }

    public static class UpdateMcq extends AsyncTask<MCQ, Void, Void> {
        McqDao mcqDao;

        public UpdateMcq(McqDao mcqDao) {
            this.mcqDao = mcqDao;
        }

        @Override
        protected Void doInBackground(MCQ... mcqs) {
            mcqDao.update(mcqs[0]);
            return null;
        }
    }


    public static class DeleteExamData extends AsyncTask<ExamData, Void, Void> {
        ExamDAO examDAO;

        public DeleteExamData(ExamDAO examDAO) {
            this.examDAO = examDAO;
        }

        @Override
        protected Void doInBackground(ExamData... examData) {
            examDAO.delete(examData[0]);
            return null;
        }
    }

    public static class DeleteFib extends AsyncTask<FiB, Void, Void> {
        FibDao fibDao;

        public DeleteFib(FibDao fibDao) {
            this.fibDao = fibDao;
        }

        @Override
        protected Void doInBackground(FiB... fiBS) {
            fibDao.delete(fiBS[0]);
            return null;
        }
    }

    public static class DeleteTrueFalse extends AsyncTask<TrueFalse, Void, Void> {
        TrueFalseDAO trueFalseDAO;

        public DeleteTrueFalse(TrueFalseDAO trueFalseDAO) {
            this.trueFalseDAO = trueFalseDAO;
        }

        @Override
        protected Void doInBackground(TrueFalse... trueFalses) {
            trueFalseDAO.delete(trueFalses[0]);
            return null;
        }
    }

    public static class DeleteMcq extends AsyncTask<MCQ, Void, Void> {
        McqDao mcqDao;

        public DeleteMcq(McqDao mcqDao) {
            this.mcqDao = mcqDao;
        }

        @Override
        protected Void doInBackground(MCQ... mcqs) {
            mcqDao.delete(mcqs[0]);
            return null;
        }
    }


    public static class DeleteAllExamData extends AsyncTask<Void, Void, Void> {
        ExamDAO examDAO;

        public DeleteAllExamData(ExamDAO examDAO) {
            this.examDAO = examDAO;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            examDAO.deleteAll();
            return null;
        }
    }

    public static class DeleteAllFib extends AsyncTask<Integer, Void, Void> {
        FibDao fibDao;

        public DeleteAllFib(FibDao fibDao) {
            this.fibDao = fibDao;
        }

        @Override
        protected Void doInBackground(Integer... integers) {
            fibDao.deleteAll(integers[0]);
            return null;
        }
    }

    public static class DeleteAllTrueFalse extends AsyncTask<Integer, Void, Void> {
        public TrueFalseDAO trueFalseDAO;

        public DeleteAllTrueFalse(TrueFalseDAO trueFalseDAO) {
            this.trueFalseDAO = trueFalseDAO;
        }

        @Override
        protected Void doInBackground(Integer... integers) {
            trueFalseDAO.deleteAll(integers[0]);
            return null;
        }
    }

    public static class DeleteAllMcq extends AsyncTask<Integer, Void, Void> {
        McqDao mcqDao;

        public DeleteAllMcq(McqDao mcqDao) {
            this.mcqDao = mcqDao;
        }

        @Override
        protected Void doInBackground(Integer... integers) {
            mcqDao.deleteAllMcq(integers[0]);
            return null;
        }
    }

    public static class InsertMcqOption extends AsyncTask<OptionForMCQ, Void, Void> {
        McqOptionsDao mcqOptionsDao;

        public InsertMcqOption(McqOptionsDao mcqOptionsDao) {
            this.mcqOptionsDao = mcqOptionsDao;
        }

        @Override
        protected Void doInBackground(OptionForMCQ... optionForMCQS) {
            mcqOptionsDao.insert(optionForMCQS[0]);
            return null;
        }
    }

    public static class UpdateMcqOption extends AsyncTask<OptionForMCQ, Void, Void> {
        McqOptionsDao mcqOptionsDao;

        public UpdateMcqOption(McqOptionsDao mcqOptionsDao) {
            this.mcqOptionsDao = mcqOptionsDao;
        }

        @Override
        protected Void doInBackground(OptionForMCQ... optionForMCQS) {
            mcqOptionsDao.update(optionForMCQS[0]);
            return null;
        }
    }


    public static class DeleteMcqOption extends AsyncTask<OptionForMCQ, Void, Void> {
        McqOptionsDao mcqOptionsDao;

        public DeleteMcqOption(McqOptionsDao mcqOptionsDao) {
            this.mcqOptionsDao = mcqOptionsDao;
        }

        @Override
        protected Void doInBackground(OptionForMCQ... optionForMCQS) {
            mcqOptionsDao.delete(optionForMCQS[0]);
            return null;
        }
    }

    public static class DeleteAllMcqOption extends AsyncTask<Integer, Void, Void> {
        McqOptionsDao mcqOptionsDao;

        public DeleteAllMcqOption(McqOptionsDao mcqOptionsDao) {
            this.mcqOptionsDao = mcqOptionsDao;
        }

        @Override
        protected Void doInBackground(Integer... integers) {
            mcqOptionsDao.deleteAll(integers[0]);
            return null;
        }
    }


    public static class InsertFibOption extends AsyncTask<OptionForFiB, Void, Void> {
        FibOptionsDao fibOptionsDao;

        public InsertFibOption(FibOptionsDao fibOptionsDao) {
            this.fibOptionsDao = fibOptionsDao;
        }

        @Override
        protected Void doInBackground(OptionForFiB... optionForFiBS) {
            fibOptionsDao.insert(optionForFiBS[0]);
            return null;
        }
    }

    public static class UpdateFibOption extends AsyncTask<OptionForFiB, Void, Void> {
        FibOptionsDao fibOptionsDao;

        public UpdateFibOption(FibOptionsDao fibOptionsDao) {
            this.fibOptionsDao = fibOptionsDao;
        }

        @Override
        protected Void doInBackground(OptionForFiB... optionForFiBS) {
            fibOptionsDao.update(optionForFiBS[0]);
            return null;
        }
    }

    public static class DeleteFibOption extends AsyncTask<OptionForFiB, Void, Void> {
        FibOptionsDao fibOptionsDao;

        public DeleteFibOption(FibOptionsDao fibOptionsDao) {
            this.fibOptionsDao = fibOptionsDao;
        }

        @Override
        protected Void doInBackground(OptionForFiB... optionForFiBS) {
            fibOptionsDao.delete(optionForFiBS[0]);
            return null;
        }
    }

    public static class DeleteAllFibOption extends AsyncTask<Integer, Void, Void> {
        FibOptionsDao fibOptionsDao;

        public DeleteAllFibOption(FibOptionsDao fibOptionsDao) {
            this.fibOptionsDao = fibOptionsDao;
        }

        @Override
        protected Void doInBackground(Integer... integers) {
            fibOptionsDao.deleteALl(integers[0]);
            return null;
        }
    }


}
