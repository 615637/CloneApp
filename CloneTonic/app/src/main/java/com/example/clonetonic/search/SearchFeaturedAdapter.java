package com.example.clonetonic.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clonetonic.databinding.ItemFeaturedBinding;

public class SearchFeaturedAdapter extends RecyclerView.Adapter<SearchFeaturedAdapter.ViewHolder> {

    ItemFeaturedBinding binding;
    Context context;

    public SearchFeaturedAdapter(Context context) {
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
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


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
