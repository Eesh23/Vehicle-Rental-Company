package com.example.seg2105_project_gr49v4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CarRentalForm extends AppCompatActivity {

    /*
        Form: Including customer first name, last name, date of birth, address,
        email, license type (G1, G2, G), preferred car type (compact, intermediate,
        SUV), pickup date and time, return date and time.

     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_rental_form);
    }
}