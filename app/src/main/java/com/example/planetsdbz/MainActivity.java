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
        //Most planet gravity are wrong in term of accuracy to anime
        Planet vegeta = new Planet("Vegeta", "9.8 * 100 metres per second squared",R.drawable.planetvegeta);
        Planet namek = new Planet("Namek", "9.8 * 50 metres per second squared",R.drawable.planetnamek);
        Planet aralia = new Planet("Arlia", "9.8 * 100 metres per second squared",R.drawable.planetarlia);
        Planet beenz = new Planet("Beanz", "9.8 * 100 metres per second squared",R.drawable.planetbeenz);
        Planet frieza = new Planet("Frieza", "9.8 * 150 metres per second squared",R.drawable.planetfrieza);
        Planet luud = new Planet("Luud", "9.8 * 100 metres per second squared",R.drawable.planetluud);
        Planet polaris = new Planet("Polaris", "9.8 * 100 metres per second squared",R.drawable.planetpolaris);
        Planet tuffle = new Planet("Tuffle", "9.8 * 100 metres per second squared",R.drawable.planettuffle);
        Planet yardat = new Planet("Vegeta", "9.8 * 70 metres per second squared",R.drawable.planetyardrat);
        Planet earth = new Planet("Earth", "9.8 * 10 metres per second squared",R.drawable.planetearth);
        Planet makyostar = new Planet("Makyo Star", "9.8 * 100 metres per second squared",R.drawable.planetmakyostar);


        planetArrayList.add(vegeta);
        planetArrayList.add(aralia);
        planetArrayList.add(beenz);
        planetArrayList.add(namek);
        planetArrayList.add(frieza);
        planetArrayList.add(luud);
        planetArrayList.add(polaris);
        planetArrayList.add(tuffle);
        planetArrayList.add(yardat);
        planetArrayList.add(earth);
        planetArrayList.add(makyostar);

        abuCustomAdapter = new AbuCustomAdapter(planetArrayList,getApplicationContext());
        listView.setAdapter(abuCustomAdapter);

    }
}