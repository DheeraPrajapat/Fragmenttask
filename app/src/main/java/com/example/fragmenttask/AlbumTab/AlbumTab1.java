package com.example.fragmenttask.AlbumTab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmenttask.Classes.AlbumData;
import com.example.fragmenttask.DataAdapter.ArtistDataAdapter;
import com.example.fragmenttask.R;

import java.util.ArrayList;

public class AlbumTab1 extends Fragment {
    RecyclerView recyclerView;
    ArrayList<AlbumData> albumData;
    ArtistDataAdapter artistDataAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_album_tab1, container, false);
        setTheValueInArrayList();
        recyclerView=view.findViewById(R.id.recyclerViewAlbum);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        artistDataAdapter=new ArtistDataAdapter(albumData,getContext());
        recyclerView.setAdapter(artistDataAdapter);

        return view;
    }

    private void setTheValueInArrayList() {
        albumData=new ArrayList<>();
        albumData.add(new AlbumData("Singaa","Punjabi","Chandigarh","344","242","433","34","78","432","https://i.pinimg.com/originals/9a/4e/3f/9a4e3f505f359a0d6e110ab4b822b67f.jpg"));
    }

}