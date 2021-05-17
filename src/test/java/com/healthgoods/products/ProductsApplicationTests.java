package com.healthgoods.products;

import com.healthgoods.products.controller.ProductsController;
import com.healthgoods.products.entity.ProductDisplay;
import com.healthgoods.products.jdbc.ProductJdbcDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ProductsApplicationTests {

	@Autowired
	private ProductsController controller;

	@Autowired
	ProductJdbcDAO dao;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

	@Test
	public void kitchen_products_returned() throws Exception {
		List<ProductDisplay> list = dao.findByCategory("kitchen");
		assert(list.size() == 3);
		assert(list.toString().contains("WW by BUILT(r) 30 oz Tumbler"));
	}

	@Test
	public void food_products_returned_with_url() throws Exception {
		List<ProductDisplay> list = dao.findByCategory("food");
		assert(list.size() == 1);
		assert(list.toString().contains("mini_swtslty_box_f_1200.jpg?auto=webp"));
	}

	@Test
	public void no_matching_produtcs() throws Exception {
		List<ProductDisplay> list = dao.findByCategory("rocks");
		assert(list.size() == 0);
	}
}
