package com.example.applicationpac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculaterActivity extends AppCompatActivity {

    Button btnsum,btnmin,btnmul,btndiv;
    EditText txtnum1,txtnum2;
    TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculater);

        btnsum=findViewById(R.id.btnsum);
        btnmin=findViewById(R.id.btnmin);
        btnmul=findViewById(R.id.btnmul);
        btndiv=findViewById(R.id.btndiv);
        txtnum1=findViewById(R.id.txtnum1);
        txtnum2=findViewById(R.id.txtnum2);
        txtresult=findViewById(R.id.txtresult);


        btnsum.setOnClickListener( v->{
            String num1=txtnum1.getText().toString();
            String num2=txtnum2.getText().toString();

            if(TextUtils.isEmpty(num1)){
                Toast.makeText(this, "Please Enter no1", Toast.LENGTH_SHORT).show();
                txtnum1.setError("Please Enter No1");
            }else if(TextUtils.isEmpty(num2)){
                Toast.makeText(this, "Please Enter no2", Toast.LENGTH_SHORT).show();
                txtnum2.setError("Please Enter No2");
            }else {
                int i=Integer.parseInt(num1);
                int j=Integer.parseInt(num2);
                int res=i+j;
                txtresult.setText(res+"");
                txtresult.setText(String.valueOf(res));
            }
        });

        btnmin.setOnClickListener(view -> {
            String num1=txtnum1.getText().toString();
            String num2=txtnum2.getText().toString();

            if(TextUtils.isEmpty(num1)){
                Toast.makeText(this, "Please Enter no1 ", Toast.LENGTH_SHORT).show();
                txtnum1.setError("Please Enter no1");
            }else if(TextUtils.isEmpty(num2)){
                Toast.makeText(this, "Please Enter no2", Toast.LENGTH_SHORT).show();
                txtnum2.setError("Please entero no2");
            }else{
                int i=Integer.parseInt(num1);
                int j=Integer.parseInt(num2);
                int res= i-j;
                txtresult.setText(res+"");
                txtresult.setText(String.valueOf(res));
            }
        });


        btnmul.setOnClickListener(view -> {
            String num1=txtnum1.getText().toString();
            String num2=txtnum2.getText().toString();

            if(TextUtils.isEmpty(num1)){
                Toast.makeText(this, "Please Enter no1 ", Toast.LENGTH_SHORT).show();
                txtnum1.setError("Please Enter no1");
            }else if(TextUtils.isEmpty(num2)){
                Toast.makeText(this, "Please Enter no2", Toast.LENGTH_SHORT).show();
                txtnum2.setError("Please entero no2");
            }else{
                int i=Integer.parseInt(num1);
                int j=Integer.parseInt(num2);
                int res= i*j;
                txtresult.setText(res+"");
                txtresult.setText(String.valueOf(res));
            }
        });



        btndiv.setOnClickListener(view -> {
            String num1=txtnum1.getText().toString();
            String num2=txtnum2.getText().toString();

            if(TextUtils.isEmpty(num1)){
                Toast.makeText(this, "Please Enter no1 ", Toast.LENGTH_SHORT).show();
                txtnum1.setError("Please Enter no1");
            }else if(TextUtils.isEmpty(num2)){
                Toast.makeText(this, "Please Enter no2", Toast.LENGTH_SHORT).show();
                txtnum2.setError("Please entero no2");
            }else{
                int i=Integer.parseInt(num1);
                int j=Integer.parseInt(num2);
                int res= i/j;
                txtresult.setText(res+"");
                txtresult.setText(String.valueOf(res));
            }
        });
    }
}