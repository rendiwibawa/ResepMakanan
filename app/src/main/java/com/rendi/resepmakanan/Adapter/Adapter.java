package com.rendi.resepmakanan.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.rendi.resepmakanan.R;
import com.rendi.resepmakanan.Resep;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ListViewHolder> {
    private ArrayList<Resep>listResep;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public Adapter(ArrayList<Resep> list){
        this.listResep = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_tampil,viewGroup, false);
       return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Resep resep = listResep.get(position);
        Glide.with(holder.itemView.getContext())
                .load(resep.getPhoto())
                .into(holder.imgPhoto);
        holder.tvName.setText(resep.getName());
        holder.tvDetail.setText(resep.getDetail());
        holder.tvFollower.setText(resep.getFollower());
        holder.tvPembaca.setText(resep.getPembaca());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(resep);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listResep.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName,tvDetail,tvFollower,tvPembaca;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFollower = itemView.findViewById(R.id.tv_item_folo);
            tvPembaca = itemView.findViewById(R.id.tv_item_pembaca);

        }
    }
}
