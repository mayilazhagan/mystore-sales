package com.devmile.store.sales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication
/*
@ComponentScan(basePackages= {"com.mile.store.*"})
@EnableJpaRepositories(basePackages={"com.mile.store.*"})
*/
public class SalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesApplication.class, args);
	}

}

