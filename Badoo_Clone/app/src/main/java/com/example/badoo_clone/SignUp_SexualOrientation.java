package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignUp_SexualOrientation extends AppCompatActivity {

    private TextView signUp_mTvNext;
    private TextView signUp_mTvPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__sexual_orientation);
        signUp_mTvNext=findViewById(R.id.signUp_tvNext);
        signUp_mTvPrevious=findViewById(R.id.signUp_tvPrevious);
        signUp_mTvNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_SexualOrientation.this,SignUp_RelationshipStatus.class);
                startActivity(intent);
            }
        });
        signUp_mTvPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_SexualOrientation.this,SignUp_Motive.class);
                startActivity(intent);
            }
        });
    }
}