package com.codies.quizapp.UI.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.codies.quizapp.Models.Question;
import com.codies.quizapp.UI.Fragments.DashboardFragment;
import com.codies.quizapp.UI.Fragments.ProfileFragment;
import com.codies.quizapp.UI.Fragments.QuizesFragment;
import com.codies.quizapp.Utils.QuizOnClickListener;
import com.codies.quizapp.Utils.QuizzesAdapter;
import com.codies.quizapp.Models.RoomModels.ExamData;
import com.codies.quizapp.Models.RoomModels.FiB;
import com.codies.quizapp.Models.RoomModels.MCQ;
import com.codies.quizapp.Models.RoomModels.OptionForFiB;
import com.codies.quizapp.Models.RoomModels.OptionForMCQ;
import com.codies.quizapp.Models.RoomModels.TrueFalse;
import com.codies.quizapp.R;
import com.codies.quizapp.ViewModels.MainViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    public static final String TAG = "MAIN";


    BroadcastReceiver broadcastReceiver;
    MainViewModel mainViewModel;
    int examId;
    BottomNavigationView bottomNavigationView;

    ProfileFragment profileFragment;
    DashboardFragment dashboardFragment;
    QuizesFragment quizesFragment;

    ArrayList<Question> qList= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        initInternetBroadcastReceiver();

        profileFragment = ProfileFragment.getInstance();
        dashboardFragment = DashboardFragment.getInstance();
        quizesFragment = QuizesFragment.getInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, quizesFragment).commit();


/*        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.getExam();
        mainViewModel.getAllExamData().observe(this, new Observer<List<com.codies.quizapp.Models.RoomModels.ExamData>>() {
            @Override
            public void onChanged(List<com.codies.quizapp.Models.RoomModels.ExamData> examData) {
                if (examData != null) {
                    Log.i(TAG, "onChanged: examData " + examData.size());
                    quizzesAdapter.setQuizzes(examData);
                    if (examData.size() != 0) {
                        examId = examData.get(0).getExamId();
                        Log.i(TAG, "onChanged:examId " + examId);
                        if (examData.size() > 0) {
                            getFiBs(examId);
                            getTrueFalse(examId);
                            getMcq(examId);
                        }


                    }
                }
            }
        });*/

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {

                        case R.id.quizzes:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, quizesFragment).commit();
                            break;
                        case R.id.dashboard:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, dashboardFragment).commit();
                            break;
                        case R.id.profile:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, profileFragment).commit();
                            break;
                        default:
                            break;
                    }

                    return true;
                }
            };



    public void getFiBs(int examId) {
        Log.i(TAG, "getFiBs: " + examId);
        mainViewModel.getAllFibs(examId).observe(this, new Observer<List<FiB>>() {
            @Override
            public void onChanged(List<FiB> fiBS) {
                Log.i(TAG, "onChanged: fibb " + fiBS.get(0).getStatement());
                mainViewModel.getAllFibOptions(fiBS.get(0).getExamId(), fiBS.get(0).getFibId()).observe(MainActivity.this, new Observer<List<OptionForFiB>>() {
                    @Override
                    public void onChanged(List<OptionForFiB> optionForFiBS) {
                        Log.i(TAG, "onChanged:option for fib " + optionForFiBS.get(0).getAnswer());
                        Log.i(TAG, "onChanged: optionforfib size " + optionForFiBS.size());
                    }
                });
            }
        });
    }

    public void getTrueFalse(int examId) {
        mainViewModel.getAllTrueFalse(examId).observe(this, new Observer<List<TrueFalse>>() {
            @Override
            public void onChanged(List<TrueFalse> trueFalses) {
                Log.i(TAG, "onChanged: truefalse "+trueFalses.get(0).getStatement());
            }
        });
    }

    public void getMcq(int examId) {
        mainViewModel.getAllMcq(examId).observe(this, new Observer<List<MCQ>>() {
            @Override
            public void onChanged(List<MCQ> mcqs) {
                Log.i(TAG, "onChanged: mcq " + mcqs.get(0).getStatement());
                mainViewModel.getAllMcqOptions(mcqs.get(0).getExamId(),mcqs.get(0).getMcqId()).observe(MainActivity.this, new Observer<List<OptionForMCQ>>() {
                    @Override
                    public void onChanged(List<OptionForMCQ> optionForMCQS) {
                        Log.i(TAG, "onChanged: option for mcq " + optionForMCQS.get(0).getOption());
                        Log.i(TAG, "onChanged: option for mcq size " + optionForMCQS.size());
                    }
                });
            }
        });
    }

    public void initViews() {
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

    }

    public void initInternetBroadcastReceiver() {
        broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
            }
        };
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");


        registerReceiver(broadcastReceiver, new IntentFilter(intentFilter));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(broadcastReceiver);
    }

}
