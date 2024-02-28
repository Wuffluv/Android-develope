package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.TextView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayMessage();
            }
        });
    }
    private void displayMessage() {
        String userInput = editText.getText().toString();
        textView.setText("Hello " + userInput);
    }
}
