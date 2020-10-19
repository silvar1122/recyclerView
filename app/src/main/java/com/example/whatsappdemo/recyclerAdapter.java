package com.example.whatsappdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.viewHolder> {

    private Context context;
    private List<currentMonth>currentMonthList;

    public recyclerAdapter(Context context, List<currentMonth> currentMonthList) {
        this.context = context;
        this.currentMonthList = currentMonthList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.rowitem,parent,false);
        viewHolder viewholder=new viewHolder(view);
        return viewholder;
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        currentMonth currentmonth=currentMonthList.get(position);
        holder.textViewMonth.setText(currentmonth.getMonthName());
        holder.circleImageView.setImageDrawable(context.getResources().getDrawable(currentmonth.getImageMonth()));

    }

    @Override
    public int getItemCount() {
        return currentMonthList.size();
    }

    class viewHolder extends RecyclerView.ViewHolder{
        CircleImageView circleImageView;
        TextView textViewMonth;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            circleImageView=itemView.findViewById(R.id.monthImage);
            textViewMonth=itemView.findViewById(R.id.name);
        }
    }
}
