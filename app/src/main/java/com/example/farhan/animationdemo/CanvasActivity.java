package com.example.farhan.animationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */

public class CanvasActivity extends AppCompatActivity {
    CanvasLayout canvasLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        canvasLayout = new CanvasLayout(this);
        setContentView(canvasLayout);
    }

    @Override
    protected void onResume() {
        super.onResume();
        canvasLayout.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        canvasLayout.pause();
    }
}
