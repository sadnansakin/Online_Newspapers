package com.sadnan.onlinenewspapers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TopEnglishNewspaper extends AppCompatActivity {
    Button dailystarButton,observerButton,dhakaTribuneButton,dailySunButton,newageButton,bangladesPostButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_english_newspaper);

        // finding all the buttons
        dailystarButton = findViewById(R.id.dailystarButtonId);
        observerButton = findViewById(R.id.observerButtonId);
        dhakaTribuneButton = findViewById(R.id.dhakaTribuneButtonId);
        dailySunButton = findViewById(R.id.dailySunButtonId);
        newageButton = findViewById(R.id.newageButtonId);
        bangladesPostButton = findViewById(R.id.bangladesPostButtonId);

        // adding listener with these button
        dailystarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(TopEnglishNewspaper.this, WebviewActivity.class);
                webViewintent.putExtra("dailystar","https://www.thedailystar.net/");
                startActivity(webViewintent);
            }
        });

        observerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(TopEnglishNewspaper.this, WebviewActivity.class);
                webViewintent.putExtra("observer","https://www.observerbd.com/");
                startActivity(webViewintent);
            }
        });

        dhakaTribuneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(TopEnglishNewspaper.this, WebviewActivity.class);
                webViewintent.putExtra("dhakaTribune","https://www.dhakatribune.com/");
                startActivity(webViewintent);
            }
        });

        dailySunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(TopEnglishNewspaper.this, WebviewActivity.class);
                webViewintent.putExtra("sun","https://www.daily-sun.com/");
                startActivity(webViewintent);
            }
        });

        newageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(TopEnglishNewspaper.this, WebviewActivity.class);
                webViewintent.putExtra("newage","https://www.newagebd.net/");
                startActivity(webViewintent);
            }
        });

        bangladesPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(TopEnglishNewspaper.this, WebviewActivity.class);
                webViewintent.putExtra("bdpost","https://bangladeshpost.net/");
                startActivity(webViewintent);
            }
        });
    }
}
