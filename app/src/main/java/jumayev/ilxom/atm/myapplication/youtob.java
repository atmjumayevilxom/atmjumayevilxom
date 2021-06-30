package jumayev.ilxom.atm.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class youtob extends AppCompatActivity {
    private WebView webView7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtob);
        webView7=findViewById(R.id.webView7);
        webView7.setWebViewClient(new WebViewClient());
        webView7.loadUrl("https://www.youtube.com/channel/UCmCrRRT8htYX4h43JYDSUrw/videos");
    }
}
