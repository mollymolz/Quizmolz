package com.example.codetribe.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Quiz3 extends AppCompatActivity {

    Question question= new Question();
    RadioButton a,b,c,d,e;
    RadioGroup grp1,grp2,grp3,grp4,grp5;
    Button btnscore;
    public static int sco=0;
    int sco1=0;
    int sco2=0;
    int sco3=0;
    int sco4=0;
    int sco5=0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);

        a= (RadioButton) findViewById(R.id.rbt2);
        b= (RadioButton)findViewById(R.id.rbt4);
        c= (RadioButton)findViewById(R.id.rbt8);
        d= (RadioButton)findViewById(R.id.rbt14);
        e= (RadioButton)findViewById(R.id.rbt18);

        grp1=(RadioGroup)findViewById(R.id.grp1);
        grp2=(RadioGroup)findViewById(R.id.grp2);
        grp3=(RadioGroup)findViewById(R.id.grp3);
        grp4=(RadioGroup)findViewById(R.id.grp4);
        grp5=(RadioGroup)findViewById(R.id.grp5);


        btnscore = (Button)findViewById(R.id.btnScore);

        btnscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setScore();
            }
        });

    }
    public void setScore(){
        question.setQ1(0);
        question.setQ2(1);
        if(a.isChecked()){
            sco1=question.getQ2();
        }
        else{
            sco1=question.getQ1();
        }
        if(b.isChecked()){
            sco2=question.getQ2();
        }
        else{
            sco2=question.getQ1();
        }
        if(c.isChecked()){
            sco3=question.getQ2();
        }
        else{
            sco3=question.getQ1();
        }
        if(d.isChecked()){
            sco4=question.getQ2();
        }
        else{
            sco4=question.getQ1();
        }
        if(e.isChecked()){
            sco5=question.getQ2();
        }
        else{
            sco5=question.getQ1();
        }
        sco=sco1 + sco2+ sco3+ sco4+ sco5;
        Toast.makeText(getApplicationContext(),"score is "+sco,Toast.LENGTH_SHORT).show();






    }

    }


