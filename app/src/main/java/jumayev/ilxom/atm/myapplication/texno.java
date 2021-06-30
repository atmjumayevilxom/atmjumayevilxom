package jumayev.ilxom.atm.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class texno extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texno);
        webView=findViewById(R.id.webView10);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://atm.tersu.uz/");
    }
}
