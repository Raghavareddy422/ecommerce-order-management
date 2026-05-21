package com.raghava.ecommerceordermanagement.controller;

import com.raghava.ecommerceordermanagement.dto.OrderDTO;
import com.raghava.ecommerceordermanagement.entity.OrderEntity;
import com.raghava.ecommerceordermanagement.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "https://ecommerce-frontend-taupe-delta.vercel.app")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public OrderEntity placeOrder(@RequestBody OrderDTO orderDTO) {
        return orderService.placeOrder(
                orderDTO.getProductId(),
                orderDTO.getCustomerId(),
                orderDTO.getQuantity()
        );
    }

    public List<OrderEntity> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public OrderEntity getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }
}