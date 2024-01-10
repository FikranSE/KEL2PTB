package com.example.kel2ptb;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class PraktikanAdapter extends RecyclerView.Adapter<MyViewHolderPraktikan> {

    private Context context;
    private List<DataClassPraktikan> dataList;

    public PraktikanAdapter(Context context, List<DataClassPraktikan> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyViewHolderPraktikan onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_praktikan, parent, false);
        return new MyViewHolderPraktikan(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderPraktikan holder, int position) {
        Glide.with(context).load(dataList.get(position).getDataImage()).into(holder.recImage);
        holder.recName.setText(dataList.get(position).getDataName());
        holder.recKelas.setText(dataList.get(position).getDataKelas());
        holder.recNim.setText(dataList.get(position).getDataNim());

        holder.recCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailPraktikanActivity.class);
                intent.putExtra("Image", dataList.get(holder.getAdapterPosition()).getDataImage());
                intent.putExtra("Nim", dataList.get(holder.getAdapterPosition()).getDataNim());
                intent.putExtra("Name", dataList.get(holder.getAdapterPosition()).getDataName());
                intent.putExtra("Kelas", dataList.get(holder.getAdapterPosition()).getDataKelas());
                intent.putExtra("Key",dataList.get(holder.getAdapterPosition()).getKey());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public void searchDataList(ArrayList<DataClassPraktikan> searchList){
        dataList = searchList;
        notifyDataSetChanged();
    }
}

class MyViewHolderPraktikan extends RecyclerView.ViewHolder{

    ImageView recImage;
    TextView recName, recNim, recKelas;
    CardView recCard;

    public MyViewHolderPraktikan(@NonNull View itemView) {
        super(itemView);

        recImage = itemView.findViewById(R.id.recImage);
        recCard = itemView.findViewById(R.id.recCard);
        recNim = itemView.findViewById(R.id.recNim);
        recName = itemView.findViewById(R.id.recName);
        recKelas = itemView.findViewById(R.id.recKelas);
    }
}