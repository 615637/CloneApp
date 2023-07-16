package com.example.clonetonic.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.clonetonic.R;
import com.example.clonetonic.databinding.ActivityStudioBinding;

public class StudioActivity extends AppCompatActivity {
    ActivityStudioBinding binding;

    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStudioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnConnect.setVisibility(View.GONE);
        binding.btnLock.setVisibility(View.GONE);

        a = 0;

        binding.btnBack.setOnClickListener(v -> {
            finish();
        });

        binding.btnUnlock.setOnClickListener(v -> {
            binding.btnUnlock.setVisibility(View.GONE);
            binding.btnLock.setVisibility(View.VISIBLE);
            binding.btnConnect.setVisibility(View.VISIBLE);
            binding.tvStudio.setText("Private studio");
            binding.tvStudioContent.setText("Only for you and those you invite. Change to a public studio by tapping on the lock.");
            a=1;
        });
        binding.btnLock.setOnClickListener(v -> {
            binding.btnLock.setVisibility(View.GONE);
            binding.btnUnlock.setVisibility(View.VISIBLE);
            binding.btnConnect.setVisibility(View.GONE);
            binding.tvStudio.setText("Studio");
            binding.tvStudioContent.setText("Practice publicy for fun or to get feedback.");
            a=0;
        });



    }
}