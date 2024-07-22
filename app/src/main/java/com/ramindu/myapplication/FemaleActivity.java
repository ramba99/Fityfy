package com.ramindu.myapplication;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class FemaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female);

        VideoView videoview = findViewById(R.id.videoView3);
        videoview.setVideoPath("android.resource://"+ getPackageName() + "/"+ R.raw.female1);
        videoview.start();

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoview);
        videoview.setMediaController(mediaController);
    }
}