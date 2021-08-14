package com.ozgurerdogan.instagramclonejava.Adapter;


import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ozgurerdogan.instagramclonejava.Model.NotifiyModel;
import com.ozgurerdogan.instagramclonejava.R;

import java.util.ArrayList;

public class NotifyAdapter extends RecyclerView.Adapter<NotifyAdapter.Holder> {

    ArrayList<NotifiyModel> list;
    Context context;

    public NotifyAdapter(ArrayList<NotifiyModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recycler_notify,parent,false);
        return new Holder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        NotifiyModel model= list.get(position);

        holder.picture.setImageResource(model.getPicture());
        holder.notify.setText(Html.fromHtml(model.getNotify()));
        holder.time.setText(model.getTime());

    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        ImageView picture;
        TextView notify,time;

        public Holder(@NonNull View itemView) {
            super(itemView);

            picture=itemView.findViewById(R.id.profileImg);
            notify=itemView.findViewById(R.id.notifyProfileTxt);
            time=itemView.findViewById(R.id.notifyTimeTxt);
        }
    }
}
