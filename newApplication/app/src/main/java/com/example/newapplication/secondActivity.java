package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    Button btnprv;
    TextView tv1,tv2,tv3,tv4,tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnprv=findViewById(R.id.btnprv);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);
        String Uname=getIntent().getStringExtra("NAME");
        String Pass=getIntent().getStringExtra("PASS");
        String Age=getIntent().getStringExtra("AGE");
        String Conno=getIntent().getStringExtra("CONNO");
        String Email=getIntent().getStringExtra("EMAIL");
        tv1.setText(Uname);
        tv2.setText(Pass);
        tv3.setText(Age);
        tv4.setText(Conno);
        tv5.setText(Email);
        Intent intent=getIntent();
        //intent.getStringExtra("NAME");
        btnprv.setOnClickListener(view -> {
            Intent i2=new Intent(this, loginActivity.class);
            startActivity(i2);
        });
    }
}