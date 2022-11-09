package com.example.seg2105_project_gr49v4;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DAOEmployeeServices {

    private DatabaseReference databaseReference;
    public DAOEmployeeServices(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(EmployeeServices.class.getSimpleName());
    }

}
