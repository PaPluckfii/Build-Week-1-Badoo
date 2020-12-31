package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp_UploadPicture extends AppCompatActivity {
    private Button signUpUpload_mBtnUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__upload_picture);
        signUpUpload_mBtnUpload=findViewById(R.id.signUpUpload_btnUpload);
        signUpUpload_mBtnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_UploadPicture.this,SignUp_CommunityGuidlines.class);
                startActivity(intent);
            }
        });
    }
}