package com.cengiztoru.oauthexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        webView.settings.javaScriptEnabled = true
        webView.addJavascriptInterface(WebAppInterface(this), "CengizTORUMobile")
        webView.loadUrl("http://192.168.2.180/oauth.html")

    }
}