package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignUp_Motive extends AppCompatActivity {

    private TextView signUpMotive_mTvNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__motive);
        signUpMotive_mTvNext=findViewById(R.id.signUpMotive_tvNext);
        signUpMotive_mTvNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_Motive.this,SignUp_SexualOrientation.class);
                startActivity(intent);
            }
        });
    }
}