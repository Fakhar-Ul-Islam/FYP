package com.codies.quizapp.ViewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.codies.quizapp.Models.RoomModels.FiB;
import com.codies.quizapp.Models.RoomModels.MCQ;
import com.codies.quizapp.Models.RoomModels.OptionForFiB;
import com.codies.quizapp.Models.RoomModels.OptionForMCQ;
import com.codies.quizapp.Models.RoomModels.TrueFalse;
import com.codies.quizapp.Repository.LocalRepo;
import com.codies.quizapp.Repository.OnlineRepo;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    public static final String TAG = "HOOI";

    OnlineRepo onlineRepo;
    LocalRepo localRepo;

    public MainViewModel(@NonNull Application application) {
        super(application);
        onlineRepo = new OnlineRepo(application);
        localRepo = new LocalRepo(application);
    }

    public void getExam() {
        onlineRepo.getExam();
    }


    public LiveData<List<com.codies.quizapp.Models.RoomModels.ExamData>> getAllExamData() {
        return localRepo.getAllExamData();
    }

    public LiveData<List<FiB>> getAllFibs(int examId) {
        return localRepo.getAllFib(examId);
    }

    public LiveData<List<TrueFalse>> getAllTrueFalse(int examId) {
        return localRepo.getTrueFalse(examId);
    }

    public LiveData<List<MCQ>> getAllMcq(int examId) {
        return localRepo.getAllMcq(examId);
    }

    public LiveData<List<OptionForMCQ>> getAllMcqOptions(int examId, int mcqId) {
        return localRepo.getAllMcqOptions(mcqId, examId);
    }

    public LiveData<List<OptionForFiB>> getAllFibOptions(int examId, int fibId) {
        return localRepo.getAllFibOptions(fibId, examId);
    }
}
