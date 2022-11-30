package com.example.demoJpa.repository;

import com.example.demoJpa.model.Order;

public interface MyRepository {
    Order findOrder(Long id);
	Order createOrder(Order order);
	void deleteOrder(Long id);
	void updateOrder(Long id, Order order);
}
