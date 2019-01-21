package com.devmile.store.sales.web.api;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devmile.store.sales.service.OrderService;
import com.devmile.store.sales.web.api.mapper.OrderMapper;
import com.devmile.store.sales.web.api.model.Order;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private OrderMapper orderMapper;
	
	@PostMapping(value="/checkout")
	public Order checkout(@RequestBody Order order) {
		
		com.devmile.store.sales.domain.Order orderObj = orderMapper.apiToDomain(order);
		return orderMapper.domainToApi(orderService.placeOrder(orderObj));
	}
	
	
	@GetMapping(value="/orders") 
	public List<Order> getAllOrders() {
		
		List<com.devmile.store.sales.domain.Order> orders = orderService.getOrders();
		
		return orders.stream()
				.map(order -> orderMapper.domainToApi(order))
				.collect(Collectors.toList());
	}
}
