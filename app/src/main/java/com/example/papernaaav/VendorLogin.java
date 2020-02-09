package com.example.papernaaav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VendorLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_login);
    }

    public void vregister(View view) {
        startActivity(new Intent(getApplicationContext(),VendorRegistration.class));
    }
}
