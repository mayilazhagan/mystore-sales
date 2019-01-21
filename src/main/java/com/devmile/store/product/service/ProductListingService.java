package com.devmile.store.product.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devmile.store.product.domain.Product;
import com.devmile.store.product.repository.ProductRepository;

@Service
public class ProductListingService {

	@Autowired
	private ProductRepository productRepository;
	
	@Transactional
	public List<Product> getAllProducts() {
		
		return (List<Product>) productRepository.findAll();
	}
	
	@Transactional
	public Product getProduct(Long id) {
		
		return productRepository.findById(id).get();
	}
}
