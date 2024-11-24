package com.giovanni.btg.orderms.service;

import com.giovanni.btg.orderms.entity.OrderEntity;
import com.giovanni.btg.orderms.entity.OrderItem;
import com.giovanni.btg.orderms.listener.dto.OrderCreatedEvent;
import com.giovanni.btg.orderms.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;


    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void save(OrderCreatedEvent event) {

        var entity = new OrderEntity();
        entity.setOrderId(event.codigoPedido());
        entity.setCustomerId(event.codigoCliente());

        entity.setItems(event.itens().stream()
                .map(i -> new OrderItem(i.produto(), i.quantidade(), i.preco()))
                .toList()
        );
    }
}
