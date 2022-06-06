package com.example.semana_19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        notas.webChromeClient = object : WebChromeClient(){
        }
        notas.webViewClient = object : WebViewClient(){
        }
        notas.settings.javaScriptEnabled = true
        notas.loadUrl("https://estudiantes.ugb.edu.sv/Notas")    }
}