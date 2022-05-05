package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int x = Random();
        if (1 % 2 == 0) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
        else
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.login_layout);
        }
    }
    public static int Random() {
        Random x = new Random();
        return x.nextInt(100);
    }
    public void userlayout(View view){
        setContentView(R.layout.user_activity_layout);
    }

    public void activityAfterLogIn(View view){
        setContentView(R.layout.activity_main);
    }
}
