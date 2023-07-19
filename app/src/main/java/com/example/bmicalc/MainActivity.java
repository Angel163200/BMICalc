package com.example.bmicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSubmit(View v)
    {
        e1=(EditText) findViewById(R.id.et1);
        e2=(EditText) findViewById(R.id.et2);
        b1=(Button) findViewById(R.id.b1);
        t1=(TextView) findViewById(R.id.text1);
        int weight;
        float bmi=0,height;
        String val;
        String weightText = e1.getText().toString();
        String heightText = e2.getText().toString();
        weight=Integer.parseInt(weightText);
        height=Integer.parseInt(heightText);
        height=height/100;
        if(height==0 || weight==0)
        {
            Toast.makeText(this,"Enter the required data", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            bmi=weight/(height*height);
        }
//e2.setText(String.valueOf(height));
        if(bmi<18.5)
        {
//t1.setText(String.valueOf(bmi));
            val="BMI= "+bmi+"\nYou are underweight, please consult a Dietecian ";
            t1.setText(val);
        }
else if(bmi>18.5 && bmi<24.9)
        {
            val="BMI= "+bmi+"\nGreat, You follows a Healthy Diet";

            t1.setText(val);
        }
else if(bmi<25 && bmi>29.9)
        {
            val="BMI= "+bmi+ "\nYou are overweight, please consult a Dietecian";
            t1.setText(val);
        }
else
        {
            val="BMI= "+bmi+"\nYou are Obese, please consult a Dietecian";
            t1.setText(val);
        }
    }
}