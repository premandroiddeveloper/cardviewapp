package com.example.cardviewapp;

import android.graphics.ImageFormat;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class viewholder extends RecyclerView.ViewHolder {
    ImageView img;
    TextView txt1;
LinearLayout l1;
    public viewholder(@NonNull View itemView) {
        super(itemView);
        l1=itemView.findViewById(R.id.linear);
       img=itemView.findViewById(R.id.imageView2);
         txt1=itemView.findViewById(R.id.textView);
    }
    public ImageView getimag(){
        return img;
    }
    public  TextView getTxt1(){
        return txt1;
    }
}
