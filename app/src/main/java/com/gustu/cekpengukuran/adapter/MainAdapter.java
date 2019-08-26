package com.gustu.cekpengukuran.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gustu.cekpengukuran.R;
import com.gustu.cekpengukuran.model.Data;
import com.gustu.cekpengukuran.model.DataMuka;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    List<DataMuka> dataMukaList;

    public MainAdapter(List<DataMuka> dataList) {
        this.dataMukaList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final DataMuka data = dataMukaList.get(position);
        holder.namaPemohon.setText(data.getPemohon());
        holder.nohmc.setText(data.getNoHak());
        holder.noberkas.setText(data.getNoBerkas());
        holder.desa.setText(data.getDesa());
        holder.kecamatan.setText(data.getKecamatan());
        holder.hari.setText(data.getHari());
        holder.tanggal.setText(data.getTanggal());
        holder.petugasukur.setText(data.getPetugas());
        holder.noHP.setText(data.getNoHp());
    }

    @Override
    public int getItemCount() {
       if (dataMukaList !=null){
           return dataMukaList.size();
       }
       return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView noHP,namaPemohon,nohmc,noberkas,desa,kecamatan,hari,tanggal,petugasukur;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            initView();
        }

        private void initView() {
            noHP = itemView.findViewById(R.id.tvNoHP);
            namaPemohon =itemView.findViewById(R.id.tvNamaPemohon);
            nohmc=itemView.findViewById(R.id.tvHMC);
            noberkas=itemView.findViewById(R.id.tvNoberkas);
            desa=itemView.findViewById(R.id.tvDesa);
            kecamatan=itemView.findViewById(R.id.tvKecamatan);
            hari=itemView.findViewById(R.id.tvHari);
            tanggal=itemView.findViewById(R.id.tvtanggal);
            petugasukur=itemView.findViewById(R.id.tvPetugasUkur);
        }
    }
}
