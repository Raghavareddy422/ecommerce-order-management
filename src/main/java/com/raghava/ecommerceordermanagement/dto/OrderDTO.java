package com.raghava.ecommerceordermanagement.dto;

public class OrderDTO {

    private Long productId;
    private Long customerId;
    private Integer quantity;

    public OrderDTO() {
    }

    public OrderDTO(Long productId, Long customerId, Integer quantity) {
        this.productId = productId;
        this.customerId = customerId;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}