package com.example.jandroid.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class MuseumsFragment extends Fragment {
    public MuseumsFragment() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("The Cyprus Museum", R.drawable.cyprusmuseum, "998765432", "10:30-17:30"));
        places.add(new Place("Kornesios Mansion", R.drawable.kornesios, "997765432", "10:30-18:30"));
        places.add(new Place("Limassol Castle", R.drawable.limassolcastle, "999765432", "09:30-20:30"));
        places.add(new Place("Motorcycle Museum", R.drawable.motorcyclemuseum, "998765332", "14:30-20:30"));
        places.add(new Place("Leventis Gallery", R.drawable.leventis, "998765832", "15:30-20:30"));
        places.add(new Place("National Struggle Museum", R.drawable.struggle, "993765432", "10:30-18:30"));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }
}