package com.codies.quizapp.UI.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codies.quizapp.Models.RoomModels.ExamData;
import com.codies.quizapp.R;
import com.codies.quizapp.UI.Activities.MainActivity;
import com.codies.quizapp.UI.Activities.QuizActivity;
import com.codies.quizapp.UI.Activities.StartActivity;
import com.codies.quizapp.Utils.QuizOnClickListener;
import com.codies.quizapp.Utils.QuizzesAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuizesFragment extends Fragment implements QuizOnClickListener {

    static QuizesFragment quizesFragment;
    RecyclerView quizzesRV;
    QuizzesAdapter quizzesAdapter;
    List<ExamData> examDataList;
    RecyclerView.LayoutManager layoutManager;
    public static QuizesFragment getInstance() {
        if (quizesFragment == null) {
            quizesFragment = new QuizesFragment();
        }
        return quizesFragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quizes, container, false);
        quizzesRV = view.findViewById(R.id.quizzesRV);
        examDataList = new ArrayList<>();
        layoutManager = new LinearLayoutManager(getContext());
        quizzesAdapter = new QuizzesAdapter(this);
        quizzesRV.setLayoutManager(layoutManager);
        quizzesRV.setAdapter(quizzesAdapter);
        getData();
        return view;
    }

    void getData() {
        com.codies.quizapp.Models.RoomModels.ExamData examData = new com.codies.quizapp.Models.RoomModels.ExamData(1, "Software Engineering", 3, "Sir Mukhtiar Zamin", "2 january", "3 january", "4 january", "2 hours", 20, "not given", 3, "software", null, null, null);
        com.codies.quizapp.Models.RoomModels.ExamData examData1 = new com.codies.quizapp.Models.RoomModels.ExamData(1, "Software Engineering", 3, "Sir Mukhtiar Zamin", "2 january", "3 january", "4 january", "2 hours", 20, "not given", 3, "software", null, null, null);
        com.codies.quizapp.Models.RoomModels.ExamData examData2= new com.codies.quizapp.Models.RoomModels.ExamData(1, "Software Engineering", 3, "Sir Mukhtiar Zamin", "2 january", "3 january", "4 january", "2 hours", 20, "not given", 3, "software", null, null, null);
        com.codies.quizapp.Models.RoomModels.ExamData examData3 = new com.codies.quizapp.Models.RoomModels.ExamData(1, "Software Engineering", 3, "Sir Mukhtiar Zamin", "2 january", "3 january", "4 january", "2 hours", 20, "not given", 3, "software", null, null, null);
        examDataList.add(examData);
        examDataList.add(examData1);
        examDataList.add(examData2);
        examDataList.add(examData3);

        quizzesAdapter.setQuizzes(examDataList);
    }

    @Override
    public void onClick(int examId) {
        startActivity(new Intent(getActivity(), StartActivity.class));

    }
}
