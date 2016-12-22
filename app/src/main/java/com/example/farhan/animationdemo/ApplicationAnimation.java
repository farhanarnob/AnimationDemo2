package com.example.farhan.animationdemo;

import android.app.Application;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */

public class ApplicationAnimation extends Application {

    Paint redBrush;
    Path line;

    @Override
    public void onCreate() {

        redBrush = new Paint();
        redBrush.setColor(Color.RED);
        redBrush.setStyle(Paint.Style.FILL);
        line = new Path();
        line.moveTo(30,30);
        line.lineTo(400,500);
        super.onCreate();
    }

}
