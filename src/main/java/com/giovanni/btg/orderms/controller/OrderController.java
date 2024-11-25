package com.giovanni.btg.orderms.controller;

import com.giovanni.btg.orderms.controller.dto.ApiResponse;
import com.giovanni.btg.orderms.controller.dto.OrderResponse;
import com.giovanni.btg.orderms.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final OrderService orderService;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/customers/{customerId}/orders")
    public ResponseEntity<ApiResponse<OrderResponse>> ListOrders(@RequestParam(name = "page", defaultValue = "0") Integer page,
                                                                 @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){
        return ResponseEntity.ok(null);
    }
}
