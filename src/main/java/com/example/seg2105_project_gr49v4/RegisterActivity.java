package com.example.seg2105_project_gr49v4;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Objects;


public class RegisterActivity extends AppCompatActivity {

    private EditText email, uname, pword, ha, pn;
    private Spinner accountType;
    private ProgressBar progressBar;

    private FirebaseAuth firebaseAuth;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        firebaseAuth = FirebaseAuth.getInstance();
        email = findViewById(R.id.register_email);
        uname = findViewById(R.id.register_username);
        pword = findViewById(R.id.register_pwd);
        pn = findViewById(R.id.register_pn);
        ha = findViewById((R.id.register_ha));


        //accountType = findViewById(R.id.register_role);
    }


    public void registerBtn(View view){

        String emailAddress = email.getText().toString().trim();
        String username = uname.getText().toString().trim();
        String password = pword.getText().toString().trim();
        String phoneNum = pn.getText().toString().trim();
        String homeAdd = ha.getText().toString().trim();
        //String role = accountType.getSelectedItem().toString().trim();
        String role = "Employee";

        if(TextUtils.isEmpty(emailAddress) || TextUtils.isEmpty(username) || TextUtils.isEmpty(password) || TextUtils.isEmpty(phoneNum) || TextUtils.isEmpty(homeAdd)) {
            Toast.makeText(this, "All fields required.", Toast.LENGTH_SHORT).show();
        }
        else{
            register(emailAddress, username, password, role, phoneNum, homeAdd);
            //startActivity(new Intent(RegisterActivity.this, StartActivity.class));
        }



    }

    private void register(String emailAddress, String username, String password, String role, String pn, String ha) {
//      progressBar.setVisibility(View.VISIBLE);
        firebaseAuth.createUserWithEmailAndPassword(emailAddress, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    FirebaseUser rUser = firebaseAuth.getCurrentUser();
                    String userId = rUser.getUid();
                    databaseReference = FirebaseDatabase.getInstance().getReference("users").child(userId);

                    HashMap<String, String> hmap = new HashMap<>();
                    hmap.put("userId", userId);
                    hmap.put("email", emailAddress);
                    hmap.put("username", username);
                    hmap.put("role", role);
                    hmap.put("homeaddi", ha);
                    hmap.put("phoneNum", pn);

                    databaseReference.setValue(hmap).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
 //                           progressBar.setVisibility(View.GONE);
                            if(task.isSuccessful()){
                                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent);
                            } else {
                                Toast.makeText(RegisterActivity.this, Objects.requireNonNull(task.getException()).getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                }else{
//                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(RegisterActivity.this, Objects.requireNonNull(task.getException()).getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}