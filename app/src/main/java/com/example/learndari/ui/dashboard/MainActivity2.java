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
            text2.setText("ا"); //later improve the constraints for the strings (see xml warnings)
            text3.setText("ا");
            text4.setText("ا");
            text5.setText("ـا");
        }
<<<<<<< HEAD
        if(GlobalS.chosenLetter.equals("be")) {
            text.setText("This character is pronounced as b in boy"); //change sentences to have better wording later
            text2.setText("ب");
            text3.setText("ب");
            text4.setText("ـب");
            text5.setText("ـب");
        }
        if(GlobalS.chosenLetter.equals("pe")) {
            text.setText("This character is pronounced as p as in pen");
            text2.setText("پ");
            text3.setText("پ");
            text4.setText("ـپ");
            text5.setText("ـپ");
        }
        if(GlobalS.chosenLetter.equals("te")) {
            text.setText("This character is pronounced as t in teach");
            text2.setText("ت");
            text3.setText("ت");
            text4.setText("ـت");
            text5.setText("ـت");
        }
        if(GlobalS.chosenLetter.equals("se")) {
            text.setText("This character is pronounced as s as in son");
            text2.setText("ث");
            text3.setText("ث");
            text4.setText("ـث");
            text5.setText("ـث");
        }
        if(GlobalS.chosenLetter.equals("jim")) {
            text.setText("This character is pronounced as j in John");
            text2.setText("ج");
            text3.setText("ج");
            text4.setText("ـج");
            text5.setText("ج");
        }
        if(GlobalS.chosenLetter.equals("ce")) {
            text.setText("This character is pronounced as ch in chain");
            text2.setText("چ");
            text3.setText("چ");
            text4.setText("ـچ");
            text5.setText("چ");
        }
        if(GlobalS.chosenLetter.equals("he")) {
            text.setText("This character is pronounced as h in human");
            text2.setText("ح");
            text3.setText("ح");
            text4.setText("ـح");
            text5.setText("ح");
        }
        if(GlobalS.chosenLetter.equals("xe")) {
            text.setText("This character is pronounced as ch in bach"); //bad sentence fix later
            text2.setText("خ");
            text3.setText("خ");
            text4.setText("ـخ");
            text5.setText("خ");
        }
        if(GlobalS.chosenLetter.equals("dal")) {
            text.setText("This character is pronounced as as d in dig but softer"); //bad sentence fix later
            text2.setText("د");
            text3.setText("د");
            text4.setText("د");
            text5.setText("ـد");
        }
        if(GlobalS.chosenLetter.equals("zal")) {
            text.setText("This character is pronounced as z in zoo");
            text2.setText("ذ");
            text3.setText("ذ");
            text4.setText("ذ");
            text5.setText("ـذ");
        }
        if(GlobalS.chosenLetter.equals("re")) {
            text.setText("This character is pronounced as rr in Spanish perro but softer");
            text2.setText("ر");
            text3.setText("ر");
            text4.setText("ر");
            text5.setText("ـر");
        }
        if(GlobalS.chosenLetter.equals("ze")) {
            text.setText("This character is pronounced as z in zoo"); //duplicate sentence different letter
            text2.setText("ز");
            text3.setText("ز");
            text4.setText("ز");
            text5.setText("ـز");
        }
        if(GlobalS.chosenLetter.equals("ze2")) {
            text.setText("This character is pronounced as s in measure");
            text2.setText("ژ");
            text3.setText("ژ");
            text4.setText("ژ");
            text5.setText("ـژ");
        }
        if(GlobalS.chosenLetter.equals("sin")) {
            text.setText("This character is pronounced as s in son");
            text2.setText("س");
            text3.setText("س");
            text4.setText("ـس");
            text5.setText("ـس");
        }
        if(GlobalS.chosenLetter.equals("sin2")) {
            text.setText("This character is pronounced as sh in shame ");
            text2.setText("ش");
            text3.setText("ش");
            text4.setText("ـش");
            text5.setText("ـش");
        }
        if(GlobalS.chosenLetter.equals("sad")) {
            text.setText("This character is pronounced as s in son"); //duplicate sentence
            text2.setText("ص");
            text3.setText("ص");
            text4.setText("ـص");
            text5.setText("ـص");
        }
        if(GlobalS.chosenLetter.equals("zad")) {
            text.setText("This character is pronounced as z in zoo"); //duplicate sentence
            text2.setText("ض");
            text3.setText("ض");
            text4.setText("ـض");
            text5.setText("ـض");
        }
        if(GlobalS.chosenLetter.equals("ta")) {
            text.setText("This character is pronounced as t in teach");
            text2.setText("ط");
            text3.setText("طـ");
            text4.setText("ـطـ");
            text5.setText("ـط");
        }
        if(GlobalS.chosenLetter.equals("za")) {
            text.setText("This character is pronounced as z in zoo"); //duplicate sentence
            text2.setText("ظ");
            text3.setText("ظـ");
            text4.setText("ـظـ");
            text5.setText("ـظ");
        }
        if(GlobalS.chosenLetter.equals("ayn")) {
            text.setText("This character is pronounced as ‘ in Arabic Qur'an");
            text2.setText("ع");
            text3.setText("ع");
            text4.setText("ع");
            text5.setText("ع");
        }
        if(GlobalS.chosenLetter.equals("gayn")) {
            text.setText("This character is pronounced as r in French Paris");
            text2.setText("غ");
            text3.setText("غ");
            text4.setText("غ");
            text5.setText("غ");
        }
        if(GlobalS.chosenLetter.equals("fe")) {
            text.setText("This character is pronounced as f in fish");
            text2.setText("ف");
            text3.setText("ف");
            text4.setText("ـف");
            text5.setText("ـف");
        }
        if(GlobalS.chosenLetter.equals("qaf")) {
            text.setText("This character is pronounced as q in Arabic Qibla");
            text2.setText("ق");
            text3.setText("ق");
            text4.setText("ـق");
            text5.setText("ـق");
        }
        if(GlobalS.chosenLetter.equals("kaf")) {
            text.setText("This character is pronounced as as k in king");
            text2.setText("ک");
            text3.setText("ك");
            text4.setText("ـك");
            text5.setText("ـک");
        }
        if(GlobalS.chosenLetter.equals("gaf")) {
            text.setText("This character is pronounced as g in gift");
            text2.setText("گ");
            text3.setText("گـ");
            text4.setText("ـگـ");
            text5.setText("ـگ");
        }
        if(GlobalS.chosenLetter.equals("lam")) {
            text.setText("This character is pronounced as l in land");
            text2.setText("ل");
            text3.setText("ل");
            text4.setText("ـل");
            text5.setText("ـل");
        }
        if(GlobalS.chosenLetter.equals("mim")) {
            text.setText("This character is pronounced as  m in myth");
            text2.setText("م");
            text3.setText("م");
            text4.setText("ـم");
            text5.setText("ـم");
        }
=======
>>>>>>> 6b0642a750f59ba22352f2f0eac941089dd97423
    }

    public void changeScreen() {
        Intent intent = new Intent(MainActivity2.this, DrawActivity.class);
        startActivity(intent);
    }


}


