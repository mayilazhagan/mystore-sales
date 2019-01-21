package com.devmile.store.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devmile.store.sales.domain.Order;
import com.devmile.store.sales.domain.OrderLineItem;
import com.devmile.store.sales.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	
	public Order placeOrder(Order order) {
		
		for (OrderLineItem lineItem: order.getOrderItems()) {
			lineItem.setOrder(order);
		}
		
		Order createdOrder  = orderRepository.save(order);
		return createdOrder;
		
	}
	
	public List<Order> getOrders() {
		
		return orderRepository.findAll();
	}
}
