package com.example.a3lab;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a3lab.databinding.PlantItemBinding;

import java.util.ArrayList;

public class PlantAdapter extends RecyclerView.Adapter<PlantAdapter.PlantHolder> {

    private ArrayList<PlantClass> plantList = new ArrayList<>();

    @NonNull
    @Override
    public PlantHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.plant_item, parent, false);
        return new PlantHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlantHolder holder, int position) {
        PlantClass plant = plantList.get(position);
        holder.bind(plant);
    }

    @Override
    public int getItemCount() {
        return plantList.size();
    }

    public void addPlant(PlantClass plant) {
        plantList.add(plant);
        notifyDataSetChanged();
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
