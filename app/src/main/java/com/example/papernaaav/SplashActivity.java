package com.example.papernaaav;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class  SplashActivity extends AppCompatActivity {
   private ImageView logo;
   private TextView line;
   private static int splashTimeout=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splas);

        logo=(ImageView) findViewById(R.id.logo);
        line=(TextView) findViewById(R.id.line);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(SplashActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },splashTimeout);

        Animation myanim= AnimationUtils.loadAnimation(this ,R.anim.mysplashanimation);
        logo.startAnimation(myanim);
        line.startAnimation(myanim);

    }
}
