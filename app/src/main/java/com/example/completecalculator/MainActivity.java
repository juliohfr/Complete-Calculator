package com.example.completecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void clickButtonAdd(View view){
//        EditText edit1 = (EditText) findViewById(R.id.editText01)
//
//        String value1 = edit1.getText().toString();
//        if(value1.isEmpty()) {
//            value1 = "0.0";
//        }
//
//        String value2 = edit2.getText().toString();
//        if(value2.isEmpty()) {
//            value2 = "0.0";
//        }
//
//        Double number1 = Double.valueOf(value1);
//        Double number2 = Double.valueOf(value2);
//        Double sum = number1 + number2;
//
//        result.setText("O Resultado é: " + sum.toString());
//    }
//
//    public void clickButtonMinus(View view){
//        EditText edit1 = (EditText) findViewById(R.id.editText01);
//        EditText edit2 = (EditText) findViewById(R.id.editText02);
//        TextView result = (TextView) findViewById(R.id.textView04);
//
//        String value1 = edit1.getText().toString();
//        if(value1.isEmpty()) {
//            value1 = "0.0";
//        }
//
//        String value2 = edit2.getText().toString();
//        if(value2.isEmpty()) {
//            value2 = "0.0";
//        }
//
//        Double number1 = Double.valueOf(value1);
//        Double number2 = Double.valueOf(value2);
//        Double sub = number1 - number2;
//
//        result.setText("O Resultado é: " + sub.toString());
//    }
//
//    public void clickButtonMult(View view){
//        EditText edit1 = (EditText) findViewById(R.id.editText01);
//        EditText edit2 = (EditText) findViewById(R.id.editText02);
//        TextView result = (TextView) findViewById(R.id.textView04);
//
//        String value1 = edit1.getText().toString();
//        if(value1.isEmpty()) {
//            value1 = "0.0";
//        }
//
//        String value2 = edit2.getText().toString();
//        if(value2.isEmpty()) {
//            value2 = "0.0";
//        }
//
//        Double number1 = Double.valueOf(value1);
//        Double number2 = Double.valueOf(value2);
//        Double mul = number1 * number2;
//
//        result.setText("O Resultado é: " + mul.toString());
//    }
//
//    public void clickButtonDiv(View view){
//        EditText edit1 = (EditText) findViewById(R.id.editText01);
//        EditText edit2 = (EditText) findViewById(R.id.editText02);
//        TextView result = (TextView) findViewById(R.id.textView04);
//
//        String value1 = edit1.getText().toString();
//        if(value1.isEmpty()) {
//            value1 = "0.0";
//        }
//
//        String value2 = edit2.getText().toString();
//        if(value2.isEmpty()) {
//            result.setText("Não é possível realizar divisão por 0.");
//            return;
//        }
//
//        Double number1 = Double.valueOf(value1);
//        Double number2 = Double.valueOf(value2);
//
//        if(number2 == 0.0){
//            result.setText("Não é possível realizar divisão por 0.");
//            return;
//        }
//
//        Double div = number1/number2;
//        result.setText("O Resultado é: " + div.toString());
//    }
}