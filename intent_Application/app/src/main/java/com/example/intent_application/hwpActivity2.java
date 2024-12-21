package com.example.intent_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class hwpActivity2 extends AppCompatActivity {

    TextView tvUname,tvAge,tvConno,tvEmail,tvPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hwp2);

        tvUname=findViewById(R.id.tvUname);
        tvAge=findViewById(R.id.tvAge);
        tvConno=findViewById(R.id.tvConno);
        tvEmail=findViewById(R.id.tvEmail);
        tvPass=findViewById(R.id.tvPass);

        Intent intent=getIntent();
        tvUname.setText(intent.getStringExtra("Uname"));
        tvAge.setText(intent.getStringExtra("Age"));
        tvConno.setText(intent.getStringExtra("Conno"));
        tvEmail.setText(intent.getStringExtra("Email"));
        tvPass.setText(intent.getStringExtra("Pass"));
    }
}