package com.github.rmotimot.firefoxcustomtabssample

import android.net.Uri
import android.os.Bundle
import android.support.customtabs.CustomTabsIntent
import android.support.v7.app.AppCompatActivity
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://www.yahoo.co.jp/"

        findViewById<Button>(R.id.chrome).setOnClickListener {
            CustomTabsIntent.Builder().build().apply {
                intent.`package` = "com.android.chrome"
            }.launchUrl(this, Uri.parse(url))
        }

        findViewById<Button>(R.id.firefox).setOnClickListener {
            CustomTabsIntent.Builder().build().apply {
                intent.`package` = "org.mozilla.firefox"
            }.launchUrl(this, Uri.parse(url))
        }
    }
}
