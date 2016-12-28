package com.example.farhan.animationdemo;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    MainActivityLayout mainActivityLayout;
    Button canvasActivityButton,canvasActivityButtonTwo,canvasActivityButtonThree,canvasActivityButtonFour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        mainActivityLayout= new MainActivityLayout(this);
        setContentView(R.layout.activity_main);
        canvasActivityButton = (Button) findViewById(R.id.canvas_activity);
        canvasActivityButtonTwo = (Button) findViewById(R.id.canvas_activity_two);
        canvasActivityButtonThree = (Button) findViewById(R.id.canvas_activity_three);
        canvasActivityButtonFour = (Button) findViewById(R.id.canvas_activity_four);
        LinearLayout view = (LinearLayout) findViewById(R.id.view);
        view.addView(mainActivityLayout);
        canvasActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(MainActivity.this,CanvasActivity.class);
                startActivity(newIntent);
            }
        });
        canvasActivityButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(MainActivity.this,CanvasActivityTwo.class);
                startActivity(newIntent);
            }
        });
        canvasActivityButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(MainActivity.this,CanvasActivityThree.class);
                startActivity(newIntent);
            }
        });
        canvasActivityButtonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(MainActivity.this,CanvasActivityFour.class);
                startActivity(newIntent);
            }
        });
    }
}
