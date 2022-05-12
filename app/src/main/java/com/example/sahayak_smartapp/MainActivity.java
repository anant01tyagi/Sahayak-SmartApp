package com.example.sahayak_smartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView heart, temperature, spo2;
        WebView heartWeb, tempWeb, spo2Web;

        tempWeb = findViewById(R.id.tempWeb);
        tempWeb.loadUrl("https://thingspeak.com/channels/1678163/charts/1?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line&update=15");

        heartWeb = findViewById(R.id.heartWeb);
        heartWeb.loadUrl("https://thingspeak.com/channels/1678163/charts/2?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line&update=15");

        spo2Web = findViewById(R.id.spo2Web);
        spo2Web.loadUrl("https://thingspeak.com/channels/1678163/charts/3?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line&update=15");


    }
}