package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginScreen extends AppCompatActivity {

    private EditText etTakeInputEmail;
    private EditText etTakeInputPassword;
    private Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
      
        initialiseViewsAndListeners();
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isCredentialsValid()) {
                    Intent intent = new Intent(LoginScreen.this, MainPage_ConnectInstantly.class);
                    startActivity(intent);
                }

            }
        });

    }


    private void initialiseViewsAndListeners() {
        etTakeInputEmail = findViewById(R.id.et_LoginActivity_emailInput);
        etTakeInputPassword = findViewById(R.id.LoginActivity_Password);
        btnSignIn = findViewById(R.id.LoginScreen_button);

    }

    private boolean isCredentialsValid() {

        boolean isDataValid = true;

        if (!etTakeInputEmail.getText().toString().contains("@gmail.com")) {
            etTakeInputEmail.setError("Invalid Email ID");
            isDataValid = false;
        }
        if (etTakeInputPassword.getText().toString().length() < 5) {
            etTakeInputPassword.setError("Password length is less than 5 Characters");
            isDataValid = false;
        }
        return isDataValid;
    }
}