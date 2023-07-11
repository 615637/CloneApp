package com.example.clonetonic.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clonetonic.databinding.ItemRecentlyBinding;

public class SearchRecentlyAdapter extends RecyclerView.Adapter<SearchRecentlyAdapter.ViewHolder> {
    ItemRecentlyBinding binding;
    Context context;

    public SearchRecentlyAdapter(Context context) {
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
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemRecentlyBinding binding;

        public ViewHolder(ItemRecentlyBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
