package com.example.clonetonic.practice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clonetonic.R;
import com.example.clonetonic.databinding.FragmentPracticeBinding;


public class PracticeFragment extends Fragment {
    FragmentPracticeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPracticeBinding.inflate(inflater, container, false);
        binding.btnStudio.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), StudioActivity.class);
            startActivity(intent);
        });

        return binding.getRoot();
    }
}