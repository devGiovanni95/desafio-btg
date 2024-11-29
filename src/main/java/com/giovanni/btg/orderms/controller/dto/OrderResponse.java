package com.giovanni.btg.orderms.controller.dto;

import com.giovanni.btg.orderms.entity.OrderEntity;

import java.math.BigDecimal;

public record OrderResponse(Long orderIs,
                            Long customerId,
                            BigDecimal total) {

    public static OrderResponse fromEntity(OrderEntity entity){
        return new OrderResponse(entity.getOrderId(), entity.getCustomerId(), entity.getTotal());
    }
}
