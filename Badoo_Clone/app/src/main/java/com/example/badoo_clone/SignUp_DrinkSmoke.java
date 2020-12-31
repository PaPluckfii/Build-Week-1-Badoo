package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignUp_DrinkSmoke extends AppCompatActivity {

    private TextView drink_mTvNext;
    private TextView drink_mTvPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__drink_smoke);
        drink_mTvNext=findViewById(R.id.drink_tvNext);
        drink_mTvPrevious=findViewById(R.id.drink_tvPrevious);
        drink_mTvNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_DrinkSmoke.this,SignUp_Finish.class);
                startActivity(intent);
            }
        });
        drink_mTvPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_DrinkSmoke.this,SignUp_RelationshipStatus.class);
                startActivity(intent);
            }
        });
    }
}