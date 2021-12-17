package com.example.mprprojek;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Detail extends AppCompatActivity {
    ImageButton butExp, butAcc, butHome;
    TextView barNama, barImageText, butonoffsound;
    ImageView barImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String textplus = "Hi, I am ";
        String  text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        final MediaPlayer mp;

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

        butHome = (ImageButton) findViewById(R.id.buthome);
        butHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goHomeMenu();
            }
        });

        barNama = (TextView) findViewById(R.id.barNama);
        barImageText = (TextView) findViewById(R.id.barImageText);
        barImage = (ImageView)findViewById(R.id.barImage);

        barNama.setText(textplus + text);
        barImageText.setText(text);

        butonoffsound = (TextView) findViewById(R.id.butonoffsound);

        if (text.equals("Banana")) barImage.setImageResource(R.drawable.imgstrawberry);
        if (text.equals("Watermelon"))barImage.setImageResource(R.drawable.imgwatermelon);
        if (text.equals("Pear"))barImage.setImageResource(R.drawable.imgpear);
        if (text.equals("Mango")) barImage.setImageResource(R.drawable.imgmango);
        if (text.equals("Lemon")) barImage.setImageResource(R.drawable.imglemon);
        if (text.equals("Apple")) barImage.setImageResource(R.drawable.imgapple);
        if (text.equals("Avocado")) barImage.setImageResource(R.drawable.imgavocado);
        if (text.equals("Cherry")) barImage.setImageResource(R.drawable.imgcherry);
        if (text.equals("Corn")) barImage.setImageResource(R.drawable.imgcorn);
        if (text.equals("Dragon Fruit")) barImage.setImageResource(R.drawable.imgdragonfruit);
        if (text.equals("Grapes")) barImage.setImageResource(R.drawable.imggrape);
        if (text.equals("Pumpkin")) barImage.setImageResource(R.drawable.imgpumpkin);
        if (text.equals("Mangoesteen")) barImage.setImageResource(R.drawable.imgmangoesteen);
        if (text.equals("Orange")) barImage.setImageResource(R.drawable.imgorange);
        if (text.equals("Strawberry")) barImage.setImageResource(R.drawable.imgstrawberry);
        if (text.equals("Tomato")) barImage.setImageResource(R.drawable.imgtomato);

    }

    public void goExploreMenu() {
        Intent intent = new Intent(this, Explore.class);
        startActivity(intent);
    }

    public void goUserMenu() {
        Intent intent = new Intent(this, Account.class);
        startActivity(intent);
    }
    public void goHomeMenu() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

}