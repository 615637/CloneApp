package com.example.clonetonic.start;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.clonetonic.R;
import com.example.clonetonic.databinding.ActivityStartInstrumentBinding;

public class StartInstrumentActivity extends AppCompatActivity {
    ActivityStartInstrumentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityStartInstrumentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnBack.setOnClickListener(v -> {
            finish();
        });
    }
}