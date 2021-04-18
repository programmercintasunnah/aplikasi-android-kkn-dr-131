package com.example.kkndr131;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Webview extends AppCompatActivity {

    WebView webview;
    ProgressBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webview = (WebView) findViewById(R.id.webview);
        bar=(ProgressBar) findViewById(R.id.progressBar);
        Intent intent = getIntent();
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(intent.getStringExtra(DakwahAdapter.DakwahHolder.PESAN_EXTRA));
        webview.setWebViewClient(new myWebclient());
        webview.getSettings().setDomStorageEnabled(true);
    }
    public class myWebclient extends WebViewClient{
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            bar.setVisibility(view.GONE);
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView wv, String url){
            if(url.startsWith("tel:")|| url.startsWith("whatsapp")){
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
                return true;
            }
            return false;
        }
    }
}