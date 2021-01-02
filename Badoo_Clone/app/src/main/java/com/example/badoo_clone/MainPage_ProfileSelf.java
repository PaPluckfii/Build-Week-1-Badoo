package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainPage_ProfileSelf extends AppCompatActivity {

    private ImageButton myProfile_mBtnLocation;
    private ImageButton myProfile_mBtnCardsProfile;
    private ImageButton myProfile_mBtnMessages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page__profile_self);

        myProfile_mBtnLocation=findViewById(R.id.myProfile_btnLocation);
        myProfile_mBtnCardsProfile=findViewById(R.id.myProfile_btnCardsProfile);
        myProfile_mBtnMessages=findViewById(R.id.myProfile_btnMessages);

        myProfile_mBtnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage_ProfileSelf.this,MainPage_ConnectInstantly.class);
                startActivity(intent);
            }
        });
        myProfile_mBtnCardsProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage_ProfileSelf.this,MainPage_ProfileView.class);
                startActivity(intent);
            }
        });
        myProfile_mBtnMessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage_ProfileSelf.this,MainPage_Messages.class);
                startActivity(intent);
            }
        });
    }
}