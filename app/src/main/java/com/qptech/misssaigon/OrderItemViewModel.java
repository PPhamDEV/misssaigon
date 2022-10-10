package com.qptech.misssaigon;

import android.app.Application;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class OrderItemViewModel extends AndroidViewModel {

    OrderItemRepository orderItemRepository;

    public OrderItemViewModel(@NonNull final Application application) {
        super(application);
        orderItemRepository = new OrderItemRepository(application);
    }

    public void insert(OrderItem orderItem) {
        orderItemRepository.insert(orderItem);
    }

    public List<OrderItem> getOrderItem(String number){
        return orderItemRepository.getOrderItem(number);
    }

    public void removeAll() {
        orderItemRepository.deleteAll();
    }
}
