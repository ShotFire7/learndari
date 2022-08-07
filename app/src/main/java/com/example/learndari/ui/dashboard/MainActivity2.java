package com.example.learndari.ui.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
        TextView text = (TextView) findViewById(R.id.textView3);
        TextView text2 = (TextView) findViewById(R.id.textView9);
        TextView text3 = (TextView) findViewById(R.id.textView10);
        TextView text4 = (TextView) findViewById(R.id.textView11);
        TextView text5 = (TextView) findViewById(R.id.textView12);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.drawLetter = text2.getText().toString();
                changeScreen();
                DrawActivity drawActivity = new DrawActivity();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.drawLetter = text3.getText().toString();
                changeScreen();
                DrawActivity drawActivity = new DrawActivity();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.drawLetter = text4.getText().toString();
                changeScreen();
                DrawActivity drawActivity = new DrawActivity();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.drawLetter = text5.getText().toString();
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
    }//todo fix screen rotation on drawing & add support for smaller screens later

    @SuppressLint("SetTextI18n")
    public void printStarter() {
        TextView text = (TextView) findViewById(R.id.textView3);
        TextView text2 = (TextView) findViewById(R.id.textView9);
        TextView text3 = (TextView) findViewById(R.id.textView10);
        TextView text4 = (TextView) findViewById(R.id.textView11);
        TextView text5 = (TextView) findViewById(R.id.textView12);
        switch (GlobalS.chosenLetter) {
            case "alef":  //TODO: figure out alif mad
                text.setText("This character is pronounced like aw in \"law,\" or as the \"o\" in \"hot\"");
                text2.setText("ا"); //later improve the constraints for the strings (see xml warnings)

                text3.setText("ا");
                text4.setText("ـا");
                text5.setText("ـا");
                break;
            case "be":
                text.setText("This character is pronounced as b in boy"); //change sentences to have better wording later

                text2.setText("ب");
                text3.setText("بـ");
                text4.setText("ـبـ");
                text5.setText("ـب");
                break;
            case "pe":
                text.setText("This character is pronounced as p as in pen");//todo fix

                text2.setText("پ");
                text3.setText("پـ");
                text4.setText("ـپـ");
                text5.setText("ـپ");
                break;
            case "te":
                text.setText("This character is pronounced as t in teach");
                text2.setText("ت");
                text3.setText("تـ");
                text4.setText("ـتـ");
                text5.setText("ـت");
                break;
            case "se":
                text.setText("This character is pronounced as s as in son");
                text2.setText("ث");
                text3.setText("ثـ");
                text4.setText("ـثـ");
                text5.setText("ـث");
                break;
            case "jim":
                text.setText("This character is pronounced as j in John");
                text2.setText("ج");
                text3.setText("جـ");
                text4.setText("ـجـ");
                text5.setText("ـج");
                break;
            case "ce":
                text.setText("This character is pronounced as ch in chain");
                text2.setText("چ");
                text3.setText("چـ");
                text4.setText("ـچـ");
                text5.setText("ـچ");
                break;
            case "he":
                text.setText("This character is pronounced as h in human");//todo fix this

                text2.setText("ح");
                text3.setText("حـ");
                text4.setText("ـحـ");
                text5.setText("ـح");
                break;
            case "xe":
                text.setText("This character is pronounced as how ch is pronounced in the German language"); //bad sentence fix later

                text2.setText("خ");
                text3.setText("خـ");
                text4.setText("ـخـ");
                text5.setText("ـخ");
                break;
            case "dal":
                text.setText("This character is pronounced as as d in dig but softer"); //bad sentence fix later

                text2.setText("د");
                text3.setText("د");
                text4.setText("ـد");
                text5.setText("ـد");//todo give the buttons a border in the fragments
                break;
            case "zal":
                text.setText("This character is pronounced as z in zoo");
                text2.setText("ذ");
                text3.setText("ذ");
                text4.setText("ـذ");
                text5.setText("ـذ");
                break;
            case "re":
                text.setText("This character is pronounced as rr in Spanish perro but softer");
                text2.setText("ر");
                text3.setText("ر");
                text4.setText("ـر");
                text5.setText("ـر");
                break;
            case "ze":
                text.setText("This character is pronounced as z in zoo"); //duplicate sentence different letter

                text2.setText("ز");
                text3.setText("ز");
                text4.setText("ـز");
                text5.setText("ـز");
                break;
            case "ze2":
                text.setText("This character is pronounced as s in measure");
                text2.setText("ژ");
                text3.setText("ژ");
                text4.setText("ـژ");
                text5.setText("ـژ");
                break;
            case "sin":
                text.setText("This character is pronounced as s in son");
                text2.setText("س");
                text3.setText("سـ");
                text4.setText("ـسـ");
                text5.setText("ـس");
                break;
            case "sin2":
                text.setText("This character is pronounced as sh in shame");
                text2.setText("ش");
                text3.setText("شـ");
                text4.setText("ـشـ");
                text5.setText("ـش");
                break;
            case "sad":
                text.setText("This character is pronounced as s in son"); //duplicate sentence

                text2.setText("ص");
                text3.setText("ص");
                text4.setText("ـص");
                text5.setText("ـص");
                break;
            case "zad":
                text.setText("This character is pronounced as z in zoo"); //duplicate sentence

                text2.setText("ض");
                text3.setText("صـ");
                text4.setText("ـصـ");
                text5.setText("ـص");
                break;
            case "ta":
                text.setText("This character is pronounced as t in teach");
                text2.setText("ط");
                text3.setText("طـ");
                text4.setText("ـطـ");
                text5.setText("ـط");
                break;
            case "za":
                text.setText("This character is pronounced as z in zoo"); //duplicate sentence

                text2.setText("ظ");
                text3.setText("ظـ");
                text4.setText("ـظـ");
                text5.setText("ـظ");
                break;
            case "ayn":
                text.setText("This character is an intermediary in words like ‘ in Arabic Qur'an");
                text2.setText("ع");
                text3.setText("عـ");
                text4.setText("ـعـ");
                text5.setText("ـع");
                break;
            case "gayn":
                text.setText("This character is pronounced as r in French Paris");
                text2.setText("غ");
                text3.setText("غـ");
                text4.setText("ـغـ");
                text5.setText("ـغ");
                break;
            case "fe":
                text.setText("This character is pronounced as f in fish");
                text2.setText("ف");
                text3.setText("فـ");
                text4.setText("ـفـ");
                text5.setText("ـف");
                break;
            case "qaf":
                text.setText("This character is pronounced as q in Arabic Qibla");
                text2.setText("ق");
                text3.setText("قـ");
                text4.setText("ـقـ");
                text5.setText("ـق");
                break;
            case "kaf":
                text.setText("This character is pronounced as as k in king");
                text2.setText("ک");
                text3.setText("كـ");
                text4.setText("ـكـ");
                text5.setText("ـك");
                break;
            case "gaf": //s
                text.setText("This character is pronounced as g in gift");
                text2.setText("گ");
                text3.setText("گـ");
                text4.setText("ـگـ");
                text5.setText("ـگ");
                break;
            case "lam":
                text.setText("This character is pronounced as l in land");
                text2.setText("ل");
                text3.setText("لـ");
                text4.setText("ـلـ");
                text5.setText("ـل");
                break;
            case "mim":
                text.setText("This character is pronounced as m in myth");
                text2.setText("م");
                text3.setText("مـ");
                text4.setText("ـمـ");
                text5.setText("ـم");
                break;
            case "nun":
                text.setText("This character is pronounced as n in new");
                text2.setText("ن");
                text3.setText("نـ");
                text4.setText("ـنـ");
                text5.setText("ـن");
                break;
            case "waw":
                text.setText("This character is pronounced as w in wet; oo in pool; as oa in coat");
                text2.setText("و");
                text3.setText("و");
                text4.setText("و");
                text5.setText("ـو");
                break;
            case "he2":
                text.setText("This character is pronounced as as h in human; as o in hot");
                text2.setText("ه");
                text3.setText("ـو");
                text4.setText("ه");//s

                text5.setText("ـو");
                break;
            case "ya":
                text.setText("This character is pronounced as as y in yes; as y in sky; as ea in seat; as a in may");
                text2.setText("ى");
                text3.setText("يـ");
                text4.setText("ـيـ");
                text5.setText("ـي");
                break;
        }
    }

    public void changeScreen() {
        Intent intent = new Intent(MainActivity2.this, DrawActivity.class);
        startActivity(intent);
    }


}


