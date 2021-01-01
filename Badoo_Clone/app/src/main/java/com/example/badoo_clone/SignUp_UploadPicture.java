package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUp_UploadPicture extends AppCompatActivity {
    private Button signUpUpload_mBtnSkip;
    private TextView SignUpUpload_mTvPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__upload_picture);
        signUpUpload_mBtnSkip=findViewById(R.id.signUpUpload_btnSkip);
        SignUpUpload_mTvPhoto=findViewById(R.id.SignUpUpload_tvphoto);
        signUpUpload_mBtnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_UploadPicture.this,SignUp_SetPassword.class);
                startActivity(intent);
            }
        });
        SignUpUpload_mTvPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_UploadPicture.this,SignUp_Photo.class);
                startActivity(intent);
            }
        });
    }
}