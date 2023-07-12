package com.example.clonetonic.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.clonetonic.R;
import com.example.clonetonic.databinding.ActivityStudioBinding;

public class StudioActivity extends AppCompatActivity {
    ActivityStudioBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStudioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnConnect.setVisibility(View.GONE);
        binding.btnLock.setVisibility(View.GONE);

        binding.btnBack.setOnClickListener(v -> {
            finish();
        });
        binding.btnUnlock.setOnClickListener(v -> {
            binding.btnUnlock.setVisibility(View.GONE);
            binding.btnLock.setVisibility(View.VISIBLE);
            binding.btnConnect.setVisibility(View.VISIBLE);
        });
        binding.btnLock.setOnClickListener(v -> {
            binding.btnLock.setVisibility(View.GONE);
            binding.btnUnlock.setVisibility(View.VISIBLE);
            binding.btnConnect.setVisibility(View.GONE);
        });

    }
}