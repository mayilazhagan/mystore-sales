package com.devmile.store.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmile.store.sales.domain.OrderLineItem;

public interface OrderLineItemRepository extends JpaRepository<OrderLineItem, Integer>{

}
