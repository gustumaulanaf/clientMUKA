package com.gustu.cekpengukuran.model;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Data.class}, version = 1, exportSchema = false)
public abstract class DataDatabase extends RoomDatabase {
    private static DataDatabase INSTANCE;

    public abstract DataDao dataDao();

    public static DataDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (DataDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), DataDatabase.class, "db-data").allowMainThreadQueries().build();
                }
            }
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
