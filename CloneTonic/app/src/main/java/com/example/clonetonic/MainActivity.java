package com.example.clonetonic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.clonetonic.databinding.ActivityMainBinding;
import com.example.clonetonic.groups.GroupsFragment;
import com.example.clonetonic.livenow.LivenowFragment;
import com.example.clonetonic.practice.PracticeFragment;
import com.example.clonetonic.search.SearchFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    FragmentManager manager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        manager.beginTransaction().replace(R.id.container, new PracticeFragment()).commit();

        binding.btmPractice.setOnClickListener(v -> {
            manager.beginTransaction().replace(R.id.container, new PracticeFragment()).commit();
            binding.bottomNavi.setBackgroundColor(Color.WHITE);
            binding.divider.setVisibility(View.VISIBLE);
        });
        binding.btmLivenow.setOnClickListener(v -> {
            manager.beginTransaction().replace(R.id.container, new LivenowFragment()).commit();
            binding.bottomNavi.setBackgroundColor(Color.parseColor("#232325"));
            binding.divider.setVisibility(View.GONE);
        });
        binding.btmSearch.setOnClickListener(v -> {
            manager.beginTransaction().replace(R.id.container, new SearchFragment()).commit();
            binding.bottomNavi.setBackgroundColor(Color.WHITE);
            binding.divider.setVisibility(View.VISIBLE);
        });
        binding.btmGroups.setOnClickListener(v -> {
            manager.beginTransaction().replace(R.id.container, new GroupsFragment()).commit();
            binding.bottomNavi.setBackgroundColor(Color.WHITE);
            binding.divider.setVisibility(View.VISIBLE);
        });



    }
}