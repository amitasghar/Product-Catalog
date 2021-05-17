package com.healthgoods.products;

import com.healthgoods.products.jdbc.ProductJdbcDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProductJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All products -> {}", dao.findAll());
		logger.info("product 1 -> {}", dao.findByProduct(1));
		logger.info("kitchen products - " + dao.findByCategory("kitchen"));
		logger.info("cup products - " + dao.findByCategory("Cup"));
	}
}
