/*Esta clase se utiliza para implementar un delay en una de las clases
* recuperado de StackOverFlow
* https://stackoverflow.com/questions/15874117/how-to-set-delay-in-android
*/

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
