package com.example.deepgandhi.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtUp,txtDown,txtRight,txtLeft,txtSingle,txtDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtUp = findViewById(R.id.txtup);
        txtDown = findViewById(R.id.txtdown);
        txtRight = findViewById(R.id.txtright);
        txtLeft = findViewById(R.id.txtleft);
        txtSingle = findViewById(R.id.txtsingle);
        txtDouble = findViewById(R.id.txtdouble);

        SharedPreferenceHelper sharedPreferenceHelper = new SharedPreferenceHelper(this);

        txtUp.setText("UP : "+ sharedPreferenceHelper.getUp());
        txtDown.setText("DOWN : "+ sharedPreferenceHelper.getDown());
        txtLeft.setText("LEFT : "+sharedPreferenceHelper.getLeft());
        txtRight.setText("RIGHT : "+sharedPreferenceHelper.getRight());
        txtSingle.setText("SINGLE TAP : "+sharedPreferenceHelper.getSingle());
        txtDouble.setText("DOUBLE TAP : "+sharedPreferenceHelper.getDouble());
    }
}
