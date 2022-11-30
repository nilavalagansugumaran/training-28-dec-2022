package com.example.demoJpa.repository;

import com.example.demoJpa.model.Order;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class OrderJpaRepository implements MyRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Order findOrder(Long id) {
        return entityManager.find(Order.class, id);
    }
    @Override
    @Transactional
    public Order createOrder(Order order) {
        entityManager.persist(order);
        return order;
    }
    @Override
    @Transactional
    public void deleteOrder(Long id) {
        entityManager.remove(findOrder(id));
    }
    @Override
    @Transactional
    public void updateOrder(Long id, Order order) {
        Order orderFromDB = findOrder(id);
        orderFromDB.setTotalCost(order.getTotalCost());
        orderFromDB.setProducts(order.getProducts());
        entityManager.persist(orderFromDB);
    }
}
