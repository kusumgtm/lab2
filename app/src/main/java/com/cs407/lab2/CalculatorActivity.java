package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_activity);

        TextView textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        if (message != null) {
            textView.setText("Hello " + message);
        }
    }
}
