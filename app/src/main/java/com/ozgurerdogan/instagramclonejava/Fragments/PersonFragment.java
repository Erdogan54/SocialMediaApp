package com.ozgurerdogan.instagramclonejava.Fragments;

import android.graphics.ColorSpace;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.ozgurerdogan.instagramclonejava.Adapter.FriendsAdapter;
import com.ozgurerdogan.instagramclonejava.Model.FriendsModel;
import com.ozgurerdogan.instagramclonejava.R;

import java.util.ArrayList;


public class PersonFragment extends Fragment {

    ArrayList<FriendsModel> modelArrayList=new ArrayList<>();
    FriendsModel model;

    public PersonFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_profile, container, false);


        modelArrayList.add(model=new FriendsModel(R.drawable.storyimage_ebrar));
        modelArrayList.add(model=new FriendsModel(R.drawable.storyimage_ozgur));
        modelArrayList.add(model=new FriendsModel(R.drawable.storyimage_melike));
        modelArrayList.add(model=new FriendsModel(R.drawable.storyimage_ozgur));
        modelArrayList.add(model=new FriendsModel(R.drawable.storyimage_ebrar));
        modelArrayList.add(model=new FriendsModel(R.drawable.storyimage_ebrar));
        modelArrayList.add(model=new FriendsModel(R.drawable.storyimage_ozgur));
        modelArrayList.add(model=new FriendsModel(R.drawable.storyimage_melike));
        modelArrayList.add(model=new FriendsModel(R.drawable.storyimage_ozgur));

        RecyclerView recyclerView=view.findViewById(R.id.recycler_friends);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        FriendsAdapter adapter=new FriendsAdapter(modelArrayList,getContext());
        recyclerView.setAdapter(adapter);


        return view;
    }
}