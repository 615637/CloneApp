package com.example.clonetonic.featured;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.clonetonic.R;
import com.example.clonetonic.databinding.ActivityFeaturedBinding;

public class FeaturedActivity extends AppCompatActivity {
    ActivityFeaturedBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFeaturedBinding.inflate(getLayoutInflater());
        binding.recvFeatured.setAdapter(new FeaturedAdapter());
        binding.recvFeatured.setLayoutManager(new LinearLayoutManager(this));
        setContentView(binding.getRoot());

        binding.btnBack.setOnClickListener(v -> {
            finish();
        });
    }
}