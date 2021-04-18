package com.tcl.screenrecord;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.makeText;

public class StopActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop);
        getView();
    }

    private void getView() {
        TextView stopTv = (TextView) findViewById(R.id.button_stop);
        stopTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopScreenRecording();
            }
        });
    }

    private void stopScreenRecording() {
        makeText(this, R.string.completed, LENGTH_LONG).show();
        Intent service = new Intent(this, ScreenRecordService.class);
        stopService(service);
    }
}
