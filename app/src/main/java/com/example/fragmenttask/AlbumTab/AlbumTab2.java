package com.example.fragmenttask.AlbumTab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.fragmenttask.R;


public class AlbumTab2 extends Fragment {
    ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_album_tab2, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view)
    {
        listView=view.findViewById(R.id.albumTabListView1);
    }
}