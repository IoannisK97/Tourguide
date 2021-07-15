package com.example.jandroid.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class TheatresFragment extends Fragment {
    public TheatresFragment() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Satiriko",R.drawable.satiriko,"998765432","10:30-22:30"));
        places.add(new Place("Thoc",R.drawable.thoc,"997765432","10:30-00:30"));
        places.add(new Place("Pattihio",R.drawable.pattihio,"999765432","18:30-21:30"));
        places.add(new Place("Rialto",R.drawable.rialto,"998765332","12:30-23:30"));
        places.add(new Place("Dentro",R.drawable.dentro,"998765832","15:30-22:30"));
        places.add(new Place("Markidio",R.drawable.markidio,"993765432","10:30-23:30"));

        PlaceAdapter adapter=new PlaceAdapter(getActivity(),places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}