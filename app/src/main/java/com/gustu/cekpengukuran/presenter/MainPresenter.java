package com.gustu.cekpengukuran.presenter;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;

import com.gustu.cekpengukuran.interfaces.MainView;
import com.gustu.cekpengukuran.model.DataMuka;
import com.gustu.cekpengukuran.network.BaseUrl;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter {
MainView mainView;
BaseUrl baseUrl;
List<DataMuka> dataMukaList = new ArrayList<>();
Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
        if (baseUrl==null){
            this.baseUrl=new BaseUrl();
        }
    }
public void getData(String noBerkas) {
   final ProgressDialog progressDialog  = new ProgressDialog(context);
    progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
    progressDialog.setTitle("Tunggu");
    progressDialog.setMessage("Memuat...");
    progressDialog.show();
        baseUrl.getApi().getMuka(noBerkas).enqueue(new Callback<List<DataMuka>>() {
            @Override
            public void onResponse(Call<List<DataMuka>> call, Response<List<DataMuka>> response) {
                if (response.isSuccessful()){
                    progressDialog.dismiss();
                    dataMukaList = response.body();
                    mainView._onCheck(dataMukaList);
                }
            }

            @Override
            public void onFailure(Call<List<DataMuka>> call, Throwable t) {
                Toast.makeText(context,"Tidak Ada Koneksi",Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }
        });
}
}
