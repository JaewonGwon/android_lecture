package com.example.tutorial1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public void addClick(View v) {

        EditText number1 = (EditText) findViewByld(R.id.number1) ;
        EditText number2 = (EditText) findViewByld(R.id.number2) ;
        TextView result = (TextView) findViewByld(R.id.result) ;
        int n1 = Integer.parseInt(number1.getText().toString()) ;
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1 + n2));
    }
    public void subtractClick(View v) {
        EditText number1 =(EditText) findViewByld (R.id.number1);
        EditText number2 =(EditText) findViewByld (R.id.number2);
        TextView result =(TextView) findViewByld (R.id.result);
        int n1 = Integer . parseInt (number1.getText().toString());
        int n2 = Integer . parseInt (number2.getText().toString());
        result.setText(Integer.toString(n1 - n2));
    }
    public void multiplyClick(View v) {
        EditText number1 =(EditText) findViewByld (R.id.number1);
        EditText number2 =(EditText) findViewByld (R.id.number2);
        TextView result =(TextView) findViewByld (R.id.result);
        int n1 = Integer . parseInt (number1.getText().toString());
        int n2 = Integer . parseInt (number2.getText().toString());
        result.setText(Integer.toString(n1 * n2));
    }
    public void divideClick(View v) {
        EditText number1 =(EditText) findViewByld (R.id.number1);
        EditText number2 =(EditText) findViewByld (R.id.number2);
        TextView result =(TextView) findViewByld (R.id.result);
        int n1 = Integer . parseInt (number1.getText().toString());
        int n2 = Integer . parseInt (number2.getText().toString());
        result.setText(Integer.toString(n1 / n2));
    }
}