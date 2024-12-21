package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class fisrtActivity extends AppCompatActivity {

    Button btnNext;
    EditText ed1,ed2,ed3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisrt);

        btnNext=findViewById(R.id.btnNext);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        ed3=findViewById(R.id.ed3);
        btnNext.setOnClickListener(view -> {
        String name=ed1.getText().toString().trim();
        String pass=ed2.getText().toString().trim();
        String age=ed3.getText().toString().trim();
            Intent i1=new Intent(this,secondActivity.class);
            i1.putExtra("NAME",name);
            i1.putExtra("PASS",pass);
            i1.putExtra("AGE",age);
            startActivity(i1);
        });
    }
}