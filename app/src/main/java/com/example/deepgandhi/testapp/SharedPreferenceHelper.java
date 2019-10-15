package com.example.deepgandhi.testapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.TextView;

public class SharedPreferenceHelper {
    Context context;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public SharedPreferenceHelper(Context context) {
        this.context = context;

        sharedPreferences = context.getSharedPreferences(MainActivity.SHARED_PREFERENCE,Context.MODE_PRIVATE);

        editor = sharedPreferences.edit();
    }

    public void addRight(){
        if(sharedPreferences.contains(MainActivity.RIGHT_DIRECTION)){
            int count = sharedPreferences.getInt(MainActivity.RIGHT_DIRECTION,0);
            count++;
            editor.putInt(MainActivity.RIGHT_DIRECTION,count);
            editor.commit();
        }
        else{
            editor.putInt(MainActivity.RIGHT_DIRECTION,1);
            editor.commit();
        }
    }

    public void addLeft(){
        if(sharedPreferences.contains(MainActivity.LEFT_DIRECTION)){
            int count = sharedPreferences.getInt(MainActivity.LEFT_DIRECTION,0);
            count++;
            editor.putInt(MainActivity.LEFT_DIRECTION,count);
            editor.commit();
        }
        else{
            editor.putInt(MainActivity.LEFT_DIRECTION,1);
            editor.commit();
        }
    }

    public void addUp(){
        if(sharedPreferences.contains(MainActivity.UP_DIRECTION)){
            int count = sharedPreferences.getInt(MainActivity.UP_DIRECTION,0);
            count++;
            editor.putInt(MainActivity.UP_DIRECTION,count);
            editor.commit();
        }
        else{
            editor.putInt(MainActivity.UP_DIRECTION,1);
            editor.commit();
        }
    }

    public void addDown(){
        if(sharedPreferences.contains(MainActivity.DOWN_DIRECTION)){
            int count = sharedPreferences.getInt(MainActivity.DOWN_DIRECTION,0);
            count++;
            editor.putInt(MainActivity.DOWN_DIRECTION,count);
            editor.commit();
        }
        else{
            editor.putInt(MainActivity.DOWN_DIRECTION,1);
            editor.commit();
        }
    }

    public void singleTap(){
        if(sharedPreferences.contains(MainActivity.SINGLE_TAP)){
            int count = sharedPreferences.getInt(MainActivity.SINGLE_TAP,0);
            count++;
            editor.putInt(MainActivity.SINGLE_TAP,count);
            editor.commit();
        }
        else{
            editor.putInt(MainActivity.SINGLE_TAP,1);
            editor.commit();
        }
    }

    public void doubleTap(){
        if(sharedPreferences.contains(MainActivity.DOUBLE_TAP)){
            int count = sharedPreferences.getInt(MainActivity.DOUBLE_TAP,0);
            count++;
            editor.putInt(MainActivity.DOUBLE_TAP,count);
            editor.commit();
        }
        else{
            editor.putInt(MainActivity.DOUBLE_TAP,1);
            editor.commit();
        }
    }

    public int getUp(){
        return sharedPreferences.getInt(MainActivity.UP_DIRECTION,0);
    }

    public int getDown(){
        return sharedPreferences.getInt(MainActivity.DOWN_DIRECTION,0);
    }

    public int getRight(){
        return sharedPreferences.getInt(MainActivity.RIGHT_DIRECTION,0);
    }

    public int getLeft(){
        return sharedPreferences.getInt(MainActivity.LEFT_DIRECTION,0);
    }

    public int getSingle(){
        return sharedPreferences.getInt(MainActivity.SINGLE_TAP,0);
    }

    public int getDouble(){
        return sharedPreferences.getInt(MainActivity.DOUBLE_TAP,0);
    }
}
