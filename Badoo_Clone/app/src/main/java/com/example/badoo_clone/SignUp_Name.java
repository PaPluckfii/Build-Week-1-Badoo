package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp_Name extends AppCompatActivity {

    private  Button signUpName_mBtnContinue;
    private TextView signUpName_mtvRegisterUsingFacebook;
    private EditText signUpName_metUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__name);
        initializeViewAndButton();
        signUpName_mBtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isCredentialsValid()) {
                    Intent intent = new Intent(SignUp_Name.this, SignUp_Birthday.class);
                    startActivity(intent);
                }
            }
        });
        signUpName_mtvRegisterUsingFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp_Name.this, "This facility is not available now", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initializeViewAndButton(){
        signUpName_mBtnContinue=findViewById(R.id.signUpName_btnContinue);
        signUpName_mtvRegisterUsingFacebook=findViewById(R.id.signUpName_tvRegisterUsingFacebook);
        signUpName_metUserName=findViewById(R.id.signUpName_etUserName);
    }
    private boolean isCredentialsValid(){
        boolean isDataValid=true;
        if(signUpName_metUserName.getText().toString().isEmpty() || signUpName_metUserName.getText().toString().length()<6){
            signUpName_metUserName.setError("name should be minimum 6 charaecters");
            isDataValid=false;
        }
        return  isDataValid;
    }
}