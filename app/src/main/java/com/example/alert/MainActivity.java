package com.example.alert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
   TextView home;
   Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home = findViewById( R.id.textView);
        next = findViewById(R.id.button);
        next.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(in);

        });

    }
}