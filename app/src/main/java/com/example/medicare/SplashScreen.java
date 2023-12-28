package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    Animation topanim,bottomanim;
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        preferences=this.getSharedPreferences("splash",MODE_PRIVATE);
        editor=preferences.edit();

        topanim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomanim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        txt1=findViewById(R.id.textview);
        txt2=findViewById(R.id.textview1);
        txt3=findViewById(R.id.textview2);
        txt4=findViewById(R.id.textview3);
        txt5=findViewById(R.id.textview4);
        txt6=findViewById(R.id.textview5);
        txt7=findViewById(R.id.textview6);
        txt8=findViewById(R.id.textview7);
        txt1.setAnimation(topanim);
        txt3.setAnimation(topanim);
        txt5.setAnimation(topanim);
        txt7.setAnimation(topanim);
        txt2.setAnimation(bottomanim);
        txt4.setAnimation(bottomanim);
        txt6.setAnimation(bottomanim);
        txt8.setAnimation(bottomanim);
        int SPLASH_SCREEN = 4000;
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                if(preferences.getBoolean("isMain",false)){
                    startActivity(new Intent(SplashScreen.this,MainActivity.class));
                    finish();
                }
                else {
                    editor.putBoolean("isMain",true);
                    editor.apply();
                    TaskStackBuilder.create(SplashScreen.this)
                            .addNextIntentWithParentStack(new Intent(SplashScreen.this,MainActivity.class))
                            .addNextIntent(new Intent(SplashScreen.this,IntroActivity.class))
                            .startActivities();
                }
            }
        },4000);
    }
}