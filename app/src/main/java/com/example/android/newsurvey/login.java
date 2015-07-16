package com.example.android.newsurvey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;


public class login extends Activity {
    private static final String target_url="https://auth.mygov.in/user/login?destination=oauth2/authorize";
    private static final String TAG = "login_tag";
    private Context mContext;
    private WebView webView;
    private  ProgressBar prgrsBar;
//    private WebView mWebviewPop;
    private FrameLayout mContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        System.out.println("hello welcome to my app");
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        final WebView mWebView = (WebView) findViewById(R.id.webView);
        FrameLayout mContainer = (FrameLayout) findViewById(R.id.webview_frame);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.getDisplayZoomControls();

//        webSettings.setAppCacheEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);

        webSettings.setSupportMultipleWindows(true);
        mWebView.loadUrl(target_url);

        mContext=this.getApplicationContext();
        final  Activity activity=this;
//        mWebView.setWebViewClient(new WebViewClient() {
//
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                super.onPageFinished(view, url);
//
//                System.out.println("done");
//                Log.v(TAG,"page finished");
////                Intent i = new Intent(login.this, MainActivity.class);
////                startActivity(i);
//            }
//        });
//          final ProgressBar prgrsBar;
        mWebView.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                super.shouldOverrideUrlLoading(view, url);

//                System.out.println("done");
//                Log.v(TAG,"page finished");
                if (url!=target_url){
                    Intent i = new Intent(login.this, Question.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                    return  true;
                }
                    return false;
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                // TODO Auto-generated method stub
                super.onPageStarted(view, url, favicon);
                prgrsBar=(ProgressBar)findViewById(R.id.progress_bar);
                prgrsBar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                // TODO Auto-generated method stub
                super.onPageFinished(view, url);
                prgrsBar=(ProgressBar)findViewById(R.id.progress_bar);
                prgrsBar.setVisibility(View.GONE);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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
    

    //////////////////////////////////////////////////////////////////////
//    private class UriWebViewClient extends WebViewClient {
//        @Override
//        public void onPageFinished(WebView view, String url) {
//            // First, get the URL that Facebook's login button is actually redirecting you to.
//            // It should be something simulator to https://www.facebook.com/dialog/return/arbiter?relation=opener&close=true
//            super.onPageFinished(view, url);
//            System.out.println("inside page finished");
//            String webUrl = webView.getUrl();
//            Log.v(TAG, webUrl);
//            // Pass it to the LogCat so that you can then use it in the if statement below.
//            Log.v(TAG, webUrl);
//
//            //if (url.startsWith("https://auth.mygov.in/oauth2/authorize")) {
//                // Check whether the current URL is the URL that Facebook's redirecting you to.
//                // If it is - that's it - do what you want to after the logging process has finished.
////                Intent i = new Intent(login.this, MainActivity.class);
////                startActivity(i);
////                return;
//            //}
//
//
//            Intent i = new Intent(login.this, MainActivity.class);
//            startActivity(i);
//            return;
//        }
//    }
/////////////////////////////////////////////////////////////////////////////




}
