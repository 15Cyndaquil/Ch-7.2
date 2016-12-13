package com.example.cynda.daydriver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import day.Day;

public class DayDriver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_driver);

        int n =25;
        Day day = new Day();

        day.setDay("Monday");

        System.out.println("Current day: "+day.getDay());

        System.out.println("Previous day: "+day.getPreviousDay());
        System.out.println("Next day: "+day.getNextDay());
        System.out.println("Current day + "+n+": "+day.getIntDay(n));
        System.out.println("Current day: "+day.toString());
    }
}
