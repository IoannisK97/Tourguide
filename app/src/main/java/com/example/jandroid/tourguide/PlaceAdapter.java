package com.example.jandroid.tourguide;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> Places) {
        super(context, 0,Places);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Place currentPlace = getItem(position);

        TextView name=(TextView) listItemView.findViewById(R.id.name);
        name.setText(currentPlace.getName());

        ImageView image=(ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(currentPlace.getImage());

        TextView telNum=(TextView) listItemView.findViewById(R.id.telNum);
        TextView hours=(TextView) listItemView.findViewById(R.id.hours);
        if (currentPlace.hasTelAndHours()==true) {
            telNum.setText(currentPlace.getTelNumber());
            hours.setText(currentPlace.getOpenHours());
            telNum.setVisibility(View.VISIBLE);
            hours.setVisibility(View.VISIBLE);

        }else{
            telNum.setVisibility(View.GONE);
            hours.setVisibility(View.GONE);
        }

        return listItemView;

    }
}
