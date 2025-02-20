package com.example.arithmetic;
import android.view.*;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText num1, num2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
    }
    public void add(View view) {
        String input1 = num1.getText().toString();
        String input2 = num2.getText().toString();
        double n1 = Double.parseDouble(input1);
        double n2 = Double.parseDouble(input2);
        double sum = n1+n2;
        result.setText("Sum : "+sum);
    } public void sub(View view) {
        String input1 = num1.getText().toString();
        String input2 = num2.getText().toString();
        double n1 = Double.parseDouble(input1);
        double n2 = Double.parseDouble(input2);
        double sum = n1-n2;
        result.setText("Sum : "+sum);
    }public void mul(View view) {
        String input1 = num1.getText().toString();
        String input2 = num2.getText().toString();
        double n1 = Double.parseDouble(input1);
        double n2 = Double.parseDouble(input2);
        double sum = n1*n2;
        result.setText("Sum : "+sum);
    }public void div(View view) {
        String input1 = num1.getText().toString();
        String input2 = num2.getText().toString();
        double n1 = Double.parseDouble(input1);
        double n2 = Double.parseDouble(input2);
        double sum = n1/n2;
        result.setText("Sum : "+sum);
    }
}