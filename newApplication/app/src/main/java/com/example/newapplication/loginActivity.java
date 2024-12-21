package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;

public class loginActivity extends AppCompatActivity {

    Button btnsub;
    EditText edUname,edPass,edAge,edConno,edEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        btnsub=findViewById(R.id.btnsub);
        edUname=findViewById(R.id.edUname);
        edPass=findViewById(R.id.edPass);
        edAge=findViewById(R.id.edAge);
        edConno=findViewById(R.id.edConno);
        edEmail=findViewById(R.id.edEmail);

        btnsub.setOnClickListener(view -> {
            String Uname=edUname.getText().toString().trim();
            String Pass=edPass.getText().toString().trim();
            String Age=edAge.getText().toString().trim();
            String Conno=edConno.getText().toString().trim();
            String Email=edEmail.getText().toString().trim();

            Intent i1=new Intent(this,secondActivity.class);
            i1.putExtra("UNAME",Uname);
            i1.putExtra("PASS",Pass);
            i1.putExtra("AGE",Age);
            i1.putExtra("CONNO",Conno);
            i1.putExtra("EMAIL",Email);
            startActivity(i1);
        });

    }
}