package com.example.jacob.weed_map;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;

public class LegReview extends AppCompatActivity {

    float rating1 = (float) 4.0;
    float rating2 = (float) 4.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_review);

        RatingBar rb1 = findViewById(R.id.ratingBar);
        rb1.setRating(rating1);

        RatingBar rb2 = findViewById(R.id.ratingBar1);
        rb2.setRating(rating2);
    }
}
