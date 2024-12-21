package com.example.intent_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    Button btnPrev;

    TextView tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnPrev=findViewById(R.id.btnPrev);
        tvName=findViewById(R.id.tvName);

        Intent intent=getIntent();
       // String name =intent.getStringExtra("NAME");
        tvName.setText(intent.getStringExtra("NAME"));

        btnPrev.setOnClickListener(v -> {
            Intent i2=new Intent(this,MainActivity.class);
            startActivity(i2);

        });
    }
}