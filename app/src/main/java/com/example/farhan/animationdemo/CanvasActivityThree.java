package com.example.farhan.animationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */

public class CanvasActivityThree extends AppCompatActivity {
    CanvasLayoutThree canvasLayoutThree;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        canvasLayoutThree = new CanvasLayoutThree(this);
        setContentView(canvasLayoutThree);
    }

    @Override
    protected void onResume() {
        super.onResume();
        canvasLayoutThree.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        canvasLayoutThree.pause();
    }
}
