package com.example.clonetonic.livenow;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clonetonic.R;
import com.example.clonetonic.databinding.ItemLivenowBinding;

import java.util.ArrayList;

public class LivenowAdapter extends RecyclerView.Adapter<LivenowAdapter.ViewHolder> {
    ItemLivenowBinding binding;
    ArrayList<LiveDTO> list;
    Context context;

    public LivenowAdapter(ArrayList<LiveDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemLivenowBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        binding.liveProfile.setImageResource(list.get(i).getImgId());
        binding.liveInstrument.setImageResource(list.get(i).getInstrument());
        binding.liveName.setText(list.get(i).getName());

        binding.liveProfile.setOnClickListener(v -> {
            Intent intent = new Intent(context, LivenowDetailActivity.class);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemLivenowBinding binding;

        public ViewHolder(ItemLivenowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
