package com.example.clonetonic.featured;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clonetonic.databinding.ItemFeaturedReBinding;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.ViewHolder> {
    ItemFeaturedReBinding binding;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemFeaturedReBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemFeaturedReBinding binding;

        public ViewHolder(ItemFeaturedReBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
