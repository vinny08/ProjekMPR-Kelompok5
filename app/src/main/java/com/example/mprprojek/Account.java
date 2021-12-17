package com.example.mprprojek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Account extends AppCompatActivity {

    ImageButton butHome, butExp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        butHome = (ImageButton) findViewById(R.id.buthome);
        butHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goHomeMenu();
            }
        });

        butExp = (ImageButton) findViewById(R.id.butfave);
        butExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goExploreMenu();
            }
        });
    }

    public void goHomeMenu() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void goExploreMenu() {
        Intent intent = new Intent(this, Explore.class);
        startActivity(intent);
    }

}