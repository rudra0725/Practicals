package com.example.applicationpac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class hwageActivity extends AppCompatActivity {

    Button agebutton;
    TextView ageshow;
    EditText inputage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hwage);

        agebutton=findViewById(R.id.agebutton);
        ageshow=findViewById(R.id.ageshow);
        inputage=findViewById(R.id.inputage);

        agebutton.setOnClickListener(v ->{
            String age=inputage.getText().toString();
            ageshow.setText("Your age is" +age);
            Toast.makeText(this, age, Toast.LENGTH_SHORT).show();
            inputage.setText("");
        });
    }
}