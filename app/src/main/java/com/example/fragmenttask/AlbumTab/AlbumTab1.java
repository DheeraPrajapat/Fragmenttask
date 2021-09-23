package com.example.fragmenttask.AlbumTab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmenttask.Classes.AlbumData;
import com.example.fragmenttask.R;

import java.util.ArrayList;

public class AlbumTab1 extends Fragment {
    RecyclerView recyclerView;
    ArrayList<AlbumData> albumData;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_album_tab1, container, false);
        recyclerView=view.findViewById(R.id.recyclerViewAlbum);
        //setTheValueInArrayList();
        return view;
    }

}