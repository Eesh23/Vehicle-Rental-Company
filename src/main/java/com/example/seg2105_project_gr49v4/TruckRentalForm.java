package com.example.seg2105_project_gr49v4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TruckRentalForm extends AppCompatActivity {
    /*
     Form: Including customer first name, last name, date of birth, address,
    email, license type (G1, G2, G), pickup date and time, return date and
    time, maximum number of kilometers to be driven, in addition to the area
    where the truck will be used.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truck_rental_form);
    }
}