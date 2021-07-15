package com.example.jandroid.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class BeachesFragment extends Fragment {
    public BeachesFragment(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Nissi Beach", R.drawable.nissi ));
        places.add(new Place("Lara Beach", R.drawable.lara));
        places.add(new Place("Konnos Beach", R.drawable.konnos));
        places.add(new Place("Fig tree bay", R.drawable.figtree));
        places.add(new Place("Pissouri", R.drawable.pissouri));
        places.add(new Place("Latchi", R.drawable.latchi));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }
}


