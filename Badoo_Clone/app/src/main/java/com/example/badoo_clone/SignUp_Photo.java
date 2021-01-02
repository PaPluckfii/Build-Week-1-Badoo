package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp_Photo extends AppCompatActivity {


    private Button signUpPhoto_mBtnContinue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__photo);

        signUpPhoto_mBtnContinue=findViewById(R.id.signUpPhoto_btnContinue);
        signUpPhoto_mBtnContinue.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_Photo.this,SignUp_SetPassword.class);
                startActivity(intent);
            }
        });
    }
}