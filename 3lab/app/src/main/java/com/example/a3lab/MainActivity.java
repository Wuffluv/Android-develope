package com.example.a3lab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.a3lab.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private PlantAdapter adapter;

    private List<Integer> imageIdList = new ArrayList<>();
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        adapter = new PlantAdapter();
        init();

        BottomNavigationView navView = findViewById(R.id.nav_view);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home,
                R.id.navigation_dashboard,
                R.id.navigation_notifications,
                R.id.navigation_four,
                R.id.navigation_five)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

    private void init(){
        binding.rcView.setLayoutManager(new GridLayoutManager(this, 3));
        binding.rcView.setAdapter(adapter);

        // Добавление изображений в список
        imageIdList.add(R.drawable.plant1);
        imageIdList.add(R.drawable.plant2);
        imageIdList.add(R.drawable.plant3);

        // Обработчик нажатия на кнопку
        binding.buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index > 2) index = 0;
                PlantClass plant = new PlantClass(imageIdList.get(index), "Plant " + index);
                adapter.addPlant(plant);
                index++;
            }
        });
    }
}
