package com.gustu.cekpengukuran.network;

import com.gustu.cekpengukuran.model.DataMuka;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {
    @GET("index.php/ukur")
    Call<List<DataMuka>> getMuka(
            @Query("no_berkas") String no_berkas
    );
}
