package com.example.applicationpac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class calsyActivity extends AppCompatActivity {

    EditText num1,num2;
    Button plus,minus,mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calsy);
    }
}