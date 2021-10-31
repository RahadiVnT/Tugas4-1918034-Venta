package com.ventapratama.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MobilAdapter extends RecyclerView.Adapter<MobilAdapter.MobilViewHolder>{
    private ArrayList<Mobil> dataList;
    public MobilAdapter(ArrayList<Mobil> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public MobilAdapter.MobilViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_mobil, parent, false);
        return new MobilViewHolder(view);
    }
    public void onBindViewHolder(MobilViewHolder holder, int position) {
        holder.img.setImageResource(dataList.get(position).getImg());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtStatus.setText(dataList.get(position).getStatus());
        holder.txtHarga.setText(dataList.get(position).getHarga());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class MobilViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtStatus, txtHarga;
        private ImageView img;
        public MobilViewHolder(View itemView) {
            super(itemView);
            img=(ImageView) itemView.findViewById(R.id.gambar_mobil);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtStatus = (TextView) itemView.findViewById(R.id.txt_status);
            txtHarga = (TextView) itemView.findViewById(R.id.txt_harga);

        }
    }
}
