package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mainActivity_mBtnMale;
    private Button mainActivity_mBtnFemale;
    private Button mainActivity_mBtnMoreChoices;
    private Button mainActivity_mBtnFacebook;

    private TextView mainActivity_mTvSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViewAndButton();
        mainActivity_mBtnMale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,SignUp_Name.class);
               startActivity(intent);
            }
        });
        mainActivity_mBtnFemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SignUp_Name.class);
                startActivity(intent);
            }
        });
        mainActivity_mBtnMoreChoices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This facility is not available now", Toast.LENGTH_SHORT).show();

            }
        });
        mainActivity_mBtnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This facility is not available now", Toast.LENGTH_SHORT).show();
            }
        });
        mainActivity_mTvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,LoginScreen.class);
                startActivity(intent);
            }
        });

    }

    private void initializeViewAndButton(){
        mainActivity_mBtnMale=findViewById(R.id.mainActivity_btnMale);
        mainActivity_mBtnFemale=findViewById(R.id.mainActivity_btnFemale);
        mainActivity_mBtnMoreChoices=findViewById(R.id.mainActivity_btnMoreChoices);
        mainActivity_mBtnFacebook=findViewById(R.id.mainActivity_btnFacebook);
        mainActivity_mTvSignIn=findViewById(R.id.mainActivity_tvSignIn);
    }
}