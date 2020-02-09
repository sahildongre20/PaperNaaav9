package com.example.papernaaav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VendorRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_registration);
    }

    public void vendordone(View view) {
        startActivity(new Intent(getApplicationContext(),VendorRegistrationSuccessfull.class));
    }
}
