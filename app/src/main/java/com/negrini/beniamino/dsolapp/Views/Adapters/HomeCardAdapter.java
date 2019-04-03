package com.negrini.beniamino.dsolapp.Views.Adapters;

import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

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
}
