package com.example.cursprovaudemy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textPrin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textPrin = findViewById(R.id.textPr);
        textPrin.setText("CANVI PROJECTE DESDE LENOVO");
    }
}