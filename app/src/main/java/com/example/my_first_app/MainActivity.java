package com.example.my_first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText firstDigit = findViewById(R.id.main_firstEdit);
        EditText secondDigit = findViewById(R.id.main_secondEdit);
        Button compareButton = findViewById(R.id.main_button);
        TextView result = findViewById(R.id.main_textView);
        @SuppressLint("UseSwitchCompatOrMaterialCode") Switch check = findViewById(R.id.main_switchButton);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.edit_text);
            }
        });

        compareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputOne = firstDigit.getText().toString();
                String inputTwo = secondDigit.getText().toString();

                Log.v("User input", "Entered " + inputOne + " " + inputTwo);
                try {

                    if (Integer.valueOf(inputOne).equals(Integer.valueOf(inputTwo))) {
                        result.setText("Equal");
                    } else {
                        result.setText("Not equal");
                    }
                } catch (NumberFormatException exc) {
                    result.setText("WTF leather man ?!");
                }
            }
        });
    }
}