package fr.aramteam.surveyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import fr.aramteam.surveyapplication.webview.SurveyClient;
import fr.aramteam.surveyapplication.webview.SurveyWebView;

public class MainActivity extends AppCompatActivity {

    private WebView surveyWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        surveyWebView = this.findViewById(R.id.webview);

        SurveyWebView survey = new SurveyWebView(new SurveyClient());
        String urlToLoad = "http://aram.team";

        survey.setup(surveyWebView, urlToLoad);
    }

    @Override
    public void onBackPressed() {
        if (surveyWebView.canGoBack()) {
            surveyWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }

}