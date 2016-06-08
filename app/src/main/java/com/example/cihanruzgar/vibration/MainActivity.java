package com.example.cihanruzgar.vibration;

import android.app.Activity;
import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button vibrateButton;
    private Button rhytmButton;
    private Button stopVibrationButton;

     private Vibrator vibrator;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vibrator = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);

        vibrateButton = (Button) findViewById(R.id.button);
        rhytmButton = (Button) findViewById(R.id.button2);
        stopVibrationButton = (Button) findViewById(R.id.button3);

        vibrateButton.setOnClickListener(this);
        rhytmButton.setOnClickListener(this);
        stopVibrationButton.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {

    switch (v.getId()) {

        case R.id.button:
                vibrator.vibrate(3000);
            break;

        case R.id.button2:

            long[] pattern = {250, 500,1000};
            vibrator.vibrate(pattern,0);
            break;

        case R.id.button3:
            vibrator.cancel();

            break;
    }

    }
}
