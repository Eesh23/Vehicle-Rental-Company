package com.example.seg2105_project_gr49v4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DaysOfTheWeek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_of_the_week);
    }

    public void sundayBtn(View view) {
        startActivity(new Intent(DaysOfTheWeek.this, EditServiceHour.class));
    }

    public void mondayBtn(View view) {
        startActivity(new Intent(DaysOfTheWeek.this, MondayHours.class));
    }

    public void tuesdayBtn(View view) {
        startActivity(new Intent(DaysOfTheWeek.this, TuesdayHours.class));
    }

    public void wednesdayBtn(View view) {
        startActivity(new Intent(DaysOfTheWeek.this, WednesdayHours.class));
    }

    public void thursdayBtn(View view) {
        startActivity(new Intent(DaysOfTheWeek.this, ThursdayHour.class));
    }

    public void fridayBtn(View view) {
        startActivity(new Intent(DaysOfTheWeek.this, FridayHour.class));
    }

    public void saturdayBtn(View view) {
        startActivity(new Intent(DaysOfTheWeek.this, SaturdayHours.class));
    }

}