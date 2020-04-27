package com.example.coffeefinderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] name={"Kahwa Coffee", "Bula Kava Bar Coffee House","Starbucks", "Dunkin'"};
        setListAdapter(new ArrayAdapter<String>(
                this, R.layout.activity_main, R.id.textList, name));


    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(MainActivity.this, CoffeeList0.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, CoffeeList1.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, CoffeeList2.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, CoffeeList3.class));
                break;
        }

    }
}
