package com.project.belajarandroidjava.views;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.project.belajarandroidjava.MainActivity;
import com.project.belajarandroidjava.R;

public class SplashActivity extends AppCompatActivity {
ImageView imgLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imgLogo =(ImageView) findViewById(R.id.splash_imgLogo);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fadeout);

        imgLogo.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent panggil = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(panggil);
                finish();
            }
        }, 5000);
    }
}
