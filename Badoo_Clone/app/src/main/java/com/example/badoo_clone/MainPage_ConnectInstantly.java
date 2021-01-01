package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage_ConnectInstantly extends AppCompatActivity {

    private Button connectInstantly_mBtnMessages;
    private Button connectInstantly_mBtnCardsProfile;
    private Button connectInstantly_mBtnMyProfile;
    private Button connectInstantly_mBtnLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page__connect_instantly);
        connectInstantly_mBtnLocation=findViewById(R.id.connectInstantly_btnLocation);
        connectInstantly_mBtnCardsProfile = findViewById(R.id.connectInstantly_btnCardsProfile);
        connectInstantly_mBtnMessages = findViewById(R.id.connectInstantly_btnMessages);
        connectInstantly_mBtnMyProfile = findViewById(R.id.connectInstantly_btnMyProfile);

        connectInstantly_mBtnMessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage_ConnectInstantly.this, MainPage_Messages.class);
                startActivity(intent);
            }
        });
        connectInstantly_mBtnMyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage_ConnectInstantly.this, MainPage_ProfileSelf.class);
                startActivity(intent);
            }
        });
        connectInstantly_mBtnCardsProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage_ConnectInstantly.this, MainPage_ProfileView.class);
                startActivity(intent);
            }
        });


    }

}