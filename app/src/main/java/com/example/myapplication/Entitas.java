package com.example.myapplication;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "entitas")
public class Entitas {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "nama")
    private String nama;

    @ColumnInfo(name = "stambuk")
    private String stambuk;

    public Entitas(String nama, String stambuk) {
        this.nama = nama;
        this.stambuk = stambuk;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getStambuk() {
        return stambuk;
    }
}
