package com.example.learndari.ui.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
=======
import android.util.Log;
>>>>>>> 6b0642a750f59ba22352f2f0eac941089dd97423
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

<<<<<<< HEAD
=======
import com.example.learndari.MainActivity;
>>>>>>> 6b0642a750f59ba22352f2f0eac941089dd97423
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
<<<<<<< HEAD
        TextView text = (TextView) findViewById(R.id.textView3);
        TextView text2 = (TextView) findViewById(R.id.textView9);
        TextView text3 = (TextView) findViewById(R.id.textView10);
        TextView text4 = (TextView) findViewById(R.id.textView11);
        TextView text5 = (TextView) findViewById(R.id.textView12);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.drawLetter = text2.getText().toString();
=======
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.drawLetter = GlobalS.chosenLetter+"1";
>>>>>>> 6b0642a750f59ba22352f2f0eac941089dd97423
                changeScreen();
                DrawActivity drawActivity = new DrawActivity();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                GlobalS.drawLetter = text3.getText().toString();
=======
                GlobalS.drawLetter = GlobalS.chosenLetter+"2";
>>>>>>> 6b0642a750f59ba22352f2f0eac941089dd97423
                changeScreen();
                DrawActivity drawActivity = new DrawActivity();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                GlobalS.drawLetter = text4.getText().toString();
=======
                GlobalS.drawLetter = GlobalS.chosenLetter+"3";
>>>>>>> 6b0642a750f59ba22352f2f0eac941089dd97423
                changeScreen();
                DrawActivity drawActivity = new DrawActivity();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                GlobalS.drawLetter = text5.getText().toString();
=======
                GlobalS.drawLetter = GlobalS.chosenLetter+"4";
>>>>>>> 6b0642a750f59ba22352f2f0eac941089dd97423
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
<<<<<<< HEAD
    }//add support for smaller screens later
=======
    }
