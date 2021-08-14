package com.ozgurerdogan.instagramclonejava.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ozgurerdogan.instagramclonejava.Model.StoryModel;
import com.ozgurerdogan.instagramclonejava.R;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.Holder>{

    ArrayList<StoryModel> modelArrayList;
    Context context;

    public StoryAdapter(ArrayList<StoryModel> modelArrayList, Context context) {
        this.modelArrayList = modelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(context).inflate(R.layout.recycler_story,parent,false));
    }


    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        StoryModel model=modelArrayList.get(position);
        holder.storyImg.setImageResource(model.getStoryImg());
        holder.storyTypeImg.setImageResource(model.getStoryType());
        holder.name.setText(model.getName());
        holder.profileImg.setImageResource(model.getProfileImg());
    }


    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        ImageView storyImg,profileImg,storyTypeImg;
        TextView name;
        public Holder(@NonNull View itemView) {
            super(itemView);

            storyImg=itemView.findViewById(R.id.storyImg);
            profileImg=itemView.findViewById(R.id.profileImg);
            storyTypeImg=itemView.findViewById(R.id.storyType);
            name=itemView.findViewById(R.id.name);
        }
    }
}
