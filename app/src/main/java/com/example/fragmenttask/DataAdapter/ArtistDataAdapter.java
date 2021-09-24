package com.example.fragmenttask.DataAdapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fragmenttask.Classes.AlbumData;
import com.example.fragmenttask.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ArtistDataAdapter extends RecyclerView.Adapter<ArtistDataAdapter.ArtistViewholder>
{
    ArrayList<AlbumData> albumData;
    Context context;

    public ArtistDataAdapter(ArrayList<AlbumData> albumData, Context context) {
        this.albumData = albumData;
        this.context = context;
    }

    @NonNull
    @Override
    public ArtistViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recyclerview_item,null,false);
        return new ArtistViewholder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ArtistViewholder holder, int position) {
        holder.name.setText(albumData.get(position).getArtistName());
        holder.type.setText(albumData.get(position).getArtistType());
        holder.address.setText(albumData.get(position).getArtistAddress());
        holder.viewCounter.setText("Views : "+albumData.get(position).getViewCounter());
        holder.like.setText(albumData.get(position).getLikeCounter());
        holder.share.setText(albumData.get(position).getShareCounter());
        holder.repost.setText(albumData.get(position).getRepostCounter());
        holder.member.setText(albumData.get(position).getMemberCounter());
        holder.video.setText(albumData.get(position).getVideoCounter());
        //holder.name.setText(albumData.get(position).getArtistName());
        if(albumData.get(position).getImageUrl().equals("default")){
        holder.imageView.setImageResource(R.drawable.ic_round_person_24);}
        else{
            Glide.with(context).load(albumData.get(position).getImageUrl()).into(holder.imageView);
        }

    }

    @Override
    public int getItemCount() {
        return albumData.size();
    }

    static class ArtistViewholder extends RecyclerView.ViewHolder
    {
        TextView name,type,address,like,member,repost,share,video,viewCounter;
        ImageView imageView;
        public ArtistViewholder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.userName);
            address=itemView.findViewById(R.id.userAddress);
            type=itemView.findViewById(R.id.userOccupation);
            like=itemView.findViewById(R.id.likeCounter);
            member=itemView.findViewById(R.id.groupCounter);
            repost=itemView.findViewById(R.id.repostCounter);
            share=itemView.findViewById(R.id.shareCounter);
            video=itemView.findViewById(R.id.liveCounter);
            viewCounter=itemView.findViewById(R.id.userViews);
            imageView=itemView.findViewById(R.id.userImage);
        }
    }
}
