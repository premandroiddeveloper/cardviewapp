package com.example.cardviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adapter1 extends RecyclerView.Adapter<viewholder> {
    int kjk[]={R.drawable.algorithm,R.drawable.android,R.drawable.code,R.drawable.cpp,R.drawable.design,R.drawable.download,R.drawable.html,R.drawable.javascript,
            R.drawable.managment,R.drawable.pythoon,R.drawable.sql,R.drawable.www};
    String name[]={"algoritham","android","code","c++","design","download","html","javascript","managment","python","sql","webdevelopment"};
Context c1;
    public adapter1(MainActivity activity) {
        c1=activity;
    }


    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater li=LayoutInflater.from(parent.getContext());
        View view=li.inflate(R.layout.item_card_view,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
holder.getimag().setImageResource(kjk[position]);
holder.getTxt1().setText(name[position]);
    }

    @Override
    public int getItemCount() {
        return kjk.length;
    }
}
