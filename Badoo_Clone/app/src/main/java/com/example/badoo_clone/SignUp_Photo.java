package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp_Photo extends AppCompatActivity {

    private Button mbtnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__photo);

        mbtnContinue = findViewById(R.id.signUpPhoto_btnContinue);
        mbtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_Photo.this,SignUp_SetPassword.class);
                startActivity(intent);
            }
        });
    }
}