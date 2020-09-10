package com.sadnan.onlinenewspapers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class WebviewActivity extends AppCompatActivity {
    WebView webView;
    String url;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webviewactivity);

        getSupportActionBar().hide();
        webView = findViewById(R.id.webView);
        progressBar = findViewById(R.id.progressbar);


        Bundle bundle = getIntent().getExtras();
        if (bundle.containsKey("NewYork")){
            url = bundle.getString("NewYork");
        }
        if (bundle.containsKey("guardian")){
            url = bundle.getString("guardian");
        }
        if (bundle.containsKey("japan_times")){
            url = bundle.getString("japan_times");
        }
        if (bundle.containsKey("washington_times")){
            url = bundle.getString("washington_times");
        }
        if (bundle.containsKey("india_times")){
            url = bundle.getString("india_times");
        }
        if (bundle.containsKey("sportEnglish")){
            url = bundle.getString("sportEnglish");
        }
        if (bundle.containsKey("nbc")){
            url = bundle.getString("nbc");
        }
        if (bundle.containsKey("espn")){
            url = bundle.getString("espn");
        }
        if (bundle.containsKey("bbcbangla")){
            url = bundle.getString("bbcbangla");
        }
        if (bundle.containsKey("somoynews")){
            url = bundle.getString("somoynews");
        }

        if (bundle.containsKey("jamunatv")){
            url = bundle.getString("jamunatv");
        }


        // now conditioning with bangla newspapers
        //
        if (bundle.containsKey("prothomalo")){
            url = bundle.getString("prothomalo");
        }

        if (bundle.containsKey("somokal")){
            url = bundle.getString("somokal");
        }
        if (bundle.containsKey("manobkantha")){
            url = bundle.getString("manobkantha");
        }
        if (bundle.containsKey("vhorerpata")){
            url = bundle.getString("vhorerpata");
        }
        if (bundle.containsKey("ettefaq")){
            url = bundle.getString("ettefaq");
        }
        if (bundle.containsKey("jaijaidin")){
            url = bundle.getString("jaijaidin");
        }
        if (bundle.containsKey("manobjamin")){
            url = bundle.getString("manobjamin");
        }
        if (bundle.containsKey("noyadigonto")){
            url = bundle.getString("noyadigonto");
        }
        if (bundle.containsKey("bangladeshprotidin")){
            url = bundle.getString("bangladeshprotidin");
        }
        if (bundle.containsKey("ctgtimes")){
            url = bundle.getString("ctgtimes");
        }
        if (bundle.containsKey("barishal")){
            url = bundle.getString("barishal");
        }
        if (bundle.containsKey("rajshahi")){
            url = bundle.getString("rajshahi");
        }
        if (bundle.containsKey("noyakhali")){
            url = bundle.getString("noyakhali");
        }
        if (bundle.containsKey("rangpur")){
            url = bundle.getString("rangpur");
        }

        // conditioning all English news paper

        if (bundle.containsKey("dailystar")){
            url = bundle.getString("dailystar");
        }

        if (bundle.containsKey("observer")){
            url = bundle.getString("observer");
        }

        if (bundle.containsKey("sun")){
            url = bundle.getString("sun");
        }

        if (bundle.containsKey("newage")){
            url = bundle.getString("newage");
        }

        if (bundle.containsKey("bdpost")){
            url = bundle.getString("bdpost");
        }

        if (bundle.containsKey("dhakaTribune")){
            url = bundle.getString("dhakaTribune");
        }


        progressBar.setVisibility(View.VISIBLE);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setUseWideViewPort(true);
        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress)
            {
                //Make the bar disappear after URL is loaded, and changes string to Loading...
                progressBar.setVisibility(View.VISIBLE);
                setProgress(progress * 100); //Make the bar disappear after URL is loaded

                // Return the app name after finish loading
                if(progress == 100)
                    progressBar.setVisibility(View.INVISIBLE);
            }
        });

        webView.loadUrl(url);


    }
}
