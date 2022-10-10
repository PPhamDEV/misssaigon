package com.qptech.misssaigon;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface OrderItemDao {

    @Query("SELECT * FROM OrderItem")
    List<OrderItem> getAll();

    @Query("SELECT * FROM OrderItem WHERE number LIKE :number")
    List<OrderItem> getOrderItem(String number);

    @Insert
    void insert(OrderItem orderItem);

    @Update
    void updateTask(OrderItem orderItem);

    @Query("DELETE FROM OrderItem WHERE id == :id")
    void deleteItem(int id);

    @Query("DELETE FROM OrderItem")
    void removeAll();
}
