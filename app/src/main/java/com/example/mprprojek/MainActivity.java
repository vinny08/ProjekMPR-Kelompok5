package com.example.mprprojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
    ImageButton butStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butStart = (ImageButton) findViewById(R.id.startMenu);
        butStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goStartMenu();
            }
        });

    }

    public void goStartMenu() {
        Intent intent = new Intent(this, Home.class);
        //intent.putExtra(EXTRA_TEXT,text);
        startActivity(intent);
    }

}