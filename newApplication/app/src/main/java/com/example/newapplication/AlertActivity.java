package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AlertActivity extends AppCompatActivity {

    Button btnLog;
    EditText edtUname,edtPass,edtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        btnLog=findViewById(R.id.btnLog);
        edtUname=findViewById(R.id.edtUname);
        edtPass=findViewById(R.id.edtPass);
        edtEmail=findViewById(R.id.edtEmail);

        btnLog.setOnClickListener(view -> {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setTitle("Login")
                    .setMessage("are you sure login")
                    .setPositiveButton("YES",(dialogInterface, i) -> {


                        String name=edtUname.getText().toString().trim();
                        String pass=edtPass.getText().toString().trim();
                        String email=edtEmail.getText().toString().trim();

                        Intent i1=new Intent(this, logActivity.class);
                        i1.putExtra("uname",name);
                        i1.putExtra("pass",pass);
                        i1.putExtra("email",email);
                        startActivity(i1);
                    })
                    .setNegativeButton("NOO",(dialogInterface, i) -> {
                        //Toast.makeText(this, "NO LOGIN", Toast.LENGTH_SHORT).show();
                        edtUname.setText("");
                        edtPass.setText("");
                        edtEmail.setText("");
                    })
                    .show();

        });
    }
}