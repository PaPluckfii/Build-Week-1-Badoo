package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp_SetPassword extends AppCompatActivity {

    private EditText mEt_Password;
    private Button mBtn_LetsGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__set_password);
        mEt_Password=findViewById(R.id.et_password);
        mBtn_LetsGo=findViewById(R.id.btn_letsGo);
        mBtn_LetsGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isCredentialsValid()){
                    Intent intent = new Intent(SignUp_SetPassword.this,SignUp_CommunityGuidlines.class);
                    startActivity(intent);
                }
            }
        });


    }
    private boolean isCredentialsValid(){
        boolean isDataValid=true;
        if(mEt_Password.getText().toString().isEmpty()){
            mEt_Password.setError("enter password");
            isDataValid=false;
        }
        return isDataValid;
    }
}