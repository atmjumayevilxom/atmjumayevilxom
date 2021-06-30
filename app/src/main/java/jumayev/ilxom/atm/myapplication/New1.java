package jumayev.ilxom.atm.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class New1 extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    public WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        wv = (WebView) findViewById(R.id.web1);
        WebSettings webSettings = wv.getSettings();
        webSettings.setBuiltInZoomControls(true);
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl("http://new.tersu.uz/");
        wv.setWebViewClient(new WebViewClient());
    }

    private class WebViewClient extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }




    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.new1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.web) {
            wv.loadUrl("http://tersu.uz/ru/");
            // Handle the camera action
        } else if (id == R.id.ele) {
            wv.loadUrl("http://smart.tersu.uz/");
        } else if (id == R.id.axborot) {
            wv.loadUrl("http://atm.tersu.uz/");
        } else if (id == R.id.alish) {
            wv.loadUrl("http://shosh.uz/");
        } else if (id == R.id.Arm1) {
            wv.loadUrl("http://arm.tersu.uz/");
        } else if (id == R.id.nav_manage) {
            wv.loadUrl("http://ziyonet.uz/");
        } else if (id == R.id.nav_2) {
            wv.loadUrl("http://new.tersu.uz");
        } else if (id == R.id.nav_gallery) {
            wv.loadUrl("https://ru-ru.facebook.com/terdu.uz");
        } else if (id == R.id.nav_slideshow) {
            wv.loadUrl("https://www.youtube.com/channel/UCmCrRRT8htYX4h43JYDSUrw/videos");
        } else if (id == R.id.xarita) {
            wv.loadUrl("https://www.google.ru/maps/place/%D0%A2%D0%B5%D1%80%D0%BC%D0%B5%D0%B7%D1%81%D0%BA%D0%B8%D0%B9+%D0%93%D0%BE%D1%81%D1%83%D0%B4%D0%B0%D1%80%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9+%D0%A3%D0%BD%D0%B8%D0%B2%D0%B5%D1%80%D1%81%D0%B8%D1%82%D0%B5%D1%82/@37.2342544,67.2856791,19.29z/data=!4m8!1m2!2m1!1stermiz+davlat+universiteti!3m4!1s0x0:0xa9327e0cb650584f!8m2!3d37.234356!4d67.2859919");
        } else if (id == R.id.nav_camera) {
            wv.loadUrl("https://www.instagram.com/termiz_du/");
        } else if (id == R.id.student) {
            wv.loadUrl("http://smart.tersu.uz/students/");
        } else if (id == R.id.bim) {
            wv.loadUrl("https://pf.bimm.uz/");
        } else if (id == R.id.pochta) {
            wv.loadUrl("https://passport.yandex.uz/auth?origin=home_desktop_uz_bell_nologin-exp&retpath=https%3A%2F%2Fmail.yandex.uz%2F&backpath=https%3A%2F%2Fyandex.uz");

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
