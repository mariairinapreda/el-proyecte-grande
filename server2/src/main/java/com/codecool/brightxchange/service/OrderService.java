package com.codecool.brightxchange.service;

import com.codecool.brightxchange.model.Order;
import com.codecool.brightxchange.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Optional<Order> getById(Long id){
        return orderRepository.findById(id);
    }

    public void saveOrder(Order order){
        orderRepository.save(order);
    }
}
