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


        Button button1 = (Button) findViewById(R.id.btn6);
        Button button2 = (Button) findViewById(R.id.btn5);
        Button button3 = (Button) findViewById(R.id.btn4);
        Button button4 = (Button) findViewById(R.id.btn3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.drawLetter = GlobalS.chosenLetter+"1";
                changeScreen();
                DrawActivity drawActivity = new DrawActivity();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.drawLetter = GlobalS.chosenLetter+"2";
                changeScreen();
                DrawActivity drawActivity = new DrawActivity();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.drawLetter = GlobalS.chosenLetter+"3";
                changeScreen();
                DrawActivity drawActivity = new DrawActivity();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.drawLetter = GlobalS.chosenLetter+"4";
                changeScreen();
                DrawActivity drawActivity = new DrawActivity();
            }
        });


        Button backbtn = (Button) findViewById(R.id.button3); // ay yo maybe make a fancier back button like those arrows in the top left later
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });







    }


    public void infiniteLoopU() {
        if(GlobalS.chosenLetter != null) {
            printStarter();
//            GlobalS.chosenLetter = null;
        }
    }

    @SuppressLint("SetTextI18n")
    public void printStarter() {
        TextView text = (TextView) findViewById(R.id.textView3);
        TextView text2 = (TextView) findViewById(R.id.textView14);
        TextView text3 = (TextView) findViewById(R.id.textView10);
        TextView text4 = (TextView) findViewById(R.id.textView11);
        TextView text5 = (TextView) findViewById(R.id.textView12);
        if(GlobalS.chosenLetter.equals("alef")) {
            text.setText("This character is pronounced like \"aw\" in law");
            text2.setText("ا"); //later improve the constraints for the strings (see xml warnings)
            text3.setText("ا");
            text4.setText("ا");
            text5.setText("ـا");
        }
    }

    public void changeScreen() {
        Intent intent = new Intent(MainActivity2.this, DrawActivity.class);
        startActivity(intent);
    }


}


