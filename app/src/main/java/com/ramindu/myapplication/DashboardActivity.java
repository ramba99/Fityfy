package com.ramindu.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class DashboardActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOptionActivity();
            }
        });

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openYogaActivity(); }
        });

        button = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openRunningActivity(); }
        });

    }

    public void openOptionActivity() {
        Intent intent = new Intent(this, OptionActivity.class);
        startActivity(intent);
    }

    public void openYogaActivity() {
        Intent intent = new Intent(this, YogaActivity.class);
        startActivity(intent);
    }

    public void openRunningActivity() {
        Intent intent = new Intent(this, RunningActivity.class);
        startActivity(intent);
    }



}
