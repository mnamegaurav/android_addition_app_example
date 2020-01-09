package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.tnum1);
        num2 = (EditText)findViewById(R.id.tnum2);
        add = (Button)findViewById(R.id.tadd);
        result = (TextView)findViewById(R.id.tresult);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1=0,n2=0,sum=0;

                if (num1.getText().toString().equals(".")){
//                    num1.setError("Invalid Number");
                    n2 = Double.parseDouble(num2.getText().toString());
                }
                else if(num2.getText().toString().equals(".")) {
//                    num2.setError("Invalid Number");
                    n1 = Double.parseDouble(num1.getText().toString());

                }
                else if (num1.length() == 0 && num2.length() == 0) {
                    num1.setError("Can not be blank");
                    num2.setError("Can not be blank");
                }
                else if (num1.length() == 0) {
                    num1.setError("Can not be blank");
                }
                else if (num2.length() == 0) {
                    num2.setError("Can not be blank");
                }
                else{
                    n1 = Double.parseDouble(num1.getText().toString());
                    n2 = Double.parseDouble(num2.getText().toString());
                }
                sum = n1 + n2;
                result.setText("Result : " + String.valueOf(sum));
            }
        });
    }
}
