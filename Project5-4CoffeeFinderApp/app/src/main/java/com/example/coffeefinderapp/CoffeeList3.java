package com.example.coffeefinderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CoffeeList3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_list3);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_launcher3);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }
}
