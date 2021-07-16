package com.example.androiddiceapppractice;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.Toast;

public class FavListApp_RecyclerViewPractice extends AppCompatActivity {

    private RecyclerView categoryRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_list_app__recycler_view_practice);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        categoryRecyclerView=findViewById(R.id.category_list_recycler_view);
        categoryRecyclerView.setAdapter(new CategoryRecyclerAdaptor());

        // how item should display - linearly, grid etc
        categoryRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        int x=categoryRecyclerView.getAdapter().getItemCount();
        Toast.makeText(this,"Total items in list"+x,Toast.LENGTH_LONG).show();



    }
}