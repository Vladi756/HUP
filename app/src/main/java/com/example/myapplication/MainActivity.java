package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private TextInputLayout text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int x = Random();
        if (1 % 2 == 0) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
        else
        {   super.onCreate(savedInstanceState);
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
        System.out.println(R.id.username);
    }

    public void text(View view) {
        setContentView(R.layout.talking);
        /*
        String getEditText = text.getEditText().getText().toString();
        Log.d("Edit Text", getEditText);
        System.out.println(getEditText);
        //ai.aici(text.getEditText().getText().toString(), view);
        text= findViewById(R.id.textInputEditText);
         */
    }

    public void chat(View view){
        setContentView(R.layout.chat_layout);
    }

    public void profesional(View view){
        setContentView(R.layout.profesional);
    }

    public void talk(View view){
        setContentView(R.layout.talking);
    }

}
