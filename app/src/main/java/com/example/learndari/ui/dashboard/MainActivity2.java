package com.example.learndari.ui.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.learndari.MainActivity;
import com.example.learndari.R;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        infiniteLoopU();



        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeScreen();
                DrawActivity drawActivity = new DrawActivity();
            }
        });


        Button button3 = (Button) findViewById(R.id.button3); // ay yo maybe make a fancier back button like those arrows in the top left later
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });







    }


    public void infiniteLoopU() {
        if(GlobalS.chosenLetter != null) {
            printStarter();
            GlobalS.chosenLetter = null;
        }
    }

    @SuppressLint("SetTextI18n")
    public void printStarter() {
        TextView text = (TextView) findViewById(R.id.textView3);
        if(GlobalS.chosenLetter.equals("alef")) {
            text.setText("This character is pronounced like \"aw\" in law");
        }
    }

    public void changeScreen() {
        Intent intent = new Intent(MainActivity2.this, DrawActivity.class);
        startActivity(intent);
    }


}


