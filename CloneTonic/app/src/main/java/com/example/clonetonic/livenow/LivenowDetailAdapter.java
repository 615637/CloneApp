package com.example.clonetonic.livenow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clonetonic.databinding.ItemLivenowDetailBinding;

public class LivenowDetailAdapter extends RecyclerView.Adapter<LivenowDetailAdapter.ViewHolder> {

    ItemLivenowDetailBinding binding;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemLivenowDetailBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        binding.liveItem.getContext();

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemLivenowDetailBinding binding;

        public ViewHolder(ItemLivenowDetailBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
