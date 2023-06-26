package fr.aramteam.surveyapplication.webview;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SurveyClient extends WebViewClient {
    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon){
        super.onPageStarted(view,url,favicon);
    }
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request){
        view.loadUrl(request.getUrl().toString());
        return true;
    }
}