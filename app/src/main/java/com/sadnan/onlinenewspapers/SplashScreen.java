package com.sadnan.onlinenewspapers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
                );


        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
                                      @Override
                                      public void run() {
                                          /* Create an Intent that will start the Menu-Activity. */
                                          Intent mainIntent = new Intent(SplashScreen.this,MainActivity.class);
                                          SplashScreen.this.startActivity(mainIntent);
                                          SplashScreen.this.finish();
                                      }
                                  }, //SPLASH_DISPLAY_LENGTH,
                6000);

    }

}
