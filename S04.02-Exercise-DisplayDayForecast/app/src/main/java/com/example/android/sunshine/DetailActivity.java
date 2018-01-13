package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView mDetailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mDetailTextView = (TextView) findViewById(R.id.tv_weather_detail);
        Intent intent = getIntent();

        if (intent != null && intent.hasExtra(Intent.EXTRA_TEXT)) {
            String data = intent.getStringExtra(Intent.EXTRA_TEXT);
            mDetailTextView.setText(data);
        }
    }
}