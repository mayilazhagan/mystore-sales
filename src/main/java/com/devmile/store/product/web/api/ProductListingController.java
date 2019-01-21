package com.devmile.store.product.web.api;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.devmile.store.product.web.api.mapper.ProductMapper;
import com.devmile.store.product.web.api.model.Product;
import com.devmile.store.product.service.ProductListingService;

@RestController
public class ProductListingController {

	@Autowired
	private ProductListingService productService;
	
	@Autowired
	private ProductMapper productMapper;
	
	@GetMapping(value="/products")
	public List<Product> getAllProducts() {
		
		List<com.devmile.store.product.domain.Product> products = productService.getAllProducts();
		return products.stream()
				.map(product -> productMapper.domainToApi(product))
				.collect(Collectors.toList());
	}
	
	@GetMapping(value = "/products/{id}")
	public Product getProduct(@PathVariable Long id) {
		
		return productMapper.domainToApi(productService.getProduct(id));
	}
	
}
