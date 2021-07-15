package com.example.jandroid.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ArcheologicalSitesFragment extends Fragment {
    public ArcheologicalSitesFragment() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Tamassos", R.drawable.tamassos, "998765432", "10:30-17:30"));
        places.add(new Place("Ancient Kition", R.drawable.kition, "997765432", "10:30-18:30"));
        places.add(new Place("Paphos Mosaics", R.drawable.mosaics, "999765432", "09:30-20:30"));
        places.add(new Place("Sanctuary od Apollo", R.drawable.apollo, "998765332", "14:30-20:30"));
        places.add(new Place("Ancient Idalion", R.drawable.idalion, "998765832", "15:30-20:30"));
        places.add(new Place("Ancient Salamis", R.drawable.salamis, "993765432", "10:30-18:30"));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }
}



