package com.ramindu.myapplication;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class YogaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);

        VideoView videoview = findViewById(R.id.videoView3);
        videoview.setVideoPath("android.resource://"+ getPackageName() + "/"+ R.raw.yoga1);


        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoview);
        videoview.setMediaController(mediaController);
    }
}