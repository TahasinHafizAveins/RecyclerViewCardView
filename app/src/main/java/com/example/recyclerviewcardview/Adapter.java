package com.example.recyclerviewcardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    MainActivity mainActivity;
    ArrayList<Information> data;

    LayoutInflater layoutInflater;
    int previousPosition = 0;


    public Adapter(MainActivity mainActivity, ArrayList<Information> data) {
         this.mainActivity =mainActivity;
         this.data = data;
         layoutInflater = LayoutInflater.from(mainActivity);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {

        View view = layoutInflater.inflate(R.layout.row,parent,false);

         ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textView.setText(data.get(position).title);
        holder.imageView.setImageResource(data.get(position).imageId);

        if(position>previousPosition)
        {
            Animation.animate(holder,true);
        }
        else {
            Animation.animate(holder,false);
        }
        previousPosition = position;

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = (TextView)itemView.findViewById(R.id.textview_row);
            imageView = (ImageView) itemView.findViewById(R.id.image_row);
        }
    }
}
