package com.example.clonetonic.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clonetonic.databinding.ItemRecentlyBinding;

import java.util.ArrayList;

public class SearchRecentlyAdapter extends RecyclerView.Adapter<SearchRecentlyAdapter.ViewHolder> {
    ItemRecentlyBinding binding;
    ArrayList<SearchDTO> list;
    Context context;

    public SearchRecentlyAdapter(ArrayList<SearchDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemRecentlyBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        binding.imgvRecently.setImageResource(list.get(i).getImgId());
        binding.imgvProfile.setImageResource(list.get(i).getProfile());
        binding.tvRecently.setText(list.get(i).getTitle());
        binding.tvWriter.setText(list.get(i).getWriter());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemRecentlyBinding binding;

        public ViewHolder(ItemRecentlyBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
