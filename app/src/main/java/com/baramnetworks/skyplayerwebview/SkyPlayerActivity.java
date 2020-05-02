package com.baramnetworks.skyplayerwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SkyPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sky_player);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String hls = intent.getStringExtra("hls");
        String poster = intent.getStringExtra("poster");
        String thumbnail_vtt = intent.getStringExtra("thumbnail_vtt");
        String user = intent.getStringExtra("user");

        System.out.println("title: " + title);
        System.out.println("hls: " + hls);
        System.out.println("poster: " + poster);
        System.out.println("thumbnail_vtt: " + thumbnail_vtt);
        System.out.println("user: " + user);

        Toast.makeText(this, hls, Toast.LENGTH_SHORT).show();
    }
}
