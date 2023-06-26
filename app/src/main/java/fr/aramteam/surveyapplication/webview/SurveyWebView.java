package fr.aramteam.surveyapplication.webview;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class SurveyWebView {

    private WebView surveyApp;
    private final WebViewClient surveyClient;

    public SurveyWebView(WebViewClient client) {
        this.surveyClient = client;
    }

    public void setup(WebView webView, String link) {
        surveyApp = webView;
        this.loadUrl(link);
        this.loadSettings();
    }

    private void loadUrl(String link) {
        surveyApp.setWebViewClient(this.surveyClient);
        surveyApp.loadUrl(link);
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void loadSettings() {
        WebSettings surveySettings = surveyApp.getSettings();
        surveySettings.setJavaScriptEnabled(true);
    }

}
