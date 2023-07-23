package com.example.clonetonic.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clonetonic.databinding.ItemFeaturedBinding;
import com.example.clonetonic.featured.FeaturedDTO;

import java.util.ArrayList;

public class SearchFeaturedAdapter extends RecyclerView.Adapter<SearchFeaturedAdapter.ViewHolder> {

    ItemFeaturedBinding binding;
    ArrayList<FeaturedDTO> list;
    Context context;

    public SearchFeaturedAdapter(ArrayList<FeaturedDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemFeaturedBinding.inflate(inflater, parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        binding.imgvFeatured.setImageResource(list.get(i).getImgId());
        binding.tvFeatured.setText(list.get(i).getTitle());
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemFeaturedBinding binding;

        public ViewHolder(ItemFeaturedBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }

}
