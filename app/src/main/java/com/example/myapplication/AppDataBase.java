package com.example.myapplication;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Entitas.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract MahasiswaDao mhsDao();
}
