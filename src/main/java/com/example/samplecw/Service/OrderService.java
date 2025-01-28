package com.example.samplecw.Service;

import com.example.samplecw.Repository.orderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.samplecw.model.Order;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private orderRepository orderRepository;

    // Place a new order
    public Order placeOrder(Order order) {
        return orderRepository.save(order);
    }

    // Get all orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

}
