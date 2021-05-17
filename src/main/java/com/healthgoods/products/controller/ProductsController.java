package com.healthgoods.products.controller;

import com.healthgoods.products.entity.ProductDisplay;
import com.healthgoods.products.entity.ProductsList;
import com.healthgoods.products.jdbc.ProductJdbcDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    ProductJdbcDAO dao;

    @GetMapping("/products")
    public ProductsList getAllProducts(@RequestParam(value = "category", defaultValue = "") String name)
    {
        List<ProductDisplay> list = dao.findByCategory(name);
        ProductsList pl = new ProductsList(list, list.size());
        return pl;
    }
}

