package com.example.rentacarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class listCarRental extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] name={"Enterprise Rent A Car", "Hertz Car Rental",
                "Budget Car Rental", "E Z Rent a Car", "Avis Car Rental",
                "Liberty Rental Cars Llc"};
        setListAdapter(new ArrayAdapter<String>(
                this, R.layout.activity_list_car_rental, R.id.textList, name));

    }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(
                        Intent.ACTION_VIEW, Uri.parse("https://www.enterprise.com/en/home.html")));
                break;
            case 1:
                startActivity(new Intent(
                        Intent.ACTION_VIEW, Uri.parse("https://www.hertz.com/")));
                break;
            case 2:
                startActivity(new Intent(
                        Intent.ACTION_VIEW, Uri.parse("https://www.budget.com/en/home")));
                break;
            case 3:
                startActivity(new Intent(
                        Intent.ACTION_VIEW, Uri.parse("https://www.affordableautofl.com/#")));
                break;
            case 4:
                startActivity(new Intent(
                        Intent.ACTION_VIEW, Uri.parse("https://www.avis.com/en/home")));
                break;
            case 5:
                startActivity(new Intent(
                        Intent.ACTION_VIEW, Uri.parse("https://www.libertyrentalcarsllc.com/")));
                break;
        }
    }
}
