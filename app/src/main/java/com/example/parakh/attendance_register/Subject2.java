package com.example.parakh.attendance_register;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Subject2 extends AppCompatActivity implements View.OnClickListener{

    private Button btn01,btn02,btn03,btn04,btn05,btn06,btn07,btn08,btn09,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20;
    private Button btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31;
    int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject1);
        btn01=(Button)findViewById(R.id.btn01);btn02=(Button)findViewById(R.id.btn02);
        btn03=(Button)findViewById(R.id.btn03);btn04=(Button)findViewById(R.id.btn04);
        btn05=(Button)findViewById(R.id.btn05);btn06=(Button)findViewById(R.id.btn06);
        btn07=(Button)findViewById(R.id.btn07);btn08=(Button)findViewById(R.id.btn08);
        btn09=(Button)findViewById(R.id.btn09);btn10=(Button)findViewById(R.id.btn10);
        btn11=(Button)findViewById(R.id.btn11);btn12=(Button)findViewById(R.id.btn12);
        btn13=(Button)findViewById(R.id.btn13);btn14=(Button)findViewById(R.id.btn14);
        btn15=(Button)findViewById(R.id.btn15);btn16=(Button)findViewById(R.id.btn16);
        btn17=(Button)findViewById(R.id.btn17);btn18=(Button)findViewById(R.id.btn18);
        btn19=(Button)findViewById(R.id.btn19);btn20=(Button)findViewById(R.id.btn20);
        btn21=(Button)findViewById(R.id.btn21);btn22=(Button)findViewById(R.id.btn22);
        btn23=(Button)findViewById(R.id.btn23);btn24=(Button)findViewById(R.id.btn24);
        btn25=(Button)findViewById(R.id.btn25);btn26=(Button)findViewById(R.id.btn26);
        btn27=(Button)findViewById(R.id.btn27);btn28=(Button)findViewById(R.id.btn28);
        btn29=(Button)findViewById(R.id.btn29);btn30=(Button)findViewById(R.id.btn30);
        btn31=(Button)findViewById(R.id.btn31);

        btn01.setOnClickListener(this);btn02.setOnClickListener(this);btn03.setOnClickListener(this);btn04.setOnClickListener(this);
        btn05.setOnClickListener(this);btn06.setOnClickListener(this);btn07.setOnClickListener(this);btn08.setOnClickListener(this);
        btn09.setOnClickListener(this);btn10.setOnClickListener(this);btn11.setOnClickListener(this);btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);btn14.setOnClickListener(this);btn15.setOnClickListener(this);btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);btn18.setOnClickListener(this);btn19.setOnClickListener(this);btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);btn22.setOnClickListener(this);btn23.setOnClickListener(this);btn24.setOnClickListener(this);
        btn25.setOnClickListener(this);btn26.setOnClickListener(this);btn27.setOnClickListener(this);btn28.setOnClickListener(this);
        btn29.setOnClickListener(this);btn30.setOnClickListener(this);btn31.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_subject1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            default :
                if(c==0)
                {
                    c=1;
                    v.setBackgroundColor(Color.GREEN);
                }
                else if(c==1)
                {
                    c=2;
                    v.setBackgroundColor(Color.RED);
                }
                else if(c==2)
                {
                    c=0;
                    v.setBackgroundColor(Color.WHITE);
                }
        }
    }
}
