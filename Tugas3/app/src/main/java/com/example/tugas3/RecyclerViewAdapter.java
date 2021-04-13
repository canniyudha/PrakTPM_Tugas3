package com.example.tugas3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<Integer> array_image = new ArrayList<Integer>();
    private ArrayList<String> array_judul = new ArrayList<>();
    private ArrayList<String> array_maker = new ArrayList<>();
    private ArrayList<String> array_detail = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<Integer> image, ArrayList<String> judul, ArrayList<String> maker, ArrayList<String> detail, Context context) {
        this.array_image = image;
        this.array_judul = judul;
        this.array_maker = maker;
        this.array_detail = detail;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout, parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(array_image.get(position)).into(holder.imageViewPict);

        holder.textViewJudul.setText(array_judul.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("image", array_image.get(position));
                intent.putExtra("nama", array_judul.get(position));
                intent.putExtra("court", array_maker.get(position));
                intent.putExtra("detail_", array_detail.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return array_judul.size();
    }

    public class ViewHolder extends RecyclerView
            .ViewHolder{
        ImageView imageViewPict;
        TextView textViewJudul;
        ConstraintLayout constraintLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewPict = itemView.findViewById(R.id.iv_pict);
            textViewJudul = itemView.findViewById(R.id.tv_judul);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
