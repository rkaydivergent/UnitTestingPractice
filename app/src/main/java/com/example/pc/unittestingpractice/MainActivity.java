package com.example.pc.unittestingpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultTxt;
    EditText txt1, txt2;
    String input1, input2;
    Float divisor, dividend, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (EditText) findViewById(R.id.editText);
        txt2 = (EditText) findViewById(R.id.editText2);
        resultTxt= (TextView)findViewById(R.id.textView);

    }

    public void calc (View view){
        input1 = txt1.getText().toString();
        divisor = Float.parseFloat(input1);
        input2 = txt2.getText().toString();
        dividend  = Float.parseFloat(input2);
        if (dividend == 0 ) {
            resultTxt.setText("You cannot divide by zero");
        }
            else {
            divide (divisor, dividend);
            }
        

}
    public float divide (float a, float b){
        result = a/b;
        resultTxt.setText(String.valueOf(result));
        return result;
    }

}
