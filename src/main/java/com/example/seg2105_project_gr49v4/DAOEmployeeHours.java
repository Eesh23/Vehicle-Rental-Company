package com.example.seg2105_project_gr49v4;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class DAOEmployeeHours {

    private DatabaseReference databaseReference;
    public DAOEmployeeHours(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(EmployeeHours.class.getSimpleName());
    }
    public Task<Void> add(EmployeeHours empHours){
        return databaseReference.push().setValue(empHours);
    }

    public Task<Void> update(String key, HashMap<String,Object> hashMap) {
        return databaseReference.child(key).updateChildren(hashMap);
    }

}
