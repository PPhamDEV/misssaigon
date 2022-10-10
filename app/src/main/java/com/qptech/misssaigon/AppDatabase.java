package com.qptech.misssaigon;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {OrderItem.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract OrderItemDao orderItemDao();
    private static AppDatabase INSTANCE;

    public static AppDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                                    AppDatabase.class, "2day_database")
                                   // Wipes and rebuilds instead of migrating
                                   // if no Migration object.
                                   // Migration is not part of this practical.
                                   .fallbackToDestructiveMigration()
                                   .build();
                }
            }
        }
        return INSTANCE;
    }
}
