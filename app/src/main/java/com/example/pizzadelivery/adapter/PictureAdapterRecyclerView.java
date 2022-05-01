package com.example.pizzadelivery.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pizzadelivery.R;
import com.example.pizzadelivery.model.ItemsCardview;

import java.util.List;

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder> {

    private List<ItemsCardview> item;

    public PictureAdapterRecyclerView(List<ItemsCardview> item) {
        this.item=item;
    }

    @NonNull
    @Override
    public PictureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_picture_pizzas,parent,false);

         return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PictureViewHolder holder, int position) {
        ItemsCardview items =item.get(position);
        holder.pictureCard.setImageResource(items.getImagen());
        holder.pizzaDescription.setText(items.getDescripcion());
        holder.pizzaNamecard.setText(items.getTitulo());
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public static class PictureViewHolder extends RecyclerView.ViewHolder{
        private ImageView pictureCard;
        private TextView pizzaNamecard;
        private TextView pizzaDescription;

        public PictureViewHolder(@NonNull View itemView) {
            super(itemView);

            pictureCard =(ImageView) itemView.findViewById(R.id.pictureCard);
            pizzaNamecard=(TextView) itemView.findViewById(R.id.pizzaNamecard);
            pizzaDescription=(TextView) itemView.findViewById(R.id.pizzaDescription);
        }
    }






}
