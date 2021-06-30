package jumayev.ilxom.atm.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class instagram extends AppCompatActivity {
    private WebView webView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);
        webView4=findViewById(R.id.webview4);
        webView4.setWebViewClient(new WebViewClient());
        webView4.loadUrl("https://www.instagram.com/termiz_du/");
    }
}