>>>>>>> 6b0642a750f59ba22352f2f0eac941089dd97423

    @SuppressLint("SetTextI18n")
    public void printStarter() {
        TextView text = (TextView) findViewById(R.id.textView3);
<<<<<<< HEAD
        TextView text2 = (TextView) findViewById(R.id.textView9);
=======
        TextView text2 = (TextView) findViewById(R.id.textView14);
>>>>>>> 6b0642a750f59ba22352f2f0eac941089dd97423
        TextView text3 = (TextView) findViewById(R.id.textView10);
        TextView text4 = (TextView) findViewById(R.id.textView11);
        TextView text5 = (TextView) findViewById(R.id.textView12);
        if(GlobalS.chosenLetter.equals("alef")) {
<<<<<<< HEAD
            text.setText("This character is pronounced like aw in \"law,\" or as the \"o\" in \"hot\"");
=======
            text.setText("This character is pronounced like \"aw\" in law");
>>>>>>> 6b0642a750f59ba22352f2f0eac941089dd97423
            text2.setText("??"); //later improve the constraints for the strings (see xml warnings)
            text3.setText("??");
            text4.setText("??");
            text5.setText("????");
        }
<<<<<<< HEAD
        if(GlobalS.chosenLetter.equals("be")) {
            text.setText("This character is pronounced as b in boy"); //change sentences to have better wording later
            text2.setText("??");
            text3.setText("??");
            text4.setText("????");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("pe")) {
            text.setText("This character is pronounced as p as in pen");
            text2.setText("??");
            text3.setText("??");
            text4.setText("????");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("te")) {
            text.setText("This character is pronounced as t in teach");
            text2.setText("??");
            text3.setText("??");
            text4.setText("????");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("se")) {
            text.setText("This character is pronounced as s as in son");
            text2.setText("??");
            text3.setText("??");
            text4.setText("????");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("jim")) {
            text.setText("This character is pronounced as j in John");
            text2.setText("??");
            text3.setText("??");
            text4.setText("????");
            text5.setText("??");
        }
        if(GlobalS.chosenLetter.equals("ce")) {
            text.setText("This character is pronounced as ch in chain");
            text2.setText("??");
            text3.setText("??");
            text4.setText("????");
            text5.setText("??");
        }
        if(GlobalS.chosenLetter.equals("he")) {
            text.setText("This character is pronounced as h in human");
            text2.setText("??");
            text3.setText("??");
            text4.setText("????");
            text5.setText("??");
        }
        if(GlobalS.chosenLetter.equals("xe")) {
            text.setText("This character is pronounced as ch in bach"); //bad sentence fix later
            text2.setText("??");
            text3.setText("??");
            text4.setText("????");
            text5.setText("??");
        }
        if(GlobalS.chosenLetter.equals("dal")) {
            text.setText("This character is pronounced as as d in dig but softer"); //bad sentence fix later
            text2.setText("??");
            text3.setText("??");
            text4.setText("??");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("zal")) {
            text.setText("This character is pronounced as z in zoo");
            text2.setText("??");
            text3.setText("??");
            text4.setText("??");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("re")) {
            text.setText("This character is pronounced as rr in Spanish perro but softer");
            text2.setText("??");
            text3.setText("??");
            text4.setText("??");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("ze")) {
            text.setText("This character is pronounced as z in zoo"); //duplicate sentence different letter
            text2.setText("??");
            text3.setText("??");
            text4.setText("??");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("ze2")) {
            text.setText("This character is pronounced as s in measure");
            text2.setText("??");
            text3.setText("??");
            text4.setText("??");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("sin")) {
            text.setText("This character is pronounced as s in son");
            text2.setText("??");
            text3.setText("??");
            text4.setText("????");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("sin2")) {
            text.setText("This character is pronounced as sh in shame ");
            text2.setText("??");
            text3.setText("??");
            text4.setText("????");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("sad")) {
            text.setText("This character is pronounced as s in son"); //duplicate sentence
            text2.setText("??");
            text3.setText("??");
            text4.setText("????");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("zad")) {
            text.setText("This character is pronounced as z in zoo"); //duplicate sentence
            text2.setText("??");
            text3.setText("??");
            text4.setText("????");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("ta")) {
            text.setText("This character is pronounced as t in teach");
            text2.setText("??");
            text3.setText("????");
            text4.setText("??????");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("za")) {
            text.setText("This character is pronounced as z in zoo"); //duplicate sentence
            text2.setText("??");
            text3.setText("????");
            text4.setText("??????");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("ayn")) {
            text.setText("This character is pronounced as ??? in Arabic Qur'an");
            text2.setText("??");
            text3.setText("??");
            text4.setText("??");
            text5.setText("??");
        }
        if(GlobalS.chosenLetter.equals("gayn")) {
            text.setText("This character is pronounced as r in French Paris");
            text2.setText("??");
            text3.setText("??");
            text4.setText("??");
            text5.setText("??");
        }
        if(GlobalS.chosenLetter.equals("fe")) {
            text.setText("This character is pronounced as f in fish");
            text2.setText("??");
            text3.setText("??");
            text4.setText("????");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("qaf")) {
            text.setText("This character is pronounced as q in Arabic Qibla");
            text2.setText("??");
            text3.setText("??");
            text4.setText("????");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("kaf")) {
            text.setText("This character is pronounced as as k in king");
            text2.setText("??");
            text3.setText("??");
            text4.setText("????");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("gaf")) {
            text.setText("This character is pronounced as g in gift");
            text2.setText("??");
            text3.setText("????");
            text4.setText("??????");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("lam")) {
            text.setText("This character is pronounced as l in land");
            text2.setText("??");
            text3.setText("??");
            text4.setText("????");
            text5.setText("????");
        }
        if(GlobalS.chosenLetter.equals("mim")) {
            text.setText("This character is pronounced as  m in myth");
            text2.setText("??");
            text3.setText("??");
            text4.setText("????");
            text5.setText("????");
        }
=======
>>>>>>> 6b0642a750f59ba22352f2f0eac941089dd97423
    }

    public void changeScreen() {
        Intent intent = new Intent(MainActivity2.this, DrawActivity.class);
        startActivity(intent);
    }


}


