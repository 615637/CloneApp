package com.example.clonetonic.featured;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.clonetonic.R;
import com.example.clonetonic.databinding.ActivityFeaturedBinding;
import com.example.clonetonic.search.SearchDTO;

import java.util.ArrayList;

public class FeaturedActivity extends AppCompatActivity {
    ActivityFeaturedBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFeaturedBinding.inflate(getLayoutInflater());
        binding.recvFeatured.setAdapter(new FeaturedAdapter(featuredList()));
        binding.recvFeatured.setLayoutManager(new LinearLayoutManager(this));
        setContentView(binding.getRoot());

        binding.btnBack.setOnClickListener(v -> {
            finish();
        });
    }

    public ArrayList<FeaturedDTO> featuredList(){
        ArrayList<FeaturedDTO> list = new ArrayList<>();
        list.add(new FeaturedDTO(R.drawable.a1, "Music Theory Group"));
        list.add(new FeaturedDTO(R.drawable.a2, "TwoSet Appreciation"));
        list.add(new FeaturedDTO(R.drawable.a3, "Goals and Motivation"));
        list.add(new FeaturedDTO(R.drawable.a4, "Practice Techniques!"));
        list.add(new FeaturedDTO(R.drawable.a5, "performance Practice"));
        list.add(new FeaturedDTO(R.drawable.a6, "Ray Chen Taiwan Official"));
        list.add(new FeaturedDTO(R.drawable.a7, "Classical music"));
        list.add(new FeaturedDTO(R.drawable.a8, "Tonic Livestream"));
        list.add(new FeaturedDTO(R.drawable.a9, "Advanced violinists"));
        list.add(new FeaturedDTO(R.drawable.ex_img, "String talk"));
        list.add(new FeaturedDTO(R.drawable.a6, "Strings Community"));
        list.add(new FeaturedDTO(R.drawable.a7, "Tonic Community"));
        list.add(new FeaturedDTO(R.drawable.a3, "Music Theory Study Group"));
        list.add(new FeaturedDTO(R.drawable.a4, "The Ray Fans"));
        list.add(new FeaturedDTO(R.drawable.a5, "Keyboard Instruments!"));
        list.add(new FeaturedDTO(R.drawable.a8, "Bach Lovers"));
        list.add(new FeaturedDTO(R.drawable.a9, "Beginner violinists"));
        list.add(new FeaturedDTO(R.drawable.ex_img, "Piano Gang!"));
        list.add(new FeaturedDTO(R.drawable.a1, "Music Aficionados&"));
        list.add(new FeaturedDTO(R.drawable.a2, "Young Musicians"));

        return list;
    }

}