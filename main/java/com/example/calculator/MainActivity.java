// MainActivity.java
package com.example.calculator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText editText;
    String expression = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
    }
    public void onNumberClick(View view) {
        Button button = (Button) view;
        expression += button.getText().toString();
        editText.setText(expression);
    }
    public void onOperatorClick(View view) {
        Button button = (Button) view;
        expression += " " + button.getText().toString() + " ";
        editText.setText(expression);
    }
    public void onEqualClick(View view) {
        try {
            double result = evaluateExpression(expression);
            editText.setText(String.valueOf(result));
            expression = String.valueOf(result);
        } catch (Exception e) {
            editText.setText(String.valueOf("Error"));
            expression = "";
        }
    }
    public void onClearClick(View view) {
        editText.setText("");
        expression = "";
    }
    private double evaluateExpression(String expr) {
        String[] tokens = expr.split(" ");
        double result = Double.parseDouble(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            double secondValue = Double.parseDouble(tokens[i + 1]);
            switch (operator) {
                case "+": result += secondValue; break;
                case "-": result -= secondValue; break;
                case "*": result *= secondValue; break;
                case "/": result /= secondValue; break;
            }
        }
        return result;
    }
}