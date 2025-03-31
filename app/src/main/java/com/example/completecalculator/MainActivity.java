package com.example.completecalculator;

import android.app.Activity;
import android.nfc.Tag;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private String num1;
    private String op;
    private String num2;
    private int posNum2 = -1;
    private boolean isError = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickNumber(View view){
        String buttonTag = view.getTag().toString();
        EditText edit = findViewById(R.id.editText01);

        String text = edit.getText().toString();

        if(isError) {
            text = "";
            isError = false;
        }

        text = text.concat(buttonTag);
        edit.setText(text);
    }

    public void clickFactor(View view){
        String buttonTag = view.getTag().toString();
        EditText edit = findViewById(R.id.editText01);
        String text = edit.getText().toString();

        num1 = text;
        op = buttonTag;

        text = text.concat(buttonTag);
        edit.setText(text);

        posNum2 = text.length();
    }

    public void clickReset(View view){
        EditText edit = findViewById(R.id.editText01);
        edit.setText("");
    }

    public void clickEqual(View view){
        EditText edit = findViewById(R.id.editText01);
        String text = edit.getText().toString();
        num2 = text.substring(posNum2);

        if(!num1.isEmpty() && !op.isEmpty() && !num2.isEmpty()){
            switch (op) {
                case "+":
                    clickButtonAdd(view, Double.parseDouble(num1), Double.parseDouble(num2));
                    break;
                case "-":
                    clickButtonMinus(view, Double.parseDouble(num1), Double.parseDouble(num2));
                    break;
                case "*":
                    clickButtonMult(view, Double.parseDouble(num1), Double.parseDouble(num2));
                    break;
                default:
                    clickButtonDiv(view, Double.parseDouble(num1), Double.parseDouble(num2));
                    break;
            }
        }
    }

    public void clickButtonAdd(View view, double value1, double value2){
        EditText edit = findViewById(R.id.editText01);
        double sum = value1 + value2;

        String result = Double.toString(sum);
        num1 = result;

        edit.setText(result);
    }

    public void clickButtonMinus(View view, Double value1, Double value2){
        EditText edit = findViewById(R.id.editText01);
        double sub = value1 - value2;

        String result = Double.toString(sub);
        num1 = result;

        edit.setText(result);
    }

    public void clickButtonMult(View view, Double value1, Double value2){
        EditText edit = findViewById(R.id.editText01);
        double mul = value1 * value2;

        String result = Double.toString(mul);
        num1 = result;

        edit.setText(result);
    }

    public void clickButtonDiv(View view, Double value1, Double value2){
        EditText edit = findViewById(R.id.editText01);

        if(value2 == 0.0){
            edit.setText("ERROR");
            isError = true;
            return;
        }

        double div = value1 / value2;
        String result = Double.toString(div);
        num1 = result;

        edit.setText(result);
    }
}