package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignUp_RelationshipStatus extends AppCompatActivity {

    private TextView relationship_mTvNext;
    private TextView relationship_mTvPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__relationship_status);
        relationship_mTvNext=findViewById(R.id.relationship_tvNext);
        relationship_mTvPrevious=findViewById(R.id.relationship_tvPrevious);
        relationship_mTvNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_RelationshipStatus.this,SignUp_DrinkSmoke.class);
                startActivity(intent);
            }
        });
        relationship_mTvPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_RelationshipStatus.this,SignUp_SexualOrientation.class);
                startActivity(intent);
            }
        });
    }
}