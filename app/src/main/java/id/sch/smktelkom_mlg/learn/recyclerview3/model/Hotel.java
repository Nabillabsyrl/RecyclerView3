package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by Nabila Basharahil on 11/1/2016.
 */
public class Hotel implements Serializable{
    public String judul;
    public String deskripsi;
    public String detail;
    public String lokasi;
    public String foto;

    public Hotel(String judul, String deskripsi, String detail, String lokasi, String foto)

    {
        this.judul = judul;
        this.detail = detail;
        this.deskripsi = deskripsi;
        this.lokasi = lokasi;
        this.foto = foto;
    }
}

