package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp_CommunityGuidlines extends AppCompatActivity {
    private Button signUpCommunity_mBtnIaccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__community_guidlines);
        signUpCommunity_mBtnIaccept=findViewById(R.id.signUpCommunity_btnIaccept);
        signUpCommunity_mBtnIaccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_CommunityGuidlines.this,SignUp_Motive.class);
                startActivity(intent);
            }
        });
    }
}