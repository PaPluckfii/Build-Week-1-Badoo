package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp_Email extends AppCompatActivity {

    private Button signUpEmail_mBtnContinue;
    private TextView signUpEmail_mTvRegisterUsingFacebook;
    private EditText signUpEmail_metUserEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__email);
        initializeViewAndButton();
        signUpEmail_mBtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isCredentialsValid()) {
                    Intent intent = new Intent(SignUp_Email.this, SignUp_UploadPicture.class);
                    startActivity(intent);
                }
            }
        });
        signUpEmail_mTvRegisterUsingFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp_Email.this, "This feature is not available now", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initializeViewAndButton(){
        signUpEmail_mBtnContinue=findViewById(R.id.signUpEmail_btnContinue);
        signUpEmail_mTvRegisterUsingFacebook=findViewById(R.id.signUpEmail_tvRegisterUsingFacebook);
        signUpEmail_metUserEmail=findViewById(R.id.signUpEmail_etUserEmail);
    }
    private boolean isCredentialsValid() {
        boolean isDataValid = true;
        if (!(signUpEmail_metUserEmail.getText().toString().contains("@gmail.com"))){
            signUpEmail_metUserEmail.setError("invalid email id");
            isDataValid = false;
        }
        return isDataValid;
    }
}