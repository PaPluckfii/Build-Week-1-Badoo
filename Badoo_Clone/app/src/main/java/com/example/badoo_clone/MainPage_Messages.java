package com.example.badoo_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage_Messages extends AppCompatActivity {

    private Button message_mBtnLocation;
    private Button message_mBtnCardsProfile;
    private Button message_mBtnMyProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page__messages);

        message_mBtnLocation=findViewById(R.id.message_btnLocation);
        message_mBtnCardsProfile=findViewById(R.id.message_btnCardsProfile);
        message_mBtnMyProfile=findViewById(R.id.message_btnMyProfile);

        message_mBtnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        message_mBtnCardsProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage_Messages.this,MainPage_ProfileView.class);
                startActivity(intent);

            }
        });
        message_mBtnMyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage_Messages.this,MainPage_ProfileSelf.class);
                startActivity(intent);
            }
        });
    }
}