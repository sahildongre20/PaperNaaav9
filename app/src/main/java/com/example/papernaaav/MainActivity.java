package com.example.papernaaav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cost(View view) {
        startActivity(new Intent(getApplicationContext(),Login.class));
    }

    public void vendor(View view) {
        startActivity(new Intent(getApplicationContext(),Login.class));
    }
}
