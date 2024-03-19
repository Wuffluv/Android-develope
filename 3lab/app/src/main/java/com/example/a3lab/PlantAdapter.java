package com.example.a3lab;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a3lab.databinding.PlantItemBinding;

public class PlantAdapter extends RecyclerView.Adapter<PlantAdapter.PlantHolder> {

    @NonNull
    @Override
    public PlantHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.plant_item, parent, false)
    }

    @Override
    public void onBindViewHolder(@NonNull PlantHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class PlantHolder extends RecyclerView.ViewHolder {

        private PlantItemBinding binding;

        public PlantHolder(View itemView) {
            super(itemView);
            binding = PlantItemBinding.bind(itemView);
        }

        public void bind(PlantClass plant) {
            binding.im.setImageResource(plant.getImageId());
            binding.tvTitle.setText(plant.getTitle());
        }
    }
}
