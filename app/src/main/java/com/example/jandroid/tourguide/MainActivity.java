package com.example.jandroid.tourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager2 viewPager = (ViewPager2) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        FragmentAdapter fAdapter = new FragmentAdapter(getSupportFragmentManager(), getLifecycle());

        // Set the adapter onto the view pager
        viewPager.setAdapter(fAdapter);

    }
}