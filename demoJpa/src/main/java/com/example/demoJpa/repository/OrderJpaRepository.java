package com.example.demoJpa.repository;

import com.example.demoJpa.model.Order;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Slf4j
public class OrderJpaRepository implements MyRepository{

    @PersistenceContext
    private EntityManager entityManager;

    private void printAllOrders(){

        String sql = "select o from Order o";
        TypedQuery<Order> orders = entityManager.createQuery(sql, Order.class);
        log.info("All orders in DB {}", orders.getResultList());
    }

    @Override
    public Order findOrder(Long id) {
        printAllOrders();
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
