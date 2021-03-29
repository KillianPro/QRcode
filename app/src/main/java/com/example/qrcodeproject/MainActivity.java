package com.example.qrcodeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {

    TextInputEditText TextUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextUsername = findViewById(R.id.username);

        String username = String.valueOf(TextUsername.getText());
       
    }
}