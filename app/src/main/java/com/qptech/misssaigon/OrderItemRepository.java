package com.qptech.misssaigon;

import android.app.Application;
import android.os.AsyncTask;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Index;

public class OrderItemRepository {
    private OrderItemDao mOrderItemDao;

    public OrderItemRepository(Application application){
        AppDatabase db = AppDatabase.getDatabase(application);
        mOrderItemDao = db.orderItemDao();
    }

    public void insert (OrderItem orderItem) {
        new insertAsyncTask(mOrderItemDao).execute(orderItem);
    }

    public List<OrderItem> getOrderItem(String number){
        return mOrderItemDao.getOrderItem(number);
    }

    private static class insertAsyncTask extends AsyncTask<OrderItem, Void, Void> {

        private OrderItemDao mAsyncOrderItemDao;

        insertAsyncTask(OrderItemDao dao) {
            mAsyncOrderItemDao = dao;
        }

        @Override
        protected Void doInBackground(final OrderItem... params) {
            mAsyncOrderItemDao.insert(params[0]);
            return null;
        }
    }

    public void deleteAll() { new deleteAllOrderItemAsyncTask(mOrderItemDao).execute(); }
    private static class deleteAllOrderItemAsyncTask extends AsyncTask< Integer, Void, Void> {

        private OrderItemDao mAsyncOrderItemDao;

        deleteAllOrderItemAsyncTask(OrderItemDao dao) {
            mAsyncOrderItemDao = dao;
        }

        @Override
        protected Void doInBackground(final Integer... params) {
            mAsyncOrderItemDao.removeAll();
            return null;
        }
    }
}
