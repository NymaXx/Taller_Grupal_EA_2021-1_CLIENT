package com.example.taller_grupal_ea_2021_1_client1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startBtn;
    private Button toControlsBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    startBtn = findViewById(R.id.toStart);
    toControlsBtn = findViewById(R.id.toControlsBtn);

    startBtn.setOnClickListener(
            (v) -> {

            }
    );




    }

    @Override
    public void onClick(View v) {

    }
}