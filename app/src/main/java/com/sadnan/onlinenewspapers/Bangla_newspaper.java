package com.sadnan.onlinenewspapers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bangla_newspaper extends AppCompatActivity {
    Button prothomaloButton,somokalButton,manobkonthoButton,vhorerpataButton,ettefaqButton,manobjaminButton,jaijaidinButton,noyadigontoButton,bangladeshProtidin,ctgTimesButton,barishalBT,rajshahiBT,noyakahliBT,rangpurBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_newspaper);

        // finding all id of buttons
        prothomaloButton = findViewById(R.id.prothomaloButtonId);
        somokalButton = findViewById(R.id.somokalButtonId);
        manobkonthoButton = findViewById(R.id.manobkonthoButtonId);
        vhorerpataButton = findViewById(R.id.vhorerpataButtonId);
        ettefaqButton = findViewById(R.id.ettefaqButtonId);
        jaijaidinButton = findViewById(R.id.jaijaidinButtonId);
        manobjaminButton = findViewById(R.id.manobjaminButtonId);
        noyadigontoButton = findViewById(R.id.noyadigontoButtonId);
        bangladeshProtidin = findViewById(R.id.bangladeshProtidinBTId);
        ctgTimesButton = findViewById(R.id.ctgTimesButtonId);
        barishalBT = findViewById(R.id.barishalBTId);
        rajshahiBT = findViewById(R.id.rajshahiBTId);
        noyakahliBT = findViewById(R.id.noyakahliBTId);
        rangpurBT = findViewById(R.id.rangpurBTId);

        // adding listener with all buttons
        prothomaloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(Bangla_newspaper.this, WebviewActivity.class);
                webViewintent.putExtra("prothomalo","https://www.prothomalo.com/");
                startActivity(webViewintent);
            }
        });

        somokalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(Bangla_newspaper.this, WebviewActivity.class);
                webViewintent.putExtra("somokal","https://samakal.com/");
                startActivity(webViewintent);
            }
        });

        manobkonthoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(Bangla_newspaper.this, WebviewActivity.class);
                webViewintent.putExtra("manobkantha","https://www.manobkantha.com.bd/");
                startActivity(webViewintent);
            }
        });

        vhorerpataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(Bangla_newspaper.this, WebviewActivity.class);
                webViewintent.putExtra("vhorerpata","https://www.dailyvorerpata.com/");
                startActivity(webViewintent);
            }
        });

        ettefaqButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(Bangla_newspaper.this, WebviewActivity.class);
                webViewintent.putExtra("ettefaq","https://www.ittefaq.com.bd/");
                startActivity(webViewintent);
            }
        });

        jaijaidinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(Bangla_newspaper.this, WebviewActivity.class);
                webViewintent.putExtra("jaijaidin","https://www.jaijaidinbd.com/");
                startActivity(webViewintent);
            }
        });

        manobjaminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(Bangla_newspaper.this, WebviewActivity.class);
                webViewintent.putExtra("manobjamin","https://mzamin.com/");
                startActivity(webViewintent);
            }
        });

        noyadigontoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(Bangla_newspaper.this, WebviewActivity.class);
                webViewintent.putExtra("noyadigonto","https://www.dailynayadiganta.com/");
                startActivity(webViewintent);
            }
        });

        bangladeshProtidin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(Bangla_newspaper.this, WebviewActivity.class);
                webViewintent.putExtra("bangladeshprotidin","https://www.bd-pratidin.com/");
                startActivity(webViewintent);
            }
        });

        ctgTimesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(Bangla_newspaper.this, WebviewActivity.class);
                webViewintent.putExtra("ctgtimes","https://ctgtimes.com/");
                startActivity(webViewintent);
            }
        });

        barishalBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(Bangla_newspaper.this, WebviewActivity.class);
                webViewintent.putExtra("barishal","https://www.barishaltimes.com/");
                startActivity(webViewintent);
            }
        });

        rajshahiBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(Bangla_newspaper.this, WebviewActivity.class);
                webViewintent.putExtra("rajshahi","https://rajshahinews24.com/");
                startActivity(webViewintent);
            }
        });

        noyakahliBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(Bangla_newspaper.this, WebviewActivity.class);
                webViewintent.putExtra("noyakhali","http://noakhalipratidin.com.bd/");
                startActivity(webViewintent);
            }
        });

        rangpurBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webViewintent = new Intent(Bangla_newspaper.this, WebviewActivity.class);
                webViewintent.putExtra("rangpur","https://rangpurtimes.com/");
                startActivity(webViewintent);
            }
        });


    }
}
