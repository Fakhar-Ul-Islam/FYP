package com.codies.quizapp.UI.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.codies.quizapp.R;
import com.shobhitpuri.custombuttons.GoogleSignInButton;

public class LoginActivity extends AppCompatActivity {

    EditText emailET;
    EditText passwordET;
    Button loginBT;
    TextView forgotPasswordTV;
    TextView dontHaveAccountTV;
    GoogleSignInButton googleSignInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        initViews();

        googleSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Signing with google", Toast.LENGTH_SHORT).show();
            }
        });

        loginBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });

        forgotPasswordTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Password will be reset", Toast.LENGTH_SHORT).show();
            }
        });

        dontHaveAccountTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

    }

    public void initViews() {
        emailET = findViewById(R.id.emailEtLogin);
        passwordET = findViewById(R.id.passwordEtLogin);
        loginBT = findViewById(R.id.loginBtLogin);
        forgotPasswordTV = findViewById(R.id.forgotPasswordTvLogin);
        dontHaveAccountTV = findViewById(R.id.dontHaveAccountTVLogin);
        googleSignInButton = findViewById(R.id.signupWithGoogleBTLogin);
    }


}
