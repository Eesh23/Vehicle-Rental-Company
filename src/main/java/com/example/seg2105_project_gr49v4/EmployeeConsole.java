package com.example.seg2105_project_gr49v4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EmployeeConsole extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_console);
    }

    public void hoursBtn(View view) {
        startActivity(new Intent(EmployeeConsole.this, DaysOfTheWeek.class));
    }

    public void service1Btn(View view) {
        startActivity(new Intent(EmployeeConsole.this, CarRentalHours.class));
    }

    public void service2Btn(View view) {
        startActivity(new Intent(EmployeeConsole.this, TruckRentalHours.class));
    }

    public void service3Btn(View view) {
        startActivity(new Intent(EmployeeConsole.this, MovingAssistanceHours.class));
    }
}