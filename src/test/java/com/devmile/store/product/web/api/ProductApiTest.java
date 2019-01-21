package com.devmile.store.product.web.api;

import static org.hamcrest.CoreMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.BDDMockito.*;


import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.devmile.store.product.service.ProductListingService;
import com.devmile.store.product.web.api.ProductListingController;
import com.devmile.store.product.web.api.mapper.ProductMapper;
import com.devmile.store.product.web.api.model.Product;

@RunWith(SpringRunner.class)
@WebMvcTest(ProductListingController.class)
public class ProductApiTest {

	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private ProductListingService service;
	
	@MockBean
	private ProductMapper mapper;

	@Test
	public void getProductsReturnProductDetails()
	  throws Exception {
	     
	    Product product = new Product();
	    product.setName("my product");
	 
	    com.devmile.store.product.domain.Product productObj = new com.devmile.store.product.domain.Product();
	    productObj.setName("my product");
	    List<com.devmile.store.product.domain.Product> allProducts = Arrays.asList(productObj);
	 
	    given(service.getAllProducts()).willReturn(allProducts);

	    given(mapper.domainToApi(productObj)).willReturn(product);
	    
	    mvc.perform(get("/products")
	      .contentType(MediaType.APPLICATION_JSON))
	      .andExpect(status().isOk())
	      .andExpect(jsonPath("$[0].name", is(product.getName())));
	}
}
