package com.example.litepaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LitePal.initialize(this);
        SQLiteDatabase db = LitePal.getDatabase();
        //增加
//        Album album = new Album();
//        album.setName("album");
//        album.setPrice(10.99f);
//        album.save();
        //更新一条数据
//        Album albumToUpdate = LitePal.find(Album.class,1);
//        albumToUpdate.setPrice(20.99f);
//        albumToUpdate.save();
        //更新所有数据
//        Album albumToUpdateall = new Album();
//        albumToUpdateall.setPrice(50.99f);
//        albumToUpdateall.updateAll("name = ?","album");
        LitePal.delete(Album.class,1);


    }
}