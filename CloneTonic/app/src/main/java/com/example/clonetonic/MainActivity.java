package com.example.clonetonic;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.clonetonic.databinding.ActivityMainBinding;
import com.example.clonetonic.groups.GroupsFragment;
import com.example.clonetonic.livenow.LivenowFragment;
import com.example.clonetonic.practice.PracticeFragment;
import com.example.clonetonic.search.SearchFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Toolbar toolbar;
    FragmentManager manager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottomNavi.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            if(item.getItemId()==R.id.btm_practice){
                fragment = new PracticeFragment();
            }else if (item.getItemId()==R.id.btm_livenow){
                fragment = new LivenowFragment();
            } else if (item.getItemId()==R.id.btm_search) {

                fragment = new SearchFragment();
            } else if (item.getItemId()==R.id.btm_groups) {

                fragment = new GroupsFragment();
            }
            manager.beginTransaction().replace(R.id.container, fragment).commit();
            return true;
        });

    }
}