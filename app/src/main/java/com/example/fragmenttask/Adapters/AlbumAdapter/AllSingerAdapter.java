package com.example.fragmenttask.Adapters.AlbumAdapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.example.fragmenttask.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class AllSingerAdapter extends ArrayAdapter<String>
{
    Activity context;
    private final String[] Singername;
    private final String[] Singertype;
    private final String[] imageUrl;

    public AllSingerAdapter(@NonNull Activity context, String[] name, String[] type, String[] imageUrl) {
        super(context,R.layout.listview_item,name);
        this.context=context;
        this.Singername = name;
        this.Singertype = type;
        this.imageUrl = imageUrl;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        @SuppressLint("ViewHolder") View view=LayoutInflater.from(context).inflate(R.layout.listview_item, null,true);
        TextView name,type;
        CircleImageView singerImage;
        name=view.findViewById(R.id.singerName);
        type=view.findViewById(R.id.singerType);
        singerImage=view.findViewById(R.id.listViewSingerImage);

        name.setText(Singername[position]);
        type.setText(Singertype[position]);
        if(imageUrl[position].equals("none")){
            singerImage.setImageResource(R.drawable.ic_round_person_24);
        }else{
            Glide.with(context).load(imageUrl[position]).into(singerImage);
        }
        return view;
    }
}
