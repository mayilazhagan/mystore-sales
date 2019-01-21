package com.devmile.store.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmile.store.sales.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
 