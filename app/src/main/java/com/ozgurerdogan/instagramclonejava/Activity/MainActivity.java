package com.ozgurerdogan.instagramclonejava.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.ozgurerdogan.instagramclonejava.Fragments.AddPostFragment;
import com.ozgurerdogan.instagramclonejava.Fragments.HomeFragment;
import com.ozgurerdogan.instagramclonejava.Fragments.NotificationFragment;
import com.ozgurerdogan.instagramclonejava.Fragments.PersonFragment;
import com.ozgurerdogan.instagramclonejava.Fragments.SearchFragment;
import com.ozgurerdogan.instagramclonejava.R;
import com.ozgurerdogan.instagramclonejava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    private HomeFragment homeFragment;
    private NotificationFragment notificationFragment;
    private AddPostFragment addPostFragment;
    private SearchFragment searchFragment;
    private PersonFragment personFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        MainActivity.this.setTitle("My Profile");
        binding.toolbar.setVisibility(View.GONE);

        homeFragment = new HomeFragment();
        notificationFragment = new NotificationFragment();
        addPostFragment = new AddPostFragment();
        searchFragment = new SearchFragment();
        personFragment = new PersonFragment();

        setFragment(homeFragment);

        binding.bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.page_home:

                        setFragment(homeFragment);
                        binding.toolbar.setVisibility(View.GONE);
                        return true;

                    case R.id.page_notification:
                        binding.toolbar.setVisibility(View.GONE);
                        setFragment(notificationFragment);
                        return true;

                    case R.id.page_add:
                        binding.toolbar.setVisibility(View.GONE);
                        setFragment(addPostFragment);
                        return true;

                    case R.id.page_search:
                        binding.toolbar.setVisibility(View.GONE);
                        setFragment(searchFragment);
                        return true;

                    case R.id.page_person:

                        setFragment(personFragment);
                        binding.toolbar.setVisibility(View.VISIBLE);
                        return true;

                    default:
                        return false;
                }
            }
        });

    }

    public void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frameLayout, fragment);
        fragmentTransaction.commit();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.settings_actionbar, menu);
        return true;

    }
}