package com.example.codetribe.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button TravelandTourism,btnPolitics,btnback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TravelandTourism=(Button)findViewById(R.id.btntravel);
        btnPolitics=(Button)findViewById(R.id.btnPolitic);
        btnback = (Button)findViewById(R.id.btnBack);



        TravelandTourism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent intent=new Intent(MainActivity.this,Quiz2.class);
                startActivity(intent);

            }
        });


        btnPolitics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Quiz3.class);
                startActivity(intent);
            }
        });


    }



}
