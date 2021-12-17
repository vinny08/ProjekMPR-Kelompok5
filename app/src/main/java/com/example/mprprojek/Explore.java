package com.example.mprprojek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Explore extends AppCompatActivity {

    ImageButton butHome, butAcc;
    TextView txtSeeAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        butHome = (ImageButton) findViewById(R.id.buthome);
        butHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goHomeMenu();
            }
        });

        butAcc = (ImageButton) findViewById(R.id.butuser);
        butAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goUserMenu();
            }
        });

        txtSeeAll = (TextView) findViewById(R.id.txtseeall);
        txtSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { goHomeMenu(); }
        });
    }
    public void goHomeMenu() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void goUserMenu() {
        Intent intent = new Intent(this, Account.class);
        startActivity(intent);
    }
}