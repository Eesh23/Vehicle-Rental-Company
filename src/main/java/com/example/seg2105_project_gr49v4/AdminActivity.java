package com.example.seg2105_project_gr49v4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class AdminActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        DeletebtnOnClick();
    }

    /*
    *    TODO: Check switches if they're on or off. If on, Display a button on the login page that links them to the
    *    Service's Activity (CarRental, TruckRental, MovingAssistance). ***ONLY DISPLAY BUTTONS IF IT IS A CLIENT, NOT EMPLOYEE.***
    *
    *    Also Idk what to do with the price of the services, im assuming that'll come in later. Should cover the editing portion
    *    of the admin requirements
    * */

    //DeleteAccbtn listener. Currently all it does is grab the text in the editText above it
    private void DeletebtnOnClick() {
        Button Deletebtn = (Button) findViewById(R.id.deleteAccbtn);
        Deletebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText DelUsername = findViewById(R.id.deleteAccUserEditText);
                String DelUser = DelUsername.getText().toString(); //Get Username to be deleted as a string

            }
        });
    }

    private void CarRentalSwitchOnClick() {
        Switch CarRentalSwitch = (Switch) findViewById(R.id.CarRentalSwitch);
        CarRentalSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                EditText carRental = findViewById(R.id.CarRentalPriceEditText);
//                carRental.setText("Enter desired price for service");
//                String carRentalPrice = carRental.getText().toString();
//                Boolean num = true;
//                try {
//                    Integer.parseInt(carRentalPrice);
//                } catch (Exception e) {
//                    num = false;
//                }
//
//                if (num == true) {
//                    // work to add value to firebase
//                } else {
//                    carRental.setText("Invalid input");
//                }

            }
        });
    }

    private void TruckRentalSwitchOnClick() {
        Switch TruckRentalSwitch = (Switch) findViewById(R.id.TruckRentalSwitch);
        TruckRentalSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                EditText truckRental = findViewById(R.id.TruckRentalPriceEditText);
//                truckRental.setText("Enter desired price for service");
//                String truckRentalPrice = truckRental.getText().toString();
//                Boolean num = true;
//                try {
//                    Integer.parseInt(truckRentalPrice);
//                } catch (Exception e) {
//                    num = false;
//                }
//
//                if (num == true) {
//                    // work to add value to firebase
//                } else {
//                    truckRental.setText("Invalid input");
//                }


            }
        });
    }

    private void MovingAssistanceSwitchOnClick() {
        Switch MovingAssistanceSwitch = (Switch) findViewById(R.id.MovingAssistanceSwitch);
        MovingAssistanceSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                EditText movingAssistance = findViewById(R.id.MovingAssistancePriceEditText);
//                movingAssistance.setText("Enter desired price for service");
//                String movingAssistancePrice = movingAssistance.getText().toString();
//                Boolean num = true;
//                try {
//                    Integer.parseInt(movingAssistancePrice);
//                } catch (Exception e) {
//                    num = false;
//                }
//
//                if (num == true) {
//                    // work to add value to firebase
//                } else {
//                    movingAssistance.setText("Invalid input");
//                }


            }
        });
    }

    // new function to remove user from database (firebase)




}