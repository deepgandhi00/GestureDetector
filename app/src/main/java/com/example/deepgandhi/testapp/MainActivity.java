package com.example.deepgandhi.testapp;

import android.app.Notification;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnView;
    private GestureDetectorCompat gestureDetectorCompat = null;

    public static final String UP_DIRECTION = "up";
    public static final String DOWN_DIRECTION = "down";
    public static final String RIGHT_DIRECTION = "right";
    public static final String LEFT_DIRECTION = "left";
    public static final String SINGLE_TAP = "single_tap";
    public static final String DOUBLE_TAP = "double_tap";
    public static final String SHARED_PREFERENCE = "preference";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnView = findViewById(R.id.btnView);
        DetectSwipeGestureListener gestureListener = new DetectSwipeGestureListener(this);
        gestureDetectorCompat = new GestureDetectorCompat(this, gestureListener);

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // Pass activity on touch event to the gesture detector.
        gestureDetectorCompat.onTouchEvent(event);
        // Return true to tell android OS that event has been consumed, do not pass it to other event listeners.
        return true;
    }
}
