package com.example.de01lan3.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.de01lan3.R;
import com.example.de01lan3.database.SachHelper;
import com.example.de01lan3.model.Sach;

import java.util.List;

public class SachAdapter extends RecyclerView.Adapter<SachAdapter.SachHolder> {
    private List<Sach>sachList;
    private SachHelper sachHelper;

    public SachAdapter(List<Sach> sachList) {
        this.sachList = sachList;
    }

    @NonNull
    @Override
    public SachHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new SachHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SachHolder holder,final int position) {
        final Sach sach =sachList.get(position);
        holder.tvRow.setText(sach.toString());

        holder.btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sachHelper.deleteSach(sach);
                sachList.remove(position);
                notifyItemRemoved(position);
                notifyDataSetChanged();
            }
        });

        holder.btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return sachList.size();
    }

    public class SachHolder extends RecyclerView.ViewHolder {

        private TextView tvRow;
        private Button btnSua;
        private Button btnXoa;
        public SachHolder(@NonNull View itemView) {
            super(itemView);

            tvRow = (TextView) itemView.findViewById(R.id.tvRow);
            btnSua = (Button) itemView.findViewById(R.id.btnSua);
            btnXoa = (Button) itemView.findViewById(R.id.btnXoa);

        }
    }
}
