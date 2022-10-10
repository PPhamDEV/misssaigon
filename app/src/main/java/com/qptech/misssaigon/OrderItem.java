package com.qptech.misssaigon;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "OrderItem")
public class OrderItem {
    @PrimaryKey(autoGenerate  = true)
    public int id;

    @ColumnInfo(name = "number")
    public String number;

    @ColumnInfo(name = "price")
    public float price;

    public OrderItem(final String number, final float price) {
        this.number = number;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public OrderItem setNumber(final String number) {
        this.number = number;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public OrderItem setPrice(final float price) {
        this.price = price;
        return this;
    }
}
