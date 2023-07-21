package com.example.clonetonic.livenow;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clonetonic.R;
import com.example.clonetonic.databinding.FragmentLivenowBinding;

import java.util.ArrayList;

public class LivenowFragment extends Fragment {
    FragmentLivenowBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLivenowBinding.inflate(inflater, container, false);
        binding.recvLivenow.setAdapter(new LivenowAdapter(liveList(), getContext()));
        binding.recvLivenow.setLayoutManager(new GridLayoutManager(getContext(), 3));
        return binding.getRoot();
    }

    public ArrayList<LiveDTO> liveList(){
        ArrayList<LiveDTO> list = new ArrayList<>();
        list.add(new LiveDTO(R.drawable.ex_img, R.drawable.inst_violin, "Natalie"));
        list.add(new LiveDTO(R.drawable.ic_person, R.drawable.inst_cello, "Cheryl Stone"));
        list.add(new LiveDTO(R.drawable.a1, R.drawable.inst_flute, "Max"));
        list.add(new LiveDTO(R.drawable.a2, R.drawable.inst_guitar, "Carol Lyan"));
        list.add(new LiveDTO(R.drawable.a3, R.drawable.inst_music, "Milo"));
        list.add(new LiveDTO(R.drawable.a4, R.drawable.inst_piano, "GuineaBen Yang"));
        list.add(new LiveDTO(R.drawable.a5, R.drawable.inst_viola, "Monserrat"));
        list.add(new LiveDTO(R.drawable.ic_person, R.drawable.inst_voice, "大長今"));
        list.add(new LiveDTO(R.drawable.ic_person, R.drawable.inst_violin, "Julie"));
        list.add(new LiveDTO(R.drawable.a6, R.drawable.inst_piano, "Dasha lol hehe"));
        list.add(new LiveDTO(R.drawable.a7, R.drawable.inst_viola, "Kalea Schunk"));
        list.add(new LiveDTO(R.drawable.a8, R.drawable.inst_voice, "Mary"));
        list.add(new LiveDTO(R.drawable.ic_person, R.drawable.inst_violin, "MIWA"));
        list.add(new LiveDTO(R.drawable.a9, R.drawable.inst_violin, "Jack Wolfe"));
        list.add(new LiveDTO(R.drawable.ex_img, R.drawable.inst_cello, "Jochebed"));
        list.add(new LiveDTO(R.drawable.a8, R.drawable.inst_flute, "Nina"));
        list.add(new LiveDTO(R.drawable.a2, R.drawable.inst_guitar, "Alex Kwok"));

        return list;
    }

}