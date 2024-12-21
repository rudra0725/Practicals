package com.example.applicationpac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class nameageActivity extends AppCompatActivity {

    Button btnname,btnage;
    EditText txtname,txtage;
    TextView txtans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nameage);

        btnname=findViewById(R.id.btnname);
        btnage=findViewById(R.id.btnage);
        txtname=findViewById(R.id.txtname);
        txtage=findViewById(R.id.txtage);
        txtans=findViewById(R.id.txtans);

        btnname.setOnClickListener( v->{
            String name=txtname.getText().toString();
            txtans.setText("The name is"+name);
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        });

        btnage.setOnClickListener(v ->{
            String age =txtage.getText().toString();
            txtans.setText("The name is"+age);
            Toast.makeText(this, age, Toast.LENGTH_SHORT).show();
        });
    }
}