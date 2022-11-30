package com.example.demoJpa.controller;

import com.example.demoJpa.model.Order;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @GetMapping(path = "/order/{id}", produces = {"application/json"})
    public Order findOrder(@PathVariable("id") Long id){

        
    }

    @PostMapping(path = "/order", produces = {"application/json"} )
    public Order createOrder(@RequestBody Order order){

    }

    @DeleteMapping(path = "/order/{id}", produces = {"application/json"})
    public void deleteOrder(@PathVariable("id") Long id){

    }

    @PutMapping(path = "/order/{id}", produces = {"application/json"})
    public void updateOrder(@PathVariable("id") Long id, @RequestBody Order order){

    }
}
