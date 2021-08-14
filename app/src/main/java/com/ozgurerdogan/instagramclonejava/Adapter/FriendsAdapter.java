package com.ozgurerdogan.instagramclonejava.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ozgurerdogan.instagramclonejava.Model.FriendsModel;
import com.ozgurerdogan.instagramclonejava.R;

import java.util.ArrayList;

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.FriendsHolder> {

    ArrayList<FriendsModel> list;
    Context context;

    public FriendsAdapter(ArrayList<FriendsModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public FriendsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recycler_friends,parent,false);
        return new FriendsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsHolder holder, int position) {
        FriendsModel model=new FriendsModel(list.get(position).getPicture());
        holder.profileImg.setImageResource(model.getPicture());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class FriendsHolder extends RecyclerView.ViewHolder {

        ImageView profileImg;
        public FriendsHolder(@NonNull View itemView) {
            super(itemView);
            profileImg=itemView.findViewById(R.id.profileImg);
        }
    }
}
