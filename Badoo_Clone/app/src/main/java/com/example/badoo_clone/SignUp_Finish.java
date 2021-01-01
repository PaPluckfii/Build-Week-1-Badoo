package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp_Finish extends AppCompatActivity {

    private Button mBtn_completeProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__finish);
        mBtn_completeProfile=findViewById(R.id.btn_completeProfile);
        mBtn_completeProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_Finish.this,MainPage_ProfileView.class);
                startActivity(intent);
            }
        });
    }
}