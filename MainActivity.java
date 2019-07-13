package com.calculatorFirstApplicationReleaseForTesting.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClickSum(View v)
    {
        EditText e1 = findViewById(R.id.editText_id_1);
        EditText e2 = findViewById(R.id.editText_id_2);
        TextView t1 = findViewById(R.id.editText_result);
        double num1 = Double.parseDouble(e1.getText().toString());
        double num2 = Double.parseDouble(e2.getText().toString());
        double sum = num1+num2;
        t1.setText(Double.toString(sum));
    }

    public void onButtonClickDifference(View v)
    {
        EditText e1 = findViewById(R.id.editText_id_1);
        EditText e2 = findViewById(R.id.editText_id_2);
        TextView t1 = findViewById(R.id.editText_result);
        double num1 = Double.parseDouble(e1.getText().toString());
        double num2 = Double.parseDouble(e2.getText().toString());
        double difference = num1-num2;
        t1.setText(Double.toString(difference));
    }

    public void onButtonClickMultiply(View v)
    {
        EditText e1 = findViewById(R.id.editText_id_1);
        EditText e2 = findViewById(R.id.editText_id_2);
        TextView t1 = findViewById(R.id.editText_result);
        double num1 = Double.parseDouble(e1.getText().toString());
        double num2 = Double.parseDouble(e2.getText().toString());
        double multiply = num1*num2;
        t1.setText(Double.toString(multiply));
    }

    public void onButtonClickDivide(View v)
    {
        EditText e1 = findViewById(R.id.editText_id_1);
        EditText e2 = findViewById(R.id.editText_id_2);
        TextView t1 = findViewById(R.id.editText_result);
        double num1 = Double.parseDouble(e1.getText().toString());
        double num2 = Double.parseDouble(e2.getText().toString());
        double divide = num1/num2;
        t1.setText(Double.toString(divide));
    }

    public void onButtonClickRemainder(View v)
    {
        EditText e1 = findViewById(R.id.editText_id_1);
        EditText e2 = findViewById(R.id.editText_id_2);
        TextView t1 = findViewById(R.id.editText_result);
        double num1 = Double.parseDouble(e1.getText().toString());
        double num2 = Double.parseDouble(e2.getText().toString());
        double rem = num1%num2;
        t1.setText(Double.toString(rem));
    }

    public void onButtonClickExponent(View v)
    {
        EditText e1 = findViewById(R.id.editText_id_1);
        EditText e2 = findViewById(R.id.editText_id_2);
        TextView t1 = findViewById(R.id.editText_result);
        double num1 = Double.parseDouble(e1.getText().toString());
        double num2 = Double.parseDouble(e2.getText().toString());
        double rem = Math.pow(num1, num2);
        t1.setText(Double.toString(rem));
    }

    public static double gcf(double num1, double num2)
    {
        if(num1 == 0)
        {
            return num2;
        }

        return gcf(num2%num1, num1);
    }

    public void onButtonClickGCF(View v)
    {
        EditText e1 = findViewById(R.id.editText_id_1);
        EditText e2 = findViewById(R.id.editText_id_2);
        TextView t1 = findViewById(R.id.editText_result);
        double num1 = Double.parseDouble(e1.getText().toString());
        double num2 = Double.parseDouble(e2.getText().toString());
        double rem = gcf(num1, num2);
        if(rem<0)
        {
            rem *= -1;
        }
        if(rem>-1 && rem<1)
        {
            rem = 1;
        }
        t1.setText(Double.toString(rem));
    }

    public void onButtonClickClear(View v)
    {
        EditText e1 = findViewById(R.id.editText_id_1);
        EditText e2 = findViewById(R.id.editText_id_2);
        TextView t1 = findViewById(R.id.editText_result);
        double num1 = 0.0;
        double num2 = 0.0;
        double rem = 0.0;
        t1.setText(Double.toString(rem));
        e1.setText(Double.toString(num1));
        e2.setText(Double.toString(num2));
    }

}




