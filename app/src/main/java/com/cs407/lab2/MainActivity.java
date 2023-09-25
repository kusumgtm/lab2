package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view) {
        EditText myTextField = findViewById(R.id.myTextField);
        String inputText = myTextField.getText().toString();

        Intent intent = new Intent(this, CalculatorActivity.class);
        intent.putExtra("message", inputText);
        startActivity(intent);
    }
}
