package com.healthgoods.products.entity;

import java.util.List;

public class ProductsList {

    private List<ProductDisplay> productList;
    private int numberOfProducts;

    public ProductsList(List<ProductDisplay> productList, int numberOfProducts) {
        this.productList = productList;
        this.numberOfProducts = numberOfProducts;
    }

    public List<ProductDisplay> getProductList() {
        return productList;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }
}
