package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MahasiswaDao {
    @Insert
    void insertMahasiwa(Entitas... entitas);

    @Query("SELECT * FROM entitas")
    List<Entitas> getMahasiswa();
}
