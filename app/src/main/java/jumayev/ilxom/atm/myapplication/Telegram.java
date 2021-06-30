package jumayev.ilxom.atm.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Telegram extends AppCompatActivity {
WebView webView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telegram);
        webView6=findViewById(R.id.webview1);


        webView6.loadUrl("https://t.me/s/terdu340");

        webView6.setWebViewClient(new WebViewClient());
        WebSettings webSettings=webView6.getSettings();
    }
}