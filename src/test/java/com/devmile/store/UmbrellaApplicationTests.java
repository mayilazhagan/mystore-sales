package com.devmile.store;

import static org.hamcrest.CoreMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.devmile.store.UmbrellaApplication;

@RunWith(SpringRunner.class)
@SpringBootTest 
@AutoConfigureMockMvc
@ContextConfiguration(classes = {UmbrellaApplication.class})
public class UmbrellaApplicationTests {

	@Autowired
	private MockMvc mvc;
	 
	@Test
	public void contextLoads() {
	}

	@Test
	public void getProductsFirstProductDetailsMatches()
	  throws Exception {
	 	 
	    mvc.perform(get("/products")
	      .contentType(MediaType.APPLICATION_JSON))
	      .andExpect(status().isOk())
	      .andExpect(content()
	      .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
	      .andExpect(jsonPath("$[0].name", is("product 1")))
	      .andExpect(jsonPath("$[0].description", is("product 1 desc")));

	}
}

