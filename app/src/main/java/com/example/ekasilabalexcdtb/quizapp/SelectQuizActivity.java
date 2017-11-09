package com.example.ekasilabalexcdtb.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SelectQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_quiz);

        TextView txtPersonal = (TextView) findViewById(R.id.personal);
        TextView txtProf = (TextView) findViewById(R.id.profession);
        TextView txtAbout = (TextView) findViewById(R.id.about);
        TextView txtMainMenu = (TextView) findViewById(R.id.mainmenu);

        txtPersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectQuizActivity.this, GeneralActivity.class);
                startActivity(intent);
            }
        });

        txtProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectQuizActivity.this, MathsQuizActivity.class);
                startActivity(intent);
            }
        });

        txtAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectQuizActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        txtMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectQuizActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
