package com.example.learndari.ui.dashboard;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        if (GlobalS.lessonNumber.equals(1)) {
            lessonText.setText("Lesson 1 - Articles");
            theLesson.setText("In the english language, we use the word \"a\" before nouns in sentences like \"I read a book.\" In the Dari language, when using the article, \"the\" before a noun, you would use \"ی\" (y) at the end of a word. For example, tne word for \"book\" is \"کتاب\" (ketāb), so \"a book\" would be written as \"کتابی\" (ketābey). When using the article \"the\" in Dari, the word is left alone with no change, so \"کتاب\" (ketāb) can also mean \"the book.\"");
        }
        //TODO: fix scrollview, add a quiz after that quizzes on how to say "a table"







    }





}


