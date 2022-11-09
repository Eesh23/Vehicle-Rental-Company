package com.example.seg2105_project_gr49v4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MovingAssistanceForm extends AppCompatActivity {

    /*
    Form: Including customer first name, last name, date of birth, address,
    email, moving start location, moving end location, number of movers
    required, expected number of boxes.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moving_assistance_form);
    }
}