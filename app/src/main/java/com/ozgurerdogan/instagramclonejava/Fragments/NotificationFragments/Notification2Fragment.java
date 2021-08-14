package com.ozgurerdogan.instagramclonejava.Fragments.NotificationFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ozgurerdogan.instagramclonejava.Adapter.NotifyAdapter;
import com.ozgurerdogan.instagramclonejava.Model.NotifiyModel;
import com.ozgurerdogan.instagramclonejava.R;

import java.util.ArrayList;


public class Notification2Fragment extends Fragment {

    NotifiyModel model;
    ArrayList<NotifiyModel> arrayList;
    public Notification2Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_notification2, container, false);

        RecyclerView recyclerView=view.findViewById(R.id.notifyRecyclerView);

        arrayList =new ArrayList<>();
        arrayList.clear();
        arrayList.add(new NotifiyModel(R.drawable.storyimage_ebrar, "<b> Melike </b>: size bir mesaj gönderdi","just time"));
        arrayList.add(new NotifiyModel(R.drawable.storyimage_melike,"<b> Ebrar </b>: fotografınızı beğendi","1 hour ago"));
        arrayList.add(new NotifiyModel(R.drawable.storyimage_ozgur,"<b>Ebrar</b> : bir paylaşımda bulundu","1 hour ago"));
        arrayList.add(new NotifiyModel(R.drawable.storyimage_ebrar,"<b>Özgür </b>: yeni bir seyahat ekledi","2 hour ago"));
        arrayList.add(new NotifiyModel(R.drawable.storyimage_melike,"<b>Melike </b>: size bir mesaj gönderdi","3 hour ago"));
        arrayList.add(new NotifiyModel(R.drawable.storyimage_ozgur,"<b>Melike </b>: size oyun isteği gönderdi","5 hour ago"));
        arrayList.add(new NotifiyModel(R.drawable.storyimage_ebrar,"<b>Özgür </b>: paylaşımınıza yorum yaptı","1 day ago"));
        arrayList.add(new NotifiyModel(R.drawable.storyimage_ebrar, "<b> Melike </b>: size bir mesaj gönderdi","just time"));
        arrayList.add(new NotifiyModel(R.drawable.storyimage_melike,"<b> Ebrar </b>: fotografınızı beğendi","1 hour ago"));
        arrayList.add(new NotifiyModel(R.drawable.storyimage_ozgur,"<b>Ebrar</b> : bir paylaşımda bulundu","1 hour ago"));
        arrayList.add(new NotifiyModel(R.drawable.storyimage_ebrar,"<b>Özgür </b>: yeni bir seyahat ekledi","2 hour ago"));
        arrayList.add(new NotifiyModel(R.drawable.storyimage_melike,"<b>Melike </b>: size bir mesaj gönderdi","3 hour ago"));
        arrayList.add(new NotifiyModel(R.drawable.storyimage_ozgur,"<b>Melike </b>: size oyun isteği gönderdi","5 hour ago"));
        arrayList.add(new NotifiyModel(R.drawable.storyimage_ebrar,"<b>Özgür </b>: paylaşımınıza yorum yaptı","1 day ago"));

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new NotifyAdapter(arrayList,getContext()));



        return view;
    }
}