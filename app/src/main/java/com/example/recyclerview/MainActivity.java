package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.recyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<Disaster> disasterList = new ArrayList<>();
        Disaster tsunami = new Disaster("Tsunami", "Natural");
        Disaster war = new Disaster("War", "Man Made");
        Disaster flood = new Disaster("Flood", "Natural");
        disasterList.add(tsunami);
        disasterList.add(war);
        disasterList.add(flood);

        DisasterAdapter adapterDisaster = new DisasterAdapter(disasterList);

        binding.rvDisaster.setAdapter(adapterDisaster);
        binding.rvDisaster.setLayoutManager(new LinearLayoutManager(this));
    }
}