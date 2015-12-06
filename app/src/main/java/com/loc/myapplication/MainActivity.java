package com.loc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.loc.myapplication.Adapter.Adapter;
import com.loc.myapplication.Untils.SpacesItemDecoration;
//import android.widget.Adapter;

public class MainActivity extends AppCompatActivity {
    Adapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new Adapter(this);
        recyclerView = (RecyclerView) findViewById(R.id.recy);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);
        SpacesItemDecoration decoration = new SpacesItemDecoration(16);
        recyclerView    .addItemDecoration(decoration);
    }
}
