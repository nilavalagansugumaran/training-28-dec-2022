package com.example.demoJpa.controller;

import com.example.demoJpa.model.Order;
import com.example.demoJpa.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @Autowired
    private MyRepository repository;

    @GetMapping(path = "/order/{id}", produces = {"application/json"})
    public Order findOrder(@PathVariable("id") Long id){

        return repository.findOrder(id);
    }

    @PostMapping(path = "/order", produces = {"application/json"} )
    public Order createOrder(@RequestBody Order order){
        return repository.createOrder(order);
    }

    @DeleteMapping(path = "/order/{id}", produces = {"application/json"})
    public void deleteOrder(@PathVariable("id") Long id){
         repository.deleteOrder(id);
    }

    @PutMapping(path = "/order/{id}", produces = {"application/json"})
    public void updateOrder(@PathVariable("id") Long id, @RequestBody Order order){
        repository.updateOrder(id, order);
    }
}
