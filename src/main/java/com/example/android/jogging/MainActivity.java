package com.example.android.jogging;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int four = 0;
    int four1 = 0;

    public void fourmiles(View V) {
        four =4;
        String lala="You win: " + four + " miles";
        display(lala);
    }

    public void fourmiles1 (View V) {
        four1 =4;
        String lala="You win: " + hello() + " miles";
        display3(lala);
    }

    public void threemiles(View V) {
        display(3);
    }
    public void twomiles(View V) {
        display(2);
    }
    public void onemile(View V) {
        display(1);
    }
    public void threemiles1(View V) {
        display1(3);
    }
    public void twomiles1(View V) {
        display1(2);
    }
    public void onemile1(View V) {
        display1(1);
    }



    public void restart (View V) {
        four=0;
        four1=0;
        display(four);
        display1(four1);
        hello();

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    private int hello (){
        int hel= 4;
    return hel;

    }

    private void display(String lala) {
        TextView point = (TextView) findViewById(R.id.point);
        point.setText(lala);

    }
    private void display3(String lala) {
        TextView point = (TextView) findViewById(R.id.point2);
        point.setText(lala);

    }

    private void display(int four) {
        TextView point = (TextView) findViewById(R.id.point);
        point.setText("" + four);

    }

    public void display1(int four1) {
        TextView point = (TextView) findViewById(R.id.point2);
        point.setText("" + four1);
    }

}




