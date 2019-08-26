package com.gustu.cekpengukuran.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Data {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name = "nomorSurat")
    String nomorSurat;
    @ColumnInfo(name = "namaPemohon")
    String namaPemohon;
    @ColumnInfo(name = "kuasa")
    String kuasa;
    @ColumnInfo(name = "rtrw")
    String rtrw;
    @ColumnInfo(name = "noHMC")
    String noHMC;
    @ColumnInfo (name = "noBerkas")
    String noBerkas;
    @ColumnInfo(name = "desa")
    String desa;
    @ColumnInfo(name = "kecamatan")
    String kecamatan;
    @ColumnInfo(name = "kabupaten")
    String kabupaten;
    @ColumnInfo(name = "hari")
    String hari;
    @ColumnInfo(name = "tanggalUkur")
    String tglUkur;
    @ColumnInfo(name = "tanggal302")
    String tgl302;
    @ColumnInfo (name = "petugasUkur")
    String petugasUkur;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomorSurat() {
        return nomorSurat;
    }

    public void setNomorSurat(String nomorSurat) {
        this.nomorSurat = nomorSurat;
    }

    public String getNamaPemohon() {
        return namaPemohon;
    }

    public void setNamaPemohon(String namaPemohon) {
        this.namaPemohon = namaPemohon;
    }

    public String getKuasa() {
        return kuasa;
    }

    public void setKuasa(String kuasa) {
        this.kuasa = kuasa;
    }

    public String getRtrw() {
        return rtrw;
    }

    public void setRtrw(String rtrw) {
        this.rtrw = rtrw;
    }

    public String getNoHMC() {
        return noHMC;
    }

    public void setNoHMC(String noHMC) {
        this.noHMC = noHMC;
    }

    public String getNoBerkas() {
        return noBerkas;
    }

    public void setNoBerkas(String noBerkas) {
        this.noBerkas = noBerkas;
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getTglUkur() {
        return tglUkur;
    }

    public void setTglUkur(String tglUkur) {
        this.tglUkur = tglUkur;
    }

    public String getTgl302() {
        return tgl302;
    }

    public void setTgl302(String tgl302) {
        this.tgl302 = tgl302;
    }

    public String getPetugasUkur() {
        return petugasUkur;
    }

    public void setPetugasUkur(String petugasUkur) {
        this.petugasUkur = petugasUkur;
    }

}
