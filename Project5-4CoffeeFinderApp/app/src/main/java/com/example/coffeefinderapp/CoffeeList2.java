package com.example.coffeefinderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CoffeeList2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_list2);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_launcher2);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }
}
