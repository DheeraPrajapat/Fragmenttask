package com.example.fragmenttask.AlbumTab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.fragmenttask.Adapters.AlbumAdapter.AllSingerAdapter;
import com.example.fragmenttask.R;


public class AlbumTab2 extends Fragment {
    ListView listView;
    AllSingerAdapter allSingerAdapter;
    String[] artistName ={
            "Arjit Singh",
            "Badshah",
            "Alka Yangik",
            "Singga",
            "Gippy Grewal"
    };
    String[] artistType ={
            "All-rounder",
            "Hindi-Punjabi",
            "Hindi",
            "Punjabi",
            "Punjabi-Hindi",
    };
    String[] artistPhotos ={
            "https://upload.wikimedia.org/wikipedia/commons/0/0f/Arijit_5th_GiMA_Awards.jpg",
            "https://akm-img-a-in.tosshub.com/indiatoday/images/story/202005/badshah.jpeg?zqvHEdhFTbIBX5QSpdNWmUBDUcJQoC.v&size=1200:675",
            "https://225508-687545-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2019/02/Alka-Yagnik.jpg",
            "https://i.pinimg.com/originals/9a/4e/3f/9a4e3f505f359a0d6e110ab4b822b67f.jpg",
            "https://static.toiimg.com/photo/msid-67041424/67041424.jpg?128375"
    };

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
        allSingerAdapter=new AllSingerAdapter(getActivity(),artistName,artistType,artistPhotos);
        listView.setAdapter(allSingerAdapter);
    }
}