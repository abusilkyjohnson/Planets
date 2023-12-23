package com.example.planetsdbz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Planet> planetArrayList;
    private  static  AbuCustomAdapter abuCustomAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1- AdapterView: a lisView
        listView = findViewById(R.id.listview);

        // 2- Data Source
        planetArrayList = new ArrayList<>();

        Planet vegeta = new Planet("Vegeta", "9.8 * 100",R.drawable.planetvegeta);
        planetArrayList.add(vegeta);

        abuCustomAdapter = new AbuCustomAdapter(planetArrayList,getApplicationContext());
        listView.setAdapter(abuCustomAdapter);

    }
}