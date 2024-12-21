package com.example.applicationpac1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class hwtostActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hwtost);

        btn1= findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);

        btn1.setOnClickListener(v -> {
            Toast.makeText(this, "Rudra", Toast.LENGTH_SHORT).show();
        });

        btn2.setOnClickListener( v ->{
            Toast.makeText(this, "Santoshi", Toast.LENGTH_SHORT).show();
        });

        btn3.setOnClickListener( v->{
            Toast.makeText(this, "Mayushi", Toast.LENGTH_SHORT).show();
        });

        btn4.setOnClickListener( v->{
            Toast.makeText(this, "Richa", Toast.LENGTH_SHORT).show();
        });
    }
}