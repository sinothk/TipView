package com.sinothk.widget.tipView.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sinothk.widget.tipView.style1.BadgeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BadgeView style1TipView = this.findViewById(R.id.style1TipView);
        style1TipView.setTextAdj("5");
    }
}
