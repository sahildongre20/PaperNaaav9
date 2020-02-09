package com.example.papernaaav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserRegistrationSuccesfull extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userregistration_succesfull);
    }

    public void redirect(View view) {
        startActivity(new Intent(getApplicationContext(), UserLogin.class));
    }

    public void back(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
