package com.example.papernaaav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);
    }


    public void register(View view) {
        startActivity(new Intent(getApplicationContext(),UserRegister.class));
    }


    public void dasboard(View view) {
        startActivity(new Intent(getApplicationContext(),Dashboard.class));
    }
}
