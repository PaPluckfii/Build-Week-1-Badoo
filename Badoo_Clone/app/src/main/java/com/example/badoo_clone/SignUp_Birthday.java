package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp_Birthday extends AppCompatActivity {

    private Button signUpBirthday_mBtnContinue;
    private TextView signUpBirthday_mtvRegisterUsingFacebook;
    private EditText signUpBirthday_mEtDay;
    private EditText signUpBirthday_mEtMonth;
    private EditText signUpBirthday_mEtYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__birthday);
        initializeViewAndButton();
        signUpBirthday_mBtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isCredentialsValid()) {
                    Intent intent = new Intent(SignUp_Birthday.this, SignUp_Email.class);
                    startActivity(intent);
                }

            }
        });
        signUpBirthday_mtvRegisterUsingFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp_Birthday.this, "This feature is not available now", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void initializeViewAndButton(){
        signUpBirthday_mBtnContinue=findViewById(R.id.signUpBirthday_btnContinue);
        signUpBirthday_mtvRegisterUsingFacebook=findViewById(R.id.signUpBirthday_tvRegisterUsingFacebook);
        signUpBirthday_mEtDay=findViewById(R.id.signUpBirthday_etDay);
        signUpBirthday_mEtMonth=findViewById(R.id.signUpBirthday_etMonth);
        signUpBirthday_mEtYear=findViewById(R.id.signUpBirthday_etYear);
    }
    private boolean isCredentialsValid(){
        boolean isDataValid=true;
        if(signUpBirthday_mEtDay.getText().toString().isEmpty() || signUpBirthday_mEtDay.getText().toString().length()!=2){
            signUpBirthday_mEtDay.setError("invalid date");
            isDataValid=false;
        }
        if(signUpBirthday_mEtMonth.getText().toString().isEmpty() || signUpBirthday_mEtMonth.getText().toString().length()!=2) {
            signUpBirthday_mEtMonth.setError("invalid month");
            isDataValid = false;
        }
                if (signUpBirthday_mEtYear.getText().toString().isEmpty() || signUpBirthday_mEtYear.getText().toString().length()!=4) {
                    signUpBirthday_mEtYear.setError("invalid year");
                    isDataValid = false;
                }
                return isDataValid;
            }
        }