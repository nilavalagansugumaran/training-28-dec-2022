package com.example.demoJpa.repository;

import com.example.demoJpa.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderJpaRepository implements MyRepository{

    @Override
    public Order findOrder(Long id) {
        return null;
    }

    @Override
    public Order createOrder(Order order) {
        return null;
    }

    @Override
    public void deleteOrder(Long id) {

    }

    @Override
    public void updateOrder(Long id, Order order) {

    }
}
