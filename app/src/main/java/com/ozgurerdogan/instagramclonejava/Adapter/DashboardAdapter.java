package com.ozgurerdogan.instagramclonejava.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ozgurerdogan.instagramclonejava.Model.DashboardModel;
import com.ozgurerdogan.instagramclonejava.R;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.DashboardViewHolder> {

    ArrayList<DashboardModel> list ;
    Context context;

    public DashboardAdapter(ArrayList<DashboardModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public DashboardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recycler_dashboard,parent,false);
        return new DashboardViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull DashboardViewHolder holder, int position) {
        DashboardModel model=list.get(position);

        holder.profileImg.setImageResource(model.getProfileImg());
        holder.name.setText(model.getName());
        holder.about.setText(model.getAbout());

        holder.postImg.setImageResource(model.getPostImg());
        holder.saveImg.setImageResource(model.getSaveImg());

        holder.like.setText(model.getLike());
        holder.comment.setText(model.getComment());
        holder.share.setText(model.getShare());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class DashboardViewHolder extends RecyclerView.ViewHolder {

        ImageView profileImg, postImg,saveImg;
        TextView name,about,like,comment,share;
        public DashboardViewHolder(@NonNull View itemView) {
            super(itemView);

            profileImg=itemView.findViewById(R.id.profileImg);
            postImg=itemView.findViewById(R.id.postImg);
            saveImg=itemView.findViewById(R.id.saveBookImg);

            name=itemView.findViewById(R.id.nameTxt);
            about=itemView.findViewById(R.id.aboutTxt);
            like=itemView.findViewById(R.id.likeTxt);
            comment=itemView.findViewById(R.id.commentTxt);
            share=itemView.findViewById(R.id.shareTxt);
        }
    }
}
