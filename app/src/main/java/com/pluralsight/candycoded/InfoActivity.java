package com.pluralsight.candycoded;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Uri uri = Uri.parse("android.resource://com.codeschool.candycoded/" + R.drawable.store_front);
        ImageView candyStoreImageView = findViewById(R.id.image_view_candy_store);
        Picasso.with(this).
                load(uri).
                into(candyStoreImageView);

    }

    public void createMapIntent(View view){

        Uri googleURL = Uri.parse("geo:0,0?q=618 E South St Orlando, FL 32801");

        Intent googleMap = new Intent(Intent.ACTION_VIEW, googleURL);
        googleMap.setPackage("com.google.android.apps.maps");

        if (googleMap.resolveActivity(getPackageManager()) != null){
            startActivity(googleMap);
        }

    }
    public void createPhoneIntent(View view){
        Intent phoneIntent = new Intent(Intent.ACTION_DIAL);

        phoneIntent.setData(Uri.parse("tel:0123456789"));

        startActivity(phoneIntent);
    }

    // ***
    // TODO - Task 2 - Launch the Google Maps Activity
    // ***

    // ***
    // TODO - Task 3 - Launch the Phone Activity
    // ***
}
