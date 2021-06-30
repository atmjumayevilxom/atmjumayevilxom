package jumayev.ilxom.atm.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class fesc extends AppCompatActivity {
    WebView webView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fesc);
        webView5=findViewById(R.id.webview5);


        webView5.loadUrl("https://ru-ru.facebook.com/terdu.uz");

        webView5.setWebViewClient(new WebViewClient());
        WebSettings webSettings=webView5.getSettings();
    }
}
