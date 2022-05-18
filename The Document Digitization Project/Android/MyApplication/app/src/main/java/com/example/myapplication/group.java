package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class group extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        Button cancel_button = findViewById(R.id.cancel_button);
        Button create_button = findViewById(R.id.create_button);

        cancel_button.setOnClickListener(this);
        create_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cancel_button:
                Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show();
                break;
            case R.id.create_button:
                Toast.makeText(this, "Create", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}