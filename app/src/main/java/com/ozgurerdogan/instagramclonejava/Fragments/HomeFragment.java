package com.ozgurerdogan.instagramclonejava.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ozgurerdogan.instagramclonejava.Adapter.DashboardAdapter;
import com.ozgurerdogan.instagramclonejava.Adapter.StoryAdapter;
import com.ozgurerdogan.instagramclonejava.Model.DashboardModel;
import com.ozgurerdogan.instagramclonejava.Model.StoryModel;
import com.ozgurerdogan.instagramclonejava.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    RecyclerView recyclerViewStory,recyclerViewDashboard;
    ArrayList<StoryModel> storyList;
    ArrayList<DashboardModel> dashboardList;


    public HomeFragment() {
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
        View view= inflater.inflate(R.layout.fragment_home, container, false);


        recyclerViewStory=view.findViewById(R.id.recyclerStory);
        storyList=new ArrayList<>();

        storyList.add(new StoryModel(R.drawable.storyimage_ebrar,R.drawable.profile_image,R.drawable.ic_videocam,"Ebrar"));
        storyList.add(new StoryModel(R.drawable.storyimage_melike,R.drawable.profile_image,R.drawable.ic_live,"Melike"));
        storyList.add(new StoryModel(R.drawable.storyimage_ozgur,R.drawable.profile_image,R.drawable.ic_videocam,"Özgür"));
        storyList.add(new StoryModel(R.drawable.storyimage_ebrar,R.drawable.profile_image,R.drawable.ic_videocam,"ahmk"));
        storyList.add(new StoryModel(R.drawable.storyimage_melike,R.drawable.profile_image,R.drawable.ic_live,"bfd"));
        storyList.add(new StoryModel(R.drawable.storyimage_ozgur,R.drawable.profile_image,R.drawable.ic_videocam,"Özgvfdsvfür"));
        storyList.add(new StoryModel(R.drawable.storyimage_ebrar,R.drawable.profile_image,R.drawable.ic_videocam,"dfdf"));
        storyList.add(new StoryModel(R.drawable.storyimage_melike,R.drawable.profile_image,R.drawable.ic_live,"Melikasase"));
        storyList.add(new StoryModel(R.drawable.storyimage_ozgur,R.drawable.profile_image,R.drawable.ic_videocam,"Özgvvür"));
        storyList.add(new StoryModel(R.drawable.storyimage_ebrar,R.drawable.profile_image,R.drawable.ic_videocam,"Ebrdddar"));
        storyList.add(new StoryModel(R.drawable.storyimage_melike,R.drawable.profile_image,R.drawable.ic_live,"Melvvike"));
        storyList.add(new StoryModel(R.drawable.storyimage_ozgur,R.drawable.profile_image,R.drawable.ic_videocam,"Özttgür"));


        recyclerViewStory.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        StoryAdapter storyAdapter =new StoryAdapter(storyList,getContext());
        recyclerViewStory.setNestedScrollingEnabled(false);
        recyclerViewStory.setAdapter(storyAdapter);

        recyclerViewDashboard=view.findViewById(R.id.recyclerDash);
        dashboardList=new ArrayList<>();

        dashboardList.add(new DashboardModel(R.drawable.storyimage_ozgur,R.drawable.storyimage_ozgur,R.drawable.ic_book_mark,
                "özgür","tatilde dünya turu yapıyor","450","158","100"));
        dashboardList.add(new DashboardModel(R.drawable.storyimage_melike,R.drawable.storyimage_melike,R.drawable.ic_book_mark,
                "Melike","istanbul da","820","190","128"));
        dashboardList.add(new DashboardModel(R.drawable.profile_image,R.drawable.storyimage_ebrar,R.drawable.ic_book_mark,
                "Ebrar","gezmeye gidiyor","352","222","125"));
        dashboardList.add(new DashboardModel(R.drawable.story_default_image,R.drawable.story_default_image,R.drawable.ic_book_mark,
                "Murat","gün batımı","59","1","0"));
        dashboardList.add(new DashboardModel(R.drawable.storyimage_ozgur,R.drawable.storyimage_ozgur,R.drawable.ic_book_mark,
                "özgür","tatilde dünya turu yapıyor","450","158","100"));
        dashboardList.add(new DashboardModel(R.drawable.storyimage_melike,R.drawable.storyimage_melike,R.drawable.ic_book_mark,
                "Melike","istanbul da","820","190","128"));
        dashboardList.add(new DashboardModel(R.drawable.profile_image,R.drawable.storyimage_ebrar,R.drawable.ic_book_mark,
                "Ebrar","gezmeye gidiyor","352","222","125"));
        dashboardList.add(new DashboardModel(R.drawable.story_default_image,R.drawable.story_default_image,R.drawable.ic_book_mark,
                "Murat","gün batımı","59","1","0"));
        dashboardList.add(new DashboardModel(R.drawable.storyimage_ozgur,R.drawable.storyimage_ozgur,R.drawable.ic_book_mark,
                "özgür","tatilde dünya turu yapıyor","450","158","100"));
        dashboardList.add(new DashboardModel(R.drawable.storyimage_melike,R.drawable.storyimage_melike,R.drawable.ic_book_mark,
                "Melike","istanbul da","820","190","128"));
        dashboardList.add(new DashboardModel(R.drawable.profile_image,R.drawable.storyimage_ebrar,R.drawable.ic_book_mark,
                "Ebrar","gezmeye gidiyor","352","222","125"));
        dashboardList.add(new DashboardModel(R.drawable.story_default_image,R.drawable.story_default_image,R.drawable.ic_book_mark,
                "Murat","gün batımı","59","1","0"));


        recyclerViewDashboard.setLayoutManager(new LinearLayoutManager(getContext()));
        DashboardAdapter adapter=new DashboardAdapter(dashboardList,getContext());
        recyclerViewDashboard.setAdapter(adapter);


        return view;
    }
}