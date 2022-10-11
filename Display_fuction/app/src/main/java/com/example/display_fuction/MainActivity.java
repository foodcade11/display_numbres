package com.example.display_fuction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView  text1,text2,text3,text4,text5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(TextView) findViewById(R.id.addition);
        text2=(TextView) findViewById(R.id.subtruction);
        text3=(TextView) findViewById(R.id.multiply);
        text4=(TextView) findViewById(R.id.devition);
        text5=(TextView) findViewById(R.id.reminder);

        int n1=10;
        int n2=5;

        text1.setText(n1+"+" +n2+" = "+(n1+n2)+"");
        text2.setText(n1+" - " +n2+" = "+(n1-n2)+"");
        text3.setText(n1+" x " +n2+" = "+(n1*n2)+"");
        text4.setText(n1+"/" +n2+" = "+(n1/n2)+"");
        text5.setText(n1+"%"+n2+" = "+(n1%n2)+"");
    }
}