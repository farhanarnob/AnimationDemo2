package com.example.farhan.animationdemo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */

public class CanvasLayoutThree extends SurfaceView implements Runnable {
    Thread thread = null;
    boolean canDraw;
    Canvas canvas;
    float circleX=400,circleY=400,dirX,dirY, radius;
    double tLF, tEOR, deltaT, framesPerSecond,frameTimeInSeconds,frameTimeInMS,frameTimeInNS;
    Bitmap backGroundCheck;
    ApplicationAnimation applicationAnimation;
    SurfaceHolder surfaceHolder;
    public CanvasLayoutThree(Context context) {
        super(context);
        backGroundCheck = BitmapFactory.decodeResource(getResources(),R.drawable.background);
        applicationAnimation =(ApplicationAnimation) ((Activity)context).getApplication();
        surfaceHolder = getHolder();
        dirX=dirY=5*context.getResources().getDisplayMetrics().density;
        radius = 20*context.getResources().getDisplayMetrics().density;
        framesPerSecond = 220;
        frameTimeInSeconds = 1/framesPerSecond;
        frameTimeInMS = frameTimeInSeconds*1000;
        frameTimeInNS= frameTimeInMS*1000000;

    }

    @Override
    public void run() {
        tLF = System.nanoTime();
        deltaT = 0;
        while (canDraw){
            if(!surfaceHolder.getSurface().isValid()){
                continue;
            }
            draw();
            tEOR = System.nanoTime();
            deltaT = frameTimeInNS - (tEOR-tLF);
            if(deltaT<0){
                deltaT = frameTimeInNS -deltaT;
                Log.d("CanvasLayout : ","negative");
            }
            Log.d("CanvasLayout : ",deltaT+"");
            if(deltaT>0){
                try {
                    thread.sleep((long) (deltaT/1000000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            tLF = System.nanoTime();
        }

    }

    void draw(){
        canvas = surfaceHolder.lockCanvas();
        //canvas.drawBitmap(backGroundCheck,0,0,null);
        canvas.drawColor(Color.WHITE);
        motionCircle();
        canvas.drawCircle(circleX,circleY,radius,applicationAnimation.redBrush);
        surfaceHolder.unlockCanvasAndPost(canvas);
    }

    private void motionCircle(){
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
    }
    public void resume() {
        canDraw = true;
        if(thread==null){
            thread = new Thread(this);
        }
        thread.start();
    }

    public void pause() {
        canDraw = false;
        while (true){
            try {
                thread.interrupt();
                thread.join();
                break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        thread  = null;
    }
}
