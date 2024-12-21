package com.example.applicationpac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class caleActivity extends AppCompatActivity {

    Button btsum,btsub,btmul,btdiv;
    EditText ed1,ed2;
    TextView tvres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cale);

        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        btsum=findViewById(R.id.btsum);
        btsub=findViewById(R.id.btsub);
        btmul=findViewById(R.id.btmul);
        btdiv=findViewById(R.id.btdiv);
        tvres=findViewById(R.id.tvres);

        btsum.setOnClickListener(view -> {
            String num1=ed1.getText().toString();
            String num2=ed2.getText().toString();

            if(TextUtils.isEmpty(num1)){
                Toast.makeText(this, "Please Enter no 1", Toast.LENGTH_SHORT).show();
                ed1.setError("Please enter no 1");
            } else if (TextUtils.isEmpty(num2)) {
                Toast.makeText(this, "Please Enter no 2", Toast.LENGTH_SHORT).show();
                ed2.setError("Please enter no 2");
            }else {
                int i=Integer.parseInt(num1);
                int j=Integer.parseInt(num2);
                int res=i+j;
                tvres.setText(res+"");
            }
        });

        btsub.setOnClickListener(view -> {
            String num1=ed1.getText().toString();
            String num2=ed2.getText().toString();

            if(TextUtils.isEmpty(num1)){
                Toast.makeText(this, "Please Enter no 1", Toast.LENGTH_SHORT).show();
                ed1.setError("Please enter no 1");
            } else if (TextUtils.isEmpty(num2)) {
                Toast.makeText(this, "Please Enter no 2", Toast.LENGTH_SHORT).show();
                ed2.setError("Please enter no 2");
            }else {
                int i=Integer.parseInt(num1);
                int j=Integer.parseInt(num2);
                int res=i-j;
                tvres.setText(res+"");
            }
        });

        btmul.setOnClickListener(view -> {
            String num1=ed1.getText().toString();
            String num2=ed2.getText().toString();

            if(TextUtils.isEmpty(num1)){
                Toast.makeText(this, "Please Enter no 1", Toast.LENGTH_SHORT).show();
                ed1.setError("Please enter no 1");
            } else if (TextUtils.isEmpty(num2)) {
                Toast.makeText(this, "Please Enter no 2", Toast.LENGTH_SHORT).show();
                ed2.setError("Please enter no 2");
            }else {
                int i=Integer.parseInt(num1);
                int j=Integer.parseInt(num2);
                int res=i*j;
                tvres.setText(res+"");
            }
        });

        btdiv.setOnClickListener(view -> {
            String num1=ed1.getText().toString();
            String num2=ed2.getText().toString();

            if(TextUtils.isEmpty(num1)){
                Toast.makeText(this, "Please Enter no 1", Toast.LENGTH_SHORT).show();
                ed1.setError("Please enter no 1");
            } else if (TextUtils.isEmpty(num2)) {
                Toast.makeText(this, "Please Enter no 2", Toast.LENGTH_SHORT).show();
                ed2.setError("Please enter no 2");
            }else {
                int i=Integer.parseInt(num1);
                int j=Integer.parseInt(num2);
                int res=i/j;
                tvres.setText(res+"");
            }
        });
    }
}