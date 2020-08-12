package com.codies.quizapp.UI.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.codies.quizapp.R;

public class StartActivity extends AppCompatActivity {

    ImageView imageView;
    Button startQuiz;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_quiz_dialogue);

        startQuiz = findViewById(R.id.startQuizBT);
        imageView = findViewById(R.id.imageView7);
        back = findViewById(R.id.backBt);
        Glide.with(this).load(R.drawable.my).into(imageView);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        startQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this, QuizActivity.class));
            }
        });
    }
}
