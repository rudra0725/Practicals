package com.example.applicationpac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class nameActivity extends AppCompatActivity {

    EditText inputText;
    Button button1;
    TextView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        //code strat  here

        text1=findViewById(R.id.text1);
        button1=findViewById(R.id.button1);
        inputText=findViewById(R.id.inputText);

        button1.setOnClickListener( v ->{
            String name=inputText.getText().toString();
            text1.setText("The name is"+name);
            Toast.makeText(this,name, Toast.LENGTH_SHORT).show();
            inputText.setText("");
        });
    }
}