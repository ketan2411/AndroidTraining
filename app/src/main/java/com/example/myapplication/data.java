package com.example.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Date;

import static com.example.myapplication.R.id.imgIcon;

public class data extends RecyclerView.Adapter<data.Programviewholder>{
    private String[] data1;
     public data(String[] data1){
         this.data1 = data1;     }
    @NonNull
    @Override
    public Programviewholder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, parent, false);
        return new Programviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Programviewholder holder, int i) {
         String title = data1[i];
         holder.textItem.setText(title);

    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class  Programviewholder extends RecyclerView.ViewHolder{
         ImageView imgIcon;
         TextView textItem;
        public Programviewholder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            textItem = itemView.findViewById(R.id.texItem);

        }
    }
}
