package com.example.papernaaav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VendorRegistrationSuccessfull extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_registration_successfull);
    }

    public void start(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }
}
