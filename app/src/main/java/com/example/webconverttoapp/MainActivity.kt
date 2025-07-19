package com.example.webconverttoapp
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.webconverttoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var m_binding: ActivityMainBinding
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        m_binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(m_binding.root)

       val webview: WebView=m_binding.webToApp
        webViewApp(webview)


    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewApp(a: WebView){
        a.webViewClient= WebViewClient()

        a.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScHlpb7Awou6jIgmM5euNNeXrhwXpiar8UGuOsU1AD3Ng8jeg/viewform?usp=dialog")

        }

    }
}


