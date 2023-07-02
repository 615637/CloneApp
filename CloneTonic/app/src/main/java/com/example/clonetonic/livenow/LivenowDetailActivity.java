package com.example.clonetonic.livenow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.clonetonic.databinding.ActivityLivenowDetailBinding;

public class LivenowDetailActivity extends AppCompatActivity {

    ActivityLivenowDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLivenowDetailBinding.inflate(getLayoutInflater());

        binding.recvLivenowdetail.setAdapter(new LivenowDetailAdapter());
        binding.recvLivenowdetail.setLayoutManager(new LinearLayoutManager(this));

        setContentView(binding.getRoot());

    }
}