package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        }
        public static void main(String[] args){
            View view= null;
            activity a = new activity();
            a.talk(view);
        }
       public activity() {

        }
        public void talk(View view){
            setContentView(R.layout.talking);
        }

    }

