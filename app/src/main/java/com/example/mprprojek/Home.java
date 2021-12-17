package com.example.mprprojek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
    ImageButton butExp, butAcc;
    TextView fruitTxt;
    TextView learns1, learns2, learns3, learns4, learns5, learns6, learns7, learns8;
    TextView learns9, learns10, learns11, learns12, learns13, learns14, learns15, learns16;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Intent intent = getIntent();

        butExp = (ImageButton) findViewById(R.id.butfave);
        butExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goExploreMenu();
            }
        });

        butAcc = (ImageButton) findViewById(R.id.butuser);
        butAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goUserMenu();
            }
        });

        learns1 = (TextView) findViewById(R.id.learn1);
        learns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fruitTxt = (TextView) findViewById(R.id.txt1);
                goDetailing();
            }
        });

        learns2 = (TextView) findViewById(R.id.learn2);
        learns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fruitTxt = (TextView) findViewById(R.id.txt2);
                goDetailing();
            }
        });

        learns3 = (TextView) findViewById(R.id.learn3);
        learns3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fruitTxt = (TextView) findViewById(R.id.txt3);
                goDetailing();
            }
        });

        learns4 = (TextView) findViewById(R.id.learn4);
        learns4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fruitTxt = (TextView) findViewById(R.id.txt4);
                goDetailing();
            }
        });

        learns5 = (TextView) findViewById(R.id.learn5);
        learns5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fruitTxt = (TextView) findViewById(R.id.txt5);
                goDetailing();
            }
        });

        learns6 = (TextView) findViewById(R.id.learn6);
        learns6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fruitTxt = (TextView) findViewById(R.id.txt6);
                goDetailing();
            }
        });

        learns7 = (TextView) findViewById(R.id.learn7);
        learns7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fruitTxt = (TextView) findViewById(R.id.txt7);
                goDetailing();
            }
        });

        learns8 = (TextView) findViewById(R.id.learn8);
        learns8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fruitTxt = (TextView) findViewById(R.id.txt8);
                goDetailing();
            }
        });

        learns9 = (TextView) findViewById(R.id.learn9);
        learns9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fruitTxt = (TextView) findViewById(R.id.txt9);
                goDetailing();
            }
        });

        learns10 = (TextView) findViewById(R.id.learn10);
        learns10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fruitTxt = (TextView) findViewById(R.id.txt10);
                goDetailing();
            }
        });

        learns11 = (TextView) findViewById(R.id.learn11);
        learns11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fruitTxt = (TextView) findViewById(R.id.txt11);
                goDetailing();
            }
        });

        learns12 = (TextView) findViewById(R.id.learn12);
        learns12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fruitTxt = (TextView) findViewById(R.id.txt12);
                goDetailing();
            }
        });

        learns13 = (TextView) findViewById(R.id.learn13);
        learns13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fruitTxt = (TextView) findViewById(R.id.txt13);
                goDetailing();
            }
        });

        learns14 = (TextView) findViewById(R.id.learn14);
        learns14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fruitTxt = (TextView) findViewById(R.id.txt14);
                goDetailing();
            }
        });

        learns15 = (TextView) findViewById(R.id.learn15);
        learns15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fruitTxt = (TextView) findViewById(R.id.txt15);
                goDetailing();
            }
        });

        learns16 = (TextView) findViewById(R.id.learn16);
        learns16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fruitTxt = (TextView) findViewById(R.id.txt16);
                goDetailing();
            }
        });
    }

    public void goExploreMenu() {
        Intent intent = new Intent(this, Explore.class);
        startActivity(intent);
    }

    public void goUserMenu() {
        Intent intent = new Intent(this, Account.class);
        startActivity(intent);
    }

    public void goDetailing(){
        String text = fruitTxt.getText().toString();
        Intent intent = new Intent(this, Detail.class);
        intent.putExtra(EXTRA_TEXT,text);
        startActivity(intent);
    }
}