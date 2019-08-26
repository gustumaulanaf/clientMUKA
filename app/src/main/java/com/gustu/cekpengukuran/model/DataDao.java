package com.gustu.cekpengukuran.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DataDao {
    @Query("SELECT * FROM Data WHERE noBerkas LIKE :noBerkas")
    List<Data> getData(String noBerkas);
    @Insert
    void insertData(Data data);
}
