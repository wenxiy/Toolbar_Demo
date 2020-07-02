package com.example.toolbar_demo.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.toolbar_demo.R;
import com.example.toolbar_demo.model.Developer;

import java.util.List;

public class RecyclerViewadapter extends RecyclerView.Adapter<RecyclerViewadapter.InnerHolder> {
    private final List<Developer> list;

    public RecyclerViewadapter(List<Developer> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerViewadapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.recyclerview_item, null);
        return new InnerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewadapter.InnerHolder holder, int position) {
        holder.setdata(list.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class InnerHolder extends RecyclerView.ViewHolder {

        public InnerHolder(View view) {
            super(view);
        }

        public void setdata(Developer developer) {

        }
    }
}
