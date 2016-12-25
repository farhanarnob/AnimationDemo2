package com.example.farhan.animationdemo;

import android.app.Application;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */

public class ApplicationAnimation extends Application {

    Paint redBrush;

    @Override
    public void onCreate() {

        redBrush = new Paint();
        redBrush.setColor(Color.RED);
        redBrush.setStyle(Paint.Style.FILL);
        super.onCreate();
    }

}
