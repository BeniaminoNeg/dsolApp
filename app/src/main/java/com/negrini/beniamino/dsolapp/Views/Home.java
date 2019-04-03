package com.negrini.beniamino.dsolapp.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.negrini.beniamino.dsolapp.R;

public class Home extends AppCompatActivity {

    private RecyclerView homeRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        homeRecyclerView = (RecyclerView) findViewById(R.id.home_recycler_view);

        homeRecyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        homeRecyclerView.setLayoutManager(layoutManager);

        mAdapter = new HomeAdapter ();
        homeRecyclerView.setAdapter(mAdapter);
    }
}
