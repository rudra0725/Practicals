package com.example.newapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class alertdailogActivity extends AppCompatActivity {

    Button btnalert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alertdailog);

        btnalert=findViewById(R.id.btnalert);

        btnalert.setOnClickListener(view -> {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setTitle("Exit")
                    .setMessage("Are you sure?")
                    .setPositiveButton("YES",(dialogInterface, i) -> {
                        finish();
                        Toast.makeText(this, "Yesss Button Clickedz", Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeButton("NO",(dialogInterface, i) -> {
                        Toast.makeText(this, "NOO Button Clicked", Toast.LENGTH_SHORT).show();
                    })
                    .show();
        });
    }
}