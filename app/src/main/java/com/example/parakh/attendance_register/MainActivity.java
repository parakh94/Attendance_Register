package com.example.parakh.attendance_register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsubject1 = (Button) findViewById(R.id.btnsubject1);
        btnsubject2 = (Button) findViewById(R.id.btnsubject2);
        btnsubject3 = (Button) findViewById(R.id.btnsubject3);
        btnsubject4 = (Button) findViewById(R.id.btnsubject4);
        btnsubject5 = (Button) findViewById(R.id.btnsubject5);
        btnlab1 = (Button) findViewById(R.id.btnlab1);
        btnlab2 = (Button) findViewById(R.id.btnlab2);
        btnlab3 = (Button) findViewById(R.id.btnlab3);

        btnsubject1.setOnClickListener(this);btnsubject2.setOnClickListener(this);
        btnsubject3.setOnClickListener(this);btnsubject4.setOnClickListener(this);
        btnsubject5.setOnClickListener(this);btnlab1.setOnClickListener(this);
        btnlab2.setOnClickListener(this);btnlab3.setOnClickListener(this);
    }
    private Button btnsubject1,btnsubject2,btnsubject3,btnsubject4,btnsubject5,btnlab1,btnlab2,btnlab3;

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnsubject1:
                Intent intentsubject1=new Intent("com.example.parakh.attendance_register.Subject1");
                startActivity(intentsubject1);
                break;
            case R.id.btnsubject2:
                Intent intentsubject2=new Intent("com.example.parakh.attendance_register.Subject2");
                startActivity(intentsubject2);
                break;
            case R.id.btnsubject3:
                Intent intentsubject3=new Intent("com.example.parakh.attendance_register.Subject3");
                startActivity(intentsubject3);
                break;
            case R.id.btnsubject4:
                Intent intentsubject4=new Intent("com.example.parakh.attendance_register.Subject4");
                startActivity(intentsubject4);
                break;
            case R.id.btnsubject5:
                Intent intentsubject5=new Intent("com.example.parakh.attendance_register.Subject5");
                startActivity(intentsubject5);
                break;
            case R.id.btnlab1:
                Intent intentlab1=new Intent("com.example.parakh.attendance_register.Lab1");
                startActivity(intentlab1);
                break;
            case R.id.btnlab2:
                Intent intentlab2=new Intent("com.example.parakh.attendance_register.Lab2");
                startActivity(intentlab2);
                break;
            case R.id.btnlab3:
                Intent intentlab3=new Intent("com.example.parakh.attendance_register.Lab3");
                startActivity(intentlab3);
                break;

        }
    }
}
