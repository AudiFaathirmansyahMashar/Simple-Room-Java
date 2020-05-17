package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nama, stambuk;
    private Button btn_insert;

    private AppDataBase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.name);
        stambuk = findViewById(R.id.stambuk);
        btn_insert = findViewById(R.id.btn);

        db = Room.databaseBuilder(getApplicationContext(), AppDataBase.class, "mahasiswa").allowMainThreadQueries().build();

        btn_insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.mhsDao().insertMahasiwa(new Entitas(nama.getText().toString(), stambuk.getText().toString()));
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }
}
