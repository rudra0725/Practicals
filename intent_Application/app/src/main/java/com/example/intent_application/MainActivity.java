package com.example.intent_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnNext;

    EditText etName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNext=findViewById(R.id.btnNext);
        etName=findViewById(R.id.etName);

        btnNext.setOnClickListener(v -> {
            String name= etName.getText().toString().trim();
            Intent i1=new Intent(this,secondActivity.class);
            i1.putExtra("NAME",name);
            startActivity(i1);
        });
    }
}