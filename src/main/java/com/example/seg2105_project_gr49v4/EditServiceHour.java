package com.example.seg2105_project_gr49v4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class EditServiceHour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_service_hour);

        //firebaseAuth = FirebaseAuth.getInstance();
//        final EditText edit_open = findViewById(R.id.edit_open);
//        final EditText edit_close = findViewById(R.id.edit_close);
//        Button btn = findViewById(R.id.btn);
//        DAOEmployeeHours daoEmployeeHours = new DAOEmployeeHours();
//        btn.setOnClickListener(v->{
//            EmployeeHours employeeHours = new EmployeeHours(edit_open.getText().toString(),edit_close.getText().toString());
//            daoEmployeeHours.add(employeeHours).addOnSuccessListener(suc->{
//                Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
//            }).addOnFailureListener(er->{
//                Toast.makeText(this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();
//            });
//        });


    }


    public void btn(View view) {
        final EditText edit_open = findViewById(R.id.edit_open);
        final EditText edit_close = findViewById(R.id.edit_close);
        Button btn = findViewById(R.id.btn);
        DAOEmployeeHours daoEmployeeHours = new DAOEmployeeHours();
        EmployeeHours employeeHours = new EmployeeHours(edit_open.getText().toString(),edit_close.getText().toString());
//        daoEmployeeHours.add(employeeHours).addOnSuccessListener(suc->{
//            Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
//        }).addOnFailureListener(er->{
//            Toast.makeText(this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();
//        });

        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("day","Sunday");
        hashMap.put("open", edit_open.getText().toString());
        hashMap.put("close", edit_close.getText().toString());
        daoEmployeeHours.update("-MpFEkbsWjHqcb3a1D55",hashMap).addOnSuccessListener(suc->{
            Toast.makeText(this, "Record is updated", Toast.LENGTH_SHORT).show();
        }).addOnFailureListener(er->{
            Toast.makeText(this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();
        });

    }


}