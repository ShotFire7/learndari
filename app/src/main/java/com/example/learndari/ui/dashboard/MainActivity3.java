package com.example.learndari.ui.dashboard;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.learndari.R;

public class MainActivity3 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson); //NOPE


//        Button backbtn = (Button) findViewById(R.id.button3); // ay yo maybe make a fancier back button like those arrows in the top left later
//        backbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });

        TextView lessonText = (TextView) findViewById(R.id.lessonText);
        TextView theLesson = (TextView) findViewById(R.id.theLesson);
//        TextView textQ = (TextView) findViewById(R.id.textQ);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        if (GlobalS.lessonNumber.equals(1)) {
            lessonText.setText("Lesson 1 - Alef");
            theLesson.setText("This character is pronounced like aw in \"law,\" or as the \"o\" in \"hot\"");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.alifsound);
                   mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(2)) {
            lessonText.setText("Lesson 2 - Be");
            theLesson.setText("This character is pronounced as b in boy");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.besound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(3)) {
            lessonText.setText("Lesson 3 - Pe");
            theLesson.setText("This character is pronounced as p as in pen");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.pesound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(4)) {
            lessonText.setText("Lesson 4 - Te");
            theLesson.setText("This character is pronounced as t in teach");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.tesound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(5)) {
            lessonText.setText("Lesson 5 - Se");
            theLesson.setText("This character is pronounced as s as in son. TIP: there are a few other letters with the same pronunciation as this one.");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.sesound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(6)) {
            lessonText.setText("Lesson 6 - Jim");
            theLesson.setText("This character is pronounced as j in John");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.jimsound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(7)) {
            lessonText.setText("Lesson 7 - Ce");
            theLesson.setText("This character is pronounced as ch in chain");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.chsound); //todo check if correct sound
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(8)) {
            lessonText.setText("Lesson 8 - He");
            theLesson.setText("This character is pronounced as h in human");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.hsound); //todo check if right
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(9)) {
            lessonText.setText("Lesson 9 - Xe");
            theLesson.setText("To make the sound of this letter, tighten the back of your mouth when you make the \"k\" sound in english, and breathe out as if you're making the \"h\" sound. You may need an audio tutorial to learn this sound.");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.khsound); //todo check
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(10)) {
            lessonText.setText("Lesson 10 - Dal");
            theLesson.setText("This character is pronounced as as d in dig but softer");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.dalsound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(11)) {
            lessonText.setText("Lesson 11 - Zal");
            theLesson.setText("This character is pronounced as z in zoo. TIP: There is no difference in pronunciation between the letters ذ (zāl), ز (ze), ض (zād), and ظ (zā). They all have the sound [z]. The letters ض and ظ only occur in words of Arabic origin.");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.zalsound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(12)) {
            lessonText.setText("Lesson 12 - Re");
            theLesson.setText("This character is pronounced as rr in Spanish perro but softer. To make the sound of this letter, lightly hit your tounge against the top of your mouth. An audio tutorial may be required.");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.resound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(13)) {
            lessonText.setText("Lesson 13 - Ze");
            theLesson.setText("This character is pronounced as z as in zoo. TIP: There is no difference in pronunciation between the letters ذ (zāl), ز (ze), ض (zād), and ظ (zā). They all have the sound [z]. The letters ض and ظ only occur in words of Arabic origin.");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.zesound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(14)) {
            lessonText.setText("Lesson 14 - že");
            theLesson.setText("This letter is pronounced as the s in measure.");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.zhesound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(15)) {
            lessonText.setText("Lesson 15 - Sin");
            theLesson.setText("This letter is pronounced as s in son. TIP: there are a few other letters with the same pronunciation as this one.");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.sinsound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(16)) {
            lessonText.setText("Lesson 16 - šin");
            theLesson.setText("This character is pronounced as sh in shame");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.shinsound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(17)) {
            lessonText.setText("Lesson 17 - Sad");
            theLesson.setText("This letter is pronounced as s in son. TIP: there are a few other letters with the same pronunciation as this one.");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.sadsound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(32)) {
            lessonText.setText("Lesson 17 - Zad");
            theLesson.setText("This character is pronounced as z in zoo. TIP: There is no difference in pronunciation between the letters ذ (zāl), ز (ze), ض (zād), and ظ (zā). They all have the sound [z]. The letters ض and ظ only occur in words of Arabic origin.");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.sadsound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(18)) {
            lessonText.setText("Lesson 18 - Ta");
            theLesson.setText("This character is pronounced as t in teach. TIP: there is another letter with the same pronunciation as this one.");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.tasound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(19)) {
            lessonText.setText("Lesson 19 - Za");
            theLesson.setText("This character is pronounced as z in zoo. TIP: There is no difference in pronunciation between the letters ذ (zāl), ز (ze), ض (zād), and ظ (zā). They all have the sound [z]. The letters ض and ظ only occur in words of Arabic origin.");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.zasound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(20)) {
            lessonText.setText("Lesson 20 - Ayn");
            theLesson.setText("This character is an intermediary in words like ‘ in Arabic Qur'an.");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.aynsound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(21)) {
            lessonText.setText("Lesson 21 - Ghayn");
            theLesson.setText("This character is pronounced as r in French Paris. It is pronounced as a softer version of the \"xe\" letter (or kh sound). An audio tutorial may be needed.");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.ghaynsound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(22)) {
            lessonText.setText("Lesson 22 - Fe");
            theLesson.setText("This character is pronounced as f in fish");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.fesound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(23)) {
            lessonText.setText("Lesson 23 - Qaf");
            theLesson.setText("This character is pronounced as q in Arabic Qibla. To make the sound of this letter, tighten the very back of your mouth and make a \"k\" sound at the very back of your mouth. An audio tutorial may be needed.");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.qafsound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(24)) {
            lessonText.setText("Lesson 24 - Kaf");
            theLesson.setText("This character is pronounced as as k in king");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.kafsound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(25)) {
            lessonText.setText("Lesson 25 - Gaf");
            theLesson.setText("This character is pronounced as g in gift");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.gafsound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(26)) {
            lessonText.setText("Lesson 26 - Lam");
            theLesson.setText("This character is pronounced as l in land");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.lamsound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(27)) {
            lessonText.setText("Lesson 27 - Mim");
            theLesson.setText("This character is pronounced as m in main");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.mimsound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(28)) {
            lessonText.setText("Lesson 28 - Nun");
            theLesson.setText("This character is pronounced as n in new");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.nunsound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(29)) {
            lessonText.setText("Lesson 29 - Waw");
            theLesson.setText("This character has multiple pronunciations depending on the word. This is pronounced as w in wet; oo in pool; as oa in coat");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.wawsound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(30)) {
            lessonText.setText("Lesson 30 - He");
            theLesson.setText("This character has multiple pronunciations depending on the word. This character is pronounced as as h in human; as o in hot. There are two other characters with the same pronunciation");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.hahsound);
                    mp.start();
                }
            });
        } else if (GlobalS.lessonNumber.equals(31)) {
            lessonText.setText("Lesson 31 - Ya");
            theLesson.setText("This character has multiple pronunciations depending on the word. This character is pronounced as as y in yes; as y in sky; as ea in seat; as a in may");
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final MediaPlayer mp = MediaPlayer.create(MainActivity3.this, R.raw.yasound);
                    mp.start();
                }
            });
        }








    }





}


