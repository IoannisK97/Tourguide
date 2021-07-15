package com.example.jandroid.tourguide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {

    public FragmentAdapter(@NonNull FragmentManager fm, Lifecycle lf) {
        super(fm,lf);
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Fragment createFragment(int position) {
        if (position==0){
            return new TheatresFragment();
        }
        else if (position==1){
            return new MuseumsFragment();
        }else if (position==2){
            return new BeachesFragment();
        } else
            return new ArcheologicalSitesFragment();

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
