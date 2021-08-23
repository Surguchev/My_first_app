package com.example.my_first_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FirstHomeworkClass extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_text);

        Button checkEdit = findViewById(R.id.edit_button);
        checkEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_main);
            }
        });
    }

//    Когда запускаю FirstHomeworkClass то выполняется переход на прошлый экран, к когда запускаю весь app, то нет. В чем проблема ?

}

