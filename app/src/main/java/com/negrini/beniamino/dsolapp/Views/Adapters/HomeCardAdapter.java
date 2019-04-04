package com.negrini.beniamino.dsolapp.Views.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.negrini.beniamino.dsolapp.R;

import java.util.HashSet;
import java.util.Set;

public class HomeCardAdapter extends RecyclerView.Adapter<HomeCardAdapter.HomeViewHolder> {

    private String[] mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mookText;
        public MyViewHolder(TextView v){
            super(v);
            mookText = v;

        }
    }

    public HomeCardAdapter (String [] myDataset){
        mDataset = myDataset;
    }

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        // Sto creando una nuova view
        TextView v = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.my_text_view, parent, false);
        //...
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }
}
