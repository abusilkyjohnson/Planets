package com.example.planetsdbz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AbuCustomAdapter extends ArrayAdapter<Planet> {

    // Use Custom Layout --> AbuCustomAdapter
    // using a custom list here(arrayList)

    private ArrayList<Planet> planetArrayList; //using this because we need our model class
    Context context;

    //used the alt inset trick here
    public AbuCustomAdapter(ArrayList<Planet> planetArrayList, Context context) {
        super(context, R.layout.planet_list_layout, planetArrayList);//the layout is the template n the list use our model
        this.planetArrayList = planetArrayList;
        this.context = context;
    }

    private  static class  PlanetViewHolder{
        TextView planetName;
        TextView gravity;
        ImageView planetImg;
    }

    // getView(): used to create and return a view for a
    //            specific item in the list.
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //1_ Gets the planet
        Planet planet = getItem(position);

        //2- Inflate(Show) Layout
        PlanetViewHolder planetViewHolder;
        final View result;

        if(convertView == null){
            planetViewHolder = new PlanetViewHolder();
            //LayoutInflater: class use to instantiate & inflate xml layout file
            LayoutInflater inflater = LayoutInflater.from(getContext());
        }

    }
}
