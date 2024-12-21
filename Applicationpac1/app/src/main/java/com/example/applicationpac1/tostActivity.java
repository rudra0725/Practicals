package com.example.applicationpac1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class tostActivity extends AppCompatActivity {

    Button btn,btn2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tost);
        btn = findViewById(R.id.btn1);
        btn2 =findViewById(R.id.btn2);
        btn.setOnClickListener(v -> {
            Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show();
        });

        btn2.setOnClickListener( v -> {
            Toast.makeText(this, "Rudra 2.0", Toast.LENGTH_SHORT).show();
        });

    }
}