package com.example.demoJpa.controller;

import com.example.demoJpa.model.Order;
import com.example.demoJpa.repository.MyRepository;
import com.example.demoJpa.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class OrderRepositoryController {

    @Autowired
    private OrderRepository repository;

    @GetMapping(path = "/order-jpa/{id}", produces = {"application/json"})
    public Order findOrder(@PathVariable("id") Long id){

        return repository.findById(id).orElse(null);
    }

    @PostMapping(path = "/order-jpa", produces = {"application/json"} )
    public Order createOrder(@RequestBody Order order){
        return repository.save(order);
    }

    @DeleteMapping(path = "/order-jpa/{id}", produces = {"application/json"})
    public void deleteOrder(@PathVariable("id") Long id){
         repository.deleteById(id);
    }

    @PutMapping(path = "/order-jpa/{id}", produces = {"application/json"})
    public void updateOrder(@PathVariable("id") Long id, @RequestBody Order order){

       Order orderfromDB = repository.findById(id).orElse(null);
       orderfromDB.setTotalCost(order.getTotalCost());
        orderfromDB.setProducts(order.getProducts());
        repository.save(orderfromDB);
    }

    @GetMapping(path = "/order-jpa", produces = {"application/json"})
    public List<Order> costlyOrders(@RequestParam("cost") double cost){

        return repository.findByTotalCostGreaterThan(cost);
        //return repository.findById(id).orElse(null);
    }


}
