package com.example.clonetonic.featured;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clonetonic.databinding.ItemFeaturedReBinding;

import java.util.ArrayList;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.ViewHolder> {
    ItemFeaturedReBinding binding;
    ArrayList<FeaturedDTO> list;

    public FeaturedAdapter(ArrayList<FeaturedDTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemFeaturedReBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        binding.imgvProfile.setImageResource(list.get(i).getImgId());
        binding.tvTitle.setText(list.get(i).getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemFeaturedReBinding binding;

        public ViewHolder(ItemFeaturedReBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
