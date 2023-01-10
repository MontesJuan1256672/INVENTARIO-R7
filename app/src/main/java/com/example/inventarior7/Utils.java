package com.example.inventarior7;

import android.os.Handler;

public class Utils {
    //Mecanismo de retardo
    public interface DelayCallBack{
        void afterDelay();
    }

    public static void delay(int secs, final DelayCallBack delayCallBack){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run(){
                delayCallBack.afterDelay();
            }
        },secs * 1000);
    }

}
