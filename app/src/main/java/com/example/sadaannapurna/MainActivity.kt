package com.example.sadaannapurna


import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView
//    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView = findViewById(R.id.web)
        webView.settings.setJavaScriptEnabled(true);
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://sadaannapurna.wordpress.com/")
    }
}