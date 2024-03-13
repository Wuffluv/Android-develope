package com.example.secondlab;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button addButton;
    private ImageView imageView;

    private TextView textView2;
    private EditText editText2;
    private Button addButton2;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Определение ориентации и установка соответствующего макета
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.landscape_activity);

            // Инициализация компонентов для горизонтальной ориентации
            textView2 = findViewById(R.id.textView2);
            editText2 = findViewById(R.id.editTextText2);
            addButton2 = findViewById(R.id.button2);
            imageView2 = findViewById(R.id.imageView2);

            // Обработчик нажатия на кнопку в горизонтальной ориентации
            addButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    addTextToTextView2();
                }
            });
        } else {
            setContentView(R.layout.activity_main);

            // Инициализация компонентов для вертикальной ориентации
            textView = findViewById(R.id.textView);
            editText = findViewById(R.id.editTextText);
            addButton = findViewById(R.id.button);
            imageView = findViewById(R.id.imageView);

            // Обработчик нажатия на кнопку в вертикальной ориентации
            addButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    addTextToTextView();
                }
            });
        }
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Обработка изменений ориентации экрана
        int orientation = newConfig.orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.landscape_activity);

            // Инициализация компонентов для горизонтальной ориентации
            textView2 = findViewById(R.id.textView2);
            editText2 = findViewById(R.id.editTextText2);
            addButton2 = findViewById(R.id.button2);
            imageView2 = findViewById(R.id.imageView2);

            // Обработчик нажатия на кнопку в горизонтальной ориентации
            addButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    addTextToTextView2();
                }
            });
        } else {
            setContentView(R.layout.activity_main);

            // Инициализация компонентов для вертикальной ориентации
            textView = findViewById(R.id.textView);
            editText = findViewById(R.id.editTextText);
            addButton = findViewById(R.id.button);
            imageView = findViewById(R.id.imageView);

            // Обработчик нажатия на кнопку в вертикальной ориентации
            addButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    addTextToTextView();
                }
            });
        }
    }

    private void addTextToTextView() {
    }

    private void addTextToTextView2() {
        // Получаем введенное имя из editText2
        String inputName = editText2.getText().toString();

        // Добавляем имя к существующему тексту в textView2
        String currentText = textView2.getText().toString();
        String newText = currentText + "\n" + inputName;

        // Устанавливаем новый текст в textView2
        textView2.setText(newText);

        // Очищаем поле ввода
        editText2.setText("");
    }
}
