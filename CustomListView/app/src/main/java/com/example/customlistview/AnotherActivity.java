package com.example.customlistview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;

public class AnotherActivity extends MenuAppCompatActivity implements View.OnClickListener {

    ImageView imageView;
    TextView title, description, ratings, date, periode, enligne;
    int position;
    RatingBar ratingBar;
    Button addButton;
    Button buttonmessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
            // aslo set in menifest
        }

        imageView = findViewById(R.id.another_imageView);
        title = findViewById(R.id.titleText);
        date = findViewById(R.id.date2);
        periode = findViewById(R.id.periode2);
        enligne = findViewById(R.id.enligne2);
        description = findViewById(R.id.descriptionText);
        ratings= findViewById(R.id.rating);
        ratingBar = findViewById(R.id.ratingBar);
        addButton= findViewById(R.id.button);
        addButton.setOnClickListener(this);
        buttonmessage= findViewById(R.id.buttonmessage);
        buttonmessage.setOnClickListener(this);
        if (position == 0) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            String aRatings = intent.getStringExtra("ratings");
            String aDate= intent.getStringExtra("date");
            String aPeriode = intent.getStringExtra("periode");
            String aEnLigne = intent.getStringExtra("enligne");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            ratings.setText(aRatings);
            date.setText(aDate);
            periode.setText(aPeriode);
            enligne.setText(aEnLigne);
            description.setText(aDescription);
            ratingBar.setRating(Float.parseFloat(aRatings));


            actionBar.setTitle(aTitle);
            actionBar.setTitle(aDate);
            //actionBar.setTitle(aRatings);
        }

        if (position == 1) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            String aRatings = intent.getStringExtra("ratings");
            String aDate= intent.getStringExtra("date");
            String aPeriode = intent.getStringExtra("Periode");
            String aEnLigne = intent.getStringExtra("Enligne");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            ratings.setText(aRatings);
            date.setText(aDate);
            periode.setText(aPeriode);
            enligne.setText(aEnLigne);
            description.setText(aDescription);
            ratingBar.setRating(Float.parseFloat(aRatings));

            actionBar.setTitle(aTitle);
        }

        if (position == 2) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            String aRatings = intent.getStringExtra("ratings");
            String aDate= intent.getStringExtra("date");
            String aPeriode = intent.getStringExtra("Periode");
            String aEnLigne = intent.getStringExtra("Enligne");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            ratings.setText(aRatings);
            date.setText(aDate);
            periode.setText(aPeriode);
            enligne.setText(aEnLigne);
            description.setText(aDescription);
            ratingBar.setRating(Float.parseFloat(aRatings));


            actionBar.setTitle(aTitle);
        }

        if (position == 3) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            String aRatings = intent.getStringExtra("ratings");
            String aDate= intent.getStringExtra("date");
            String aPeriode = intent.getStringExtra("Periode");
            String aEnLigne = intent.getStringExtra("Enligne");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            ratings.setText(aRatings);
            date.setText(aDate);
            periode.setText(aPeriode);
            enligne.setText(aEnLigne);
            description.setText(aDescription);
            ratingBar.setRating(Float.parseFloat(aRatings));


            actionBar.setTitle(aTitle);
        }

        if (position == 4) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            String aRatings = intent.getStringExtra("ratings");
            String aDate= intent.getStringExtra("date");
            String aPeriode = intent.getStringExtra("Periode");
            String aEnLigne = intent.getStringExtra("Enligne");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            ratings.setText(aRatings);
            date.setText(aDate);
            periode.setText(aPeriode);
            enligne.setText(aEnLigne);
            description.setText(aDescription);
            ratingBar.setRating(Float.parseFloat(aRatings));


            actionBar.setTitle(aTitle);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Toast.makeText(this, "Class added to cart", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonmessage:
                Intent intent = new Intent(this, MessageActivity.class);
                startActivity(intent);
                break;
        }
    }


    // now check it
    // so friends this works perfectly..
    // friedns i have made some changes with list view, i hope you guys like these change with listview
    // first add card library in build.gradle
    // now move in row xml
    // now in activity main.xml
}
