package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView groupcard, notificationcard, messagecard, uploadcard, usercard, searchcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        groupcard = (CardView) findViewById(R.id.group_card);
        notificationcard = (CardView) findViewById(R.id.notification_card);
        messagecard = (CardView) findViewById(R.id.message_card);
        uploadcard = (CardView) findViewById(R.id.upload_card);
        usercard = (CardView) findViewById(R.id.user_card);
        searchcard = (CardView) findViewById(R.id.search_card);
        //add on click
        groupcard.setOnClickListener(this);
        notificationcard.setOnClickListener(this);
        messagecard.setOnClickListener(this);
        uploadcard.setOnClickListener(this);
        usercard.setOnClickListener(this);
        searchcard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.group_card:
                i = new Intent(this, group.class);
                startActivity(i);
                break;
            case R.id.notification_card:
                i = new Intent(this, notification.class);
                startActivity(i);
                break;
            case R.id.message_card:
                i = new Intent(this, message.class);
                startActivity(i);
                break;
            case R.id.upload_card:
                i = new Intent(this, upload.class);
                startActivity(i);
                break;
            case R.id.user_card:
                i = new Intent(this, user.class);
                startActivity(i);
                break;
            case R.id.search_card:
                i = new Intent(this, search.class);
                startActivity(i);
                break;
            default:
                break;


        }
    }
}