package com.example.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText fetchView;
    TextView putView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        fetchView = findViewById(R.id.fetchRange);
        putView = findViewById(R.id.putView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rd = new Random();

                //fetch the range give by the user
                int range = Integer.parseInt(fetchView.getText().toString());

                //generate random number within range
                int rNumber = rd.nextInt(range);

                //put in putView
                putView.setText("Number is: " + rNumber);
            }
        });
    }
}