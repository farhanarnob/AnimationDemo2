package com.example.farhan.animationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */

public class CanvasActivityFour extends AppCompatActivity {
    CanvasLayoutFour canvasLayoutFour;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        canvasLayoutFour = new CanvasLayoutFour(this);
        setContentView(canvasLayoutFour);
    }

    @Override
    protected void onResume() {
        super.onResume();
        canvasLayoutFour.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        canvasLayoutFour.pause();
    }
}
