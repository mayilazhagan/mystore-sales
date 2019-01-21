package com.devmile.store.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmile.store.product.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
