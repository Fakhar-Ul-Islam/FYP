package com.codies.quizapp.UI.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.codies.quizapp.R;
import com.mikhaellopez.circularimageview.CircularImageView;

public class RegisterActivity extends AppCompatActivity {

    Button signUpBT;
    CircularImageView profileImg;
    EditText nameET;
    EditText phoneET;
    EditText addressET;
    TextView haveAccountTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
        initViews();

        signUpBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, MainActivity.class));
            }
        });

        haveAccountTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });


    }

    public void initViews() {
        signUpBT = findViewById(R.id.signupBtRegister);
        profileImg = findViewById(R.id.addProfileImgCivRegister);
        nameET = findViewById(R.id.nameEtRegister);
        phoneET = findViewById(R.id.phoneNumberEtRegister);
        addressET = findViewById(R.id.postalAddressEtRegister);
        haveAccountTV = findViewById(R.id.alreadyAccountTVRegister);
    }
}
