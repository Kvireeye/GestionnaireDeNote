package com.example.gestionnairedenote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
public class SplashScreenActivity extends AppCompatActivity {

    private final int Splash_Screen_TimeOut = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



//handler post delayed
new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        //rediriger vers la page princinpale "mainActivity" après 2 secondes.
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish(); }}, Splash_Screen_TimeOut);
    }
}
