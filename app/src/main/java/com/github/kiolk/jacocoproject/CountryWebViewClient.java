package com.github.kiolk.jacocoproject;

import android.graphics.Bitmap;
import android.os.Environment;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.File;

public class CountryWebViewClient extends WebViewClient {

    private static boolean loaded = false;

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        Log.d("myLogs", "onPageFinished: " + loaded);
        if(!loaded) {
            view.saveWebArchive(view.getContext().getCacheDir() + File.separator + "myArchive" + ".mht");
        loaded = true;
        }
        //        super.onPageFinished(view, url);
        }

    @Override
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
    }
}
