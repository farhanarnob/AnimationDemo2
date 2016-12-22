package com.example.farhan.animationdemo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.Button;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */

public class MainActivityLayout extends View {
    float circleX=400,circleY=400,dirX,dirY, radius;
    Button demo ;
    ApplicationAnimation applicationAnimation;
    public MainActivityLayout(Context context) {
        super(context);
        dirX=dirY=2*context.getResources().getDisplayMetrics().density;
        radius=dirX*10;
        applicationAnimation = (ApplicationAnimation) ((Activity)context).getApplication();
        demo = new Button(context);
        demo.setText("hello");
        demo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        canvas.drawLine(0,0,canvas.getWidth(),canvas.getHeight(),applicationAnimation.redBrush);
        canvas.drawCircle(circleX,circleY,radius,applicationAnimation.redBrush);
        canvas.drawText( (canvas.getDensity()*160f)+"",300,300,applicationAnimation.redBrush);
        if(circleX>=canvas.getWidth()-radius){
            dirX=-dirX;
        }
        if(circleX<=radius){
            dirX=-dirX;
        }
        if(circleY>=canvas.getHeight()-radius){
            dirY=-dirY;
        }
        if(circleY<=radius){
            dirY=-dirY;
        }
        circleX+=dirX;
        circleY+=dirY;
        invalidate();
    }

    @Override
    public void refreshDrawableState() {
        super.refreshDrawableState();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


    }
}
