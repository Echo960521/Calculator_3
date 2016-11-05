package com.example.calculator_3;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TransformActivity extends AppCompatActivity {

    EditText e_li, e_m, e_qianmi, e_mile, e_foot, e_inch;
    String s_li, s_m, s_qianmi,   s_mile, s_foot, s_inch;
    Button b_li, b_m, b_qianmi,  b_mile, b_foot, b_inch, re, clear2,jin1;
    double d_li, d_m, d_qianmi,   d_mile, d_foot, d_inch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transform);

        b_li = (Button) findViewById(R.id.btn_li);
        b_m = (Button) findViewById(R.id.btn_m);
        b_qianmi = (Button) findViewById(R.id.btn_qianmi);
        b_mile = (Button) findViewById(R.id.btn_mile);
        b_foot = (Button) findViewById(R.id.btn_foot);
        b_inch = (Button) findViewById(R.id.btn_inch);
        re = (Button) findViewById(R.id.returnn);
        jin1 = (Button) findViewById(R.id.jin);
        clear2 = (Button) findViewById(R.id.clear2);
        e_li = (EditText) findViewById(R.id.et_li);
        e_m = (EditText) findViewById(R.id.et_m);
        e_qianmi = (EditText) findViewById(R.id.et_qianmi);
        e_mile = (EditText) findViewById(R.id.et_mile);
        e_foot = (EditText) findViewById(R.id.et_foot);
        e_inch = (EditText) findViewById(R.id.et_inch);

        re.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(TransformActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        jin1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(TransformActivity.this, Transform2.class);
                startActivity(intent);
            }
        });
        clear2.setOnClickListener((new View.OnClickListener() {
            public void onClick(View v) {
                e_li.setText("");
                e_m.setText("");
                e_qianmi.setText("");
                e_mile.setText("");
                e_foot.setText("");
                e_inch.setText("");
            }
        }));
        b_m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s_m = e_m.getText().toString();
                d_m = Double.parseDouble(s_m);
                d_li = d_m * 0.01;
                d_qianmi = d_m * 1000;
                d_mile = d_m * 0.00062137119;
                d_foot = d_m * 3.2808399;
                d_inch = d_m * 39.370079;
                //BigDecimal b = new BigDecimal(double_cmnew).setScale(6);

                e_li.setText(String.format("%.5f", d_li));
                e_qianmi.setText(String.format("%.5f", d_qianmi));
                e_mile.setText(String.format("%.5f", d_mile));
                e_foot.setText(String.format("%.5f", d_foot));
                e_inch.setText(String.format("%.5f", d_inch));
            }
        });
        b_li.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s_li = e_li.getText().toString();
                d_li = Double.parseDouble(s_li);

                d_m = d_li * 0.01;
                d_qianmi = d_li * 0.00001;
                d_mile = d_li * 0.0000062137119;
                d_foot = d_li * 0.032808399;
                d_inch = d_li * 0.39370079;
                //BigDecimal b = new BigDecimal(double_cmnew).setScale(6);

                e_m.setText(String.format("%.5f", d_m));
                e_qianmi.setText(String.format("%.3f", d_qianmi));
                e_mile.setText(String.format("%.5f", d_mile));
                e_foot.setText(String.format("%.5f", d_foot));
                e_inch.setText(String.format("%.5f", d_inch));
            }
        });

        b_qianmi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s_qianmi = e_qianmi.getText().toString();
                d_qianmi = Double.parseDouble(s_qianmi);

                d_m = d_qianmi * 0.0001;
                d_li = d_qianmi * 0.000001;
                d_mile = d_qianmi * 0.00000062137;
                d_foot = d_qianmi * 0.0032808399;
                d_inch = d_qianmi * 0.039370079;
                //BigDecimal b = new BigDecimal(double_cmnew).setScale(6);

                e_m.setText(String.format("%.5f", d_m));
                e_li.setText(String.format("%.5f", d_li));

                e_mile.setText(String.format("%.5f", d_mile));
                e_foot.setText(String.format("%.2f", d_foot));
                e_inch.setText(String.format("%.2f", d_inch));
            }
        });


        b_mile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                s_mile = e_mile.getText().toString();
                d_mile = Double.parseDouble(s_mile);

                d_m = d_mile * 1609.344;
                d_li = d_mile * 16.09344;
                d_qianmi = d_mile * 1609344;
                d_foot = d_mile * 5280;
                d_inch = d_mile * 63360;
                //BigDecimal b = new BigDecimal(double_cmnew).setScale(6);

                e_m.setText(String.format("%.3f", d_m));
                e_li.setText(String.format("%.5f", d_li));
                e_qianmi.setText(String.format("%.2f", d_qianmi));
                e_foot.setText(String.format("%.2f", d_foot));
                e_inch.setText(String.format("%.2f", d_inch));
            }
        });
        b_foot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s_foot = e_foot.getText().toString();
                d_foot = Double.parseDouble(s_foot);

                d_m = d_foot * 0.3048;
                d_li = d_foot * 0.003048;
                d_qianmi = d_foot * 304.8;
                d_mile = d_foot * 0.33333333;
                d_inch = d_foot * 12;
                //BigDecimal b = new BigDecimal(double_cmnew).setScale(6);

                e_m.setText(String.format("%.5f", d_m));
                e_li.setText(String.format("%.5f", d_li));
                e_qianmi.setText(String.format("%.5f", d_qianmi));
                e_mile.setText(String.format("%.5f", d_mile));
                e_inch.setText(String.format("%.4f", d_inch));
            }
        });
        b_inch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s_inch = e_inch.getText().toString();
                d_inch = Double.parseDouble(s_inch);

                d_m = d_inch * 0.0254;
                d_li = d_inch * 0.000254;
                d_qianmi = d_inch * 25.4;
                d_mile = d_inch * 0.027777778;
                d_foot = d_inch * 0.083333333;
                //BigDecimal b = new BigDecimal(double_cmnew).setScale(6);

                e_m.setText(String.format("%.5f", d_m));
                e_li.setText(String.format("%.8f", d_li));
                e_qianmi.setText(String.format("%.5f", d_qianmi));
                e_mile.setText(String.format("%.5f", d_mile));
                e_foot.setText(String.format("%.4f", d_foot));
            }
        });
    }
}
