package com.example.clonetonic.search;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clonetonic.R;
import com.example.clonetonic.databinding.FragmentSearchBinding;
import com.example.clonetonic.livenow.LivenowAdapter;


public class SearchFragment extends Fragment {
    FragmentSearchBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSearchBinding.inflate(inflater, container, false);
        binding.recvFeatured.setAdapter(new SearchFeaturedAdapter(getContext()));
        binding.recvFeatured.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false));
        return binding.getRoot();
    }
}