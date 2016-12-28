package com.example.farhan.animationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */

public class CanvasActivityTwo extends AppCompatActivity {
    CanvasLayoutTwo canvasLayoutTwo;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        canvasLayoutTwo = new CanvasLayoutTwo(this);
        setContentView(canvasLayoutTwo);
    }

    @Override
    protected void onResume() {
        super.onResume();
        canvasLayoutTwo.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        canvasLayoutTwo.pause();
    }
}
