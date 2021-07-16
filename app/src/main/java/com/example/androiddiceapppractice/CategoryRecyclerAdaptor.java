package com.example.androiddiceapppractice;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Random;

public class CategoryRecyclerAdaptor extends RecyclerView.Adapter<CategoryRecyclerViewHolder> {

    String[] categories;

    public CategoryRecyclerAdaptor() {
        categories = new String[]{"Tech","Games","Foods","Countries","Cities","Mobiles","Drinks","Laptops","Software","Tech","Games","Foods","Countries","Cities","Mobiles","Drinks","Laptops","Software"};
    }

    @NonNull
    @Override
    public CategoryRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    // Create layout programmatically
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());

        View view=layoutInflater.inflate(R.layout.category_viewholder,parent,false);

        return new CategoryRecyclerViewHolder(view);
        

    }

    @Override
    public void onBindViewHolder(@NonNull CategoryRecyclerViewHolder holder, int position) {

        holder.getTxtCatNo().setText(position+1+")");
        holder.getTxtCatName().setText(categories[position]);

        // give random color to Linear layout
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        holder.getLinearlayout().setBackgroundColor(color);

    }

    @Override
    public int getItemCount() {
        return categories.length;
    }
}
