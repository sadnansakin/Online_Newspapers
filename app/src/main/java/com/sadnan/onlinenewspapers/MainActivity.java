package com.sadnan.onlinenewspapers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button topBanglaNews,topEnglishNewsBD,new_york_timesButton,theguardianButton,the_japan_timesButton,the_washingtonButton,the_india_timesButton,sportEnglishButton,espnButton,nbcButton,bbcBanglaButton,somoyNewsButton,jamunaTVButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // finding all button id
        topBanglaNews = findViewById(R.id.topBanglaNewsId);
        topEnglishNewsBD = findViewById(R.id.topEnglishNewsBDId);
        new_york_timesButton = findViewById(R.id.new_york_timesButtonId);
        theguardianButton = findViewById(R.id.theguardianButtonId);
        the_japan_timesButton = findViewById(R.id.the_japan_timesButtonId);
        the_washingtonButton = findViewById(R.id.the_washingtonButtonId);
        the_india_timesButton = findViewById(R.id.the_india_timesButtonId);
        sportEnglishButton = findViewById(R.id.sportEnglishButtonId);
        espnButton = findViewById(R.id.espnButtonId);
        nbcButton = findViewById(R.id.nbcButtonId);
        bbcBanglaButton = findViewById(R.id.bbcBanglaButtonId);
        somoyNewsButton = findViewById(R.id.somoyNewsButtonId);
        jamunaTVButton = findViewById(R.id.jamunaTVButtonId);

        topBanglaNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Bangla_newspaper.class);
                startActivity(intent);
            }
        });
        topEnglishNewsBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TopEnglishNewspaper.class);
                startActivity(intent);
            }
        });

        // for international newspaper
        new_york_timesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(MainActivity.this, WebviewActivity.class);
                webViewintent.putExtra("NewYork","https://www.nytimes.com/");
                startActivity(webViewintent);
            }
        });
        theguardianButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(MainActivity.this, WebviewActivity.class);
                webViewintent.putExtra("guardian","https://www.theguardian.com/international");
                startActivity(webViewintent);
            }
        });

        the_japan_timesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(MainActivity.this, WebviewActivity.class);
                webViewintent.putExtra("japan_times","https://www.japantimes.co.jp/");
                startActivity(webViewintent);
            }
        });

        the_washingtonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(MainActivity.this, WebviewActivity.class);
                webViewintent.putExtra("washington_times","https://www.washingtonpost.com/");
                startActivity(webViewintent);
            }
        });

        the_india_timesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(MainActivity.this, WebviewActivity.class);
                webViewintent.putExtra("india_times","https://timesofindia.indiatimes.com/");
                startActivity(webViewintent);
            }
        });

        // for sports and live news
        sportEnglishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(MainActivity.this, WebviewActivity.class);
                webViewintent.putExtra("sportEnglish","https://www.sport.es/en/");
                startActivity(webViewintent);
            }
        });

        nbcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(MainActivity.this, WebviewActivity.class);
                webViewintent.putExtra("nbc","https://www.nbcsports.com/");
                startActivity(webViewintent);
            }
        });

        espnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(MainActivity.this, WebviewActivity.class);
                webViewintent.putExtra("espn","https://www.espn.in/");
                startActivity(webViewintent);
            }
        });

        // for live news
        bbcBanglaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(MainActivity.this, WebviewActivity.class);
                webViewintent.putExtra("bbcbangla","https://www.bbc.com/bengali");
                startActivity(webViewintent);
            }
        });

        somoyNewsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(MainActivity.this, WebviewActivity.class);
                webViewintent.putExtra("somoynews","https://www.somoynews.tv/");
                startActivity(webViewintent);
            }
        });

        jamunaTVButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(MainActivity.this, WebviewActivity.class);
                webViewintent.putExtra("jamunatv","https://www.jamuna.tv/");
                startActivity(webViewintent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.share){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String subject = "Online Newspaper App";
            String body = "From this app you can read all kind of newspaper online also live news and sports.";

            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);

            startActivity(Intent.createChooser(intent,"Share with "));
        }
        if (item.getItemId()==R.id.about){
            Intent intent = new Intent(MainActivity.this,About.class);
            startActivity(intent);
        }
        if (item.getItemId()==R.id.feedback){

            Intent intent = new Intent(MainActivity.this,Feedback.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

      AlertDialog.Builder  alertDialogbuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogbuilder.setIcon(R.drawable.alert_icon);
        alertDialogbuilder.setTitle("Exit!");
        alertDialogbuilder.setMessage("Are you sure?");
        alertDialogbuilder.setCancelable(false);
        alertDialogbuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //exit
                finish();
            }
        });
        alertDialogbuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = alertDialogbuilder.create();
        alertDialog.show();
    }
}
