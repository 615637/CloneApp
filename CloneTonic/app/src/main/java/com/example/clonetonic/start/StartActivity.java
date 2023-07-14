package com.example.clonetonic.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.clonetonic.R;
import com.example.clonetonic.databinding.ActivityStartBinding;

public class StartActivity extends AppCompatActivity {
    ActivityStartBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnGetstart.setOnClickListener(v -> {
            Intent intent = new Intent(this, StartInstrumentActivity.class);
            startActivity(intent);
        });
    }
}