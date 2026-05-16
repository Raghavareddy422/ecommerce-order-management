package com.raghava.ecommerceordermanagement.service;

import com.raghava.ecommerceordermanagement.entity.Customer;
import com.raghava.ecommerceordermanagement.entity.OrderEntity;
import com.raghava.ecommerceordermanagement.entity.Product;
import com.raghava.ecommerceordermanagement.repository.CustomerRepository;
import com.raghava.ecommerceordermanagement.repository.OrderRepository;
import com.raghava.ecommerceordermanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public OrderEntity placeOrder(Long productId, Long customerId, Integer quantity) {

        Product product = productRepository.findById(productId).orElse(null);
        Customer customer = customerRepository.findById(customerId).orElse(null);

        if (product == null || customer == null) {
            throw new RuntimeException("Product or Customer not found");
        }

        if (product.getStockQuantity() < quantity) {
            throw new RuntimeException("Insufficient stock");
        }

        Double total = product.getPrice() * quantity;

        product.setStockQuantity(product.getStockQuantity() - quantity);
        productRepository.save(product);

        OrderEntity order = new OrderEntity();
        order.setProduct(product);
        order.setCustomer(customer);
        order.setQuantity(quantity);
        order.setTotalAmount(total);

        return orderRepository.save(order);
    }

    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    public OrderEntity getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
}