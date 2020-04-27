package com.example.coffeefinderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CoffeeList0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_list0);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_launcher0);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }
}
