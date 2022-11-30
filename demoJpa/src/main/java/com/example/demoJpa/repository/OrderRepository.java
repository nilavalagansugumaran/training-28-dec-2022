package com.example.demoJpa.repository;

import com.example.demoJpa.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findByTotalCostGreaterThan(double cost);
}
