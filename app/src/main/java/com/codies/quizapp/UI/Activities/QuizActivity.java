package com.codies.quizapp.UI.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;

import com.codies.quizapp.R;
import com.codies.quizapp.UI.Fragments.OptionFibFragment;
import com.codies.quizapp.UI.Fragments.OptionMcqFragment;
import com.codies.quizapp.UI.Fragments.OptionTrueFalseFragment;
import com.github.lzyzsd.circleprogress.DonutProgress;

public class QuizActivity extends AppCompatActivity {

    DonutProgress progress;

    OptionMcqFragment optionMcqFragment;
    OptionTrueFalseFragment optionTrueFalseFragment;
    OptionFibFragment optionFibFragment;
    ImageView imageView;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_screen);
        progress = findViewById(R.id.questionTimePBQuiz);
        progress.setMax(20);

        imageView = findViewById(R.id.imageView);
        optionMcqFragment = OptionMcqFragment.newInstance();
        optionTrueFalseFragment = OptionTrueFalseFragment.newInstance();
        optionFibFragment = OptionFibFragment.newInstance();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, optionMcqFragment).commit();
        startTimer(20000);
   /*     progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter == 0) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, optionMcqFragment).commit();
                }
                if (counter == 1) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, optionFibFragment).commit();
                }
                if (counter == 2) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, optionTrueFalseFragment).commit();
                    counter = 0;
                }
                counter++;

            }
        });
        */

   imageView.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           finish();
       }
   });

    }

    public void startTimer(int seconds) {
        new CountDownTimer(seconds, 1000) {

            public void onTick(long millisUntilFinished) {
                progress.setDonut_progress(String.valueOf(millisUntilFinished / 1000));
            }

            public void onFinish() {
//                mTextField.setText("done!");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, optionFibFragment).commit();

            }
        }.start();
    }


}
