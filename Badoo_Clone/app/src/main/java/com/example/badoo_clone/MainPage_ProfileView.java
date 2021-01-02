package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.VideoView;

public class MainPage_ProfileView extends AppCompatActivity {

    private ImageButton profileView_mBtnMessages;
    private ImageButton profileView_mBtnMyProfile;
    private ImageButton profileView_mBtnLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page__profile_view);

        profileView_mBtnLocation= findViewById(R.id.profileView_btnLocation);
        profileView_mBtnMessages= findViewById(R.id.profileView_btnMessages);
        profileView_mBtnMyProfile= findViewById(R.id.profileView_btnMyProfile);

        profileView_mBtnMessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage_ProfileView.this,MainPage_Messages.class);
                startActivity(intent);
            }
        });
        profileView_mBtnMyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage_ProfileView.this,MainPage_ProfileSelf.class);
                startActivity(intent);
            }
        });
        profileView_mBtnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage_ProfileView.this,MainPage_ConnectInstantly.class);
                startActivity(intent);
            }
        });
    }
}