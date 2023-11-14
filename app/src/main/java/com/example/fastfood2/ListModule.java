package com.example.fastfood2;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
public class ListModule extends AppCompatActivity {
    GridView grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_module);

        grid = (GridView) findViewById(R.id.gridView);

        //adding some values to our list
        module.addstagiaire(new module(R.drawable.python, "Python"));
        module.addstagiaire(new module(R.drawable.java, "Java"));
        module.addstagiaire(new module(R.drawable.swift, "Swift"));
        module.addstagiaire(new module(R.drawable.kotlin, "Kotlin"));
        module.addstagiaire(new module(R.drawable.android, "Android"));
        module.addstagiaire(new module(R.drawable.projet, "Projet"));



        //creating the adapter
        listAdapter adapter = new listAdapter(this, R.layout.grid_item, module.getS());

        //attaching adapter to the listview
        grid.setAdapter(adapter);

    }
}