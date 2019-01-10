package com.github.kiolk.jacocoproject;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private Button mButton;

    private TextView mText;

    private WebView mWebView;

    private boolean loaded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText = findViewById(R.id.hello_world_text_view);
        mButton = findViewById(R.id.button);
        mWebView = findViewById(R.id.webview);
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                pressButton();
            }
        });
        CountryWebViewClient client = new CountryWebViewClient();
        mWebView.setWebViewClient(client);
        mWebView.loadUrl("https://trafficban.etransport.pl/plugins/box.html?href=trafficban.com&language=en");
    }

    private void pressButton() {
        mText.setVisibility(View.VISIBLE);
        loadWebArchive();
        Toast.makeText(this, "sdsdsd", Toast.LENGTH_LONG).show();
    }

    private void loadWebArchive(){
        mWebView.loadUrl("file:///" + getBaseContext().getCacheDir()  + File.separator + "myArchive" + ".mht");
    }
}
