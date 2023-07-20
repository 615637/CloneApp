package com.example.clonetonic.groups;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clonetonic.R;
import com.example.clonetonic.databinding.FragmentGroupsBinding;
import com.example.clonetonic.featured.FeaturedActivity;


public class GroupsFragment extends Fragment {
    FragmentGroupsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentGroupsBinding.inflate(inflater, container, false);

        binding.btnGroup.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), FeaturedActivity.class);
            startActivity(intent);
        });

        return binding.getRoot();
    }
}