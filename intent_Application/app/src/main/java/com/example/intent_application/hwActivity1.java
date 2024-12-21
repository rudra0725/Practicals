package com.example.intent_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class hwActivity1 extends AppCompatActivity {

    Button btnsub;
    EditText edUName,edAge,edConno,edEmail,edPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw2);

        btnsub.findViewById(R.id.btnsub);
        edUName.findViewById(R.id.edUname);
        edAge.findViewById(R.id.edAge);
        edConno.findViewById(R.id.edConno);
        edEmail.findViewById(R.id.edEmail);
        edPass.findViewById(R.id.edPass);

        btnsub.setOnClickListener(view -> {
            String Uname=edUName.getText().toString().trim();
            String Age=edAge.getText().toString().trim();
            String Conno=edConno.getText().toString().trim();
            String Email=edEmail.getText().toString().trim();
            String Pass=edPass.getText().toString().trim();
            Intent i1=new Intent(this,hwpActivity2.class);
            i1.putExtra("Uname",Uname);
            i1.putExtra("Age",Age);
            i1.putExtra("Conno",Conno);
            i1.putExtra("Email",Email);
            i1.putExtra("Pass",Pass);
            startActivity(i1);
        });

    }
}