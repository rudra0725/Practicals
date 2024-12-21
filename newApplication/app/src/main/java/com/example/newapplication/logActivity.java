package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class logActivity extends AppCompatActivity {

    TextView tvtuname,tvtpass,tvtemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

       tvtuname=findViewById(R.id.tvtuname);
        tvtpass=findViewById(R.id.tvtpass);
        tvtemail=findViewById(R.id.tvtemail);

        String uname=getIntent().getStringExtra("uname");
        String pass=getIntent().getStringExtra("pass");
        String email=getIntent().getStringExtra("email");

        tvtuname.setText(uname);
        tvtpass.setText(pass);
        tvtemail.setText(email);

    }
}