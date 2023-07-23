package com.example.clonetonic.search;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clonetonic.R;
import com.example.clonetonic.databinding.FragmentSearchBinding;
import com.example.clonetonic.featured.FeaturedActivity;
import com.example.clonetonic.featured.FeaturedDTO;
import com.example.clonetonic.livenow.LiveDTO;
import com.example.clonetonic.livenow.LivenowAdapter;

import java.util.ArrayList;


public class SearchFragment extends Fragment {
    FragmentSearchBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSearchBinding.inflate(inflater, container, false);
        binding.recvFeatured.setAdapter(new SearchFeaturedAdapter(getlist(), getContext()));
        binding.recvFeatured.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false));
        binding.recvRecently.setAdapter(new SearchRecentlyAdapter(recentlyList(), getContext()));
        binding.recvRecently.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        binding.featurdSee.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), FeaturedActivity.class);
            startActivity(intent);
        });

        return binding.getRoot();
    }
    public ArrayList<SearchDTO> recentlyList(){
        ArrayList<SearchDTO> list = new ArrayList<>();
        list.add(new SearchDTO(R.drawable.a1, R.drawable.a2, "Trills", "Woodwind Technique"));
        list.add(new SearchDTO(R.drawable.a3, R.drawable.a4, "Finger exercises", "General Technique"));
        list.add(new SearchDTO(R.drawable.a5, R.drawable.a6, "Warming up", "General Technique"));

        return list;
    }

    public ArrayList<FeaturedDTO> getlist(){
        FeaturedActivity activity = new FeaturedActivity();
        return activity.featuredList();
    }

}