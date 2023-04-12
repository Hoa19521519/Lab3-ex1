package com.example.thumbfight.ex1_lab3;


import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GraphicsView(this));

    }
}