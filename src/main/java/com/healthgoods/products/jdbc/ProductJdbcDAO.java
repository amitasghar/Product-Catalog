package com.healthgoods.products.jdbc;

import com.healthgoods.products.entity.Product;
import com.healthgoods.products.entity.ProductDisplay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductJdbcDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Product> findAll()
    {
        return jdbcTemplate.query("select * from product",
                new BeanPropertyRowMapper<Product>(Product.class));
    }

    public Product findByProduct(int id)
    {
        return jdbcTemplate.queryForObject
                ("select * from product where id = ?", new Object[]{id},
                new BeanPropertyRowMapper<Product>(Product.class));
    }

    public List<ProductDisplay> findByCategory(String category)
    {
        List<ProductDisplay> pl =  jdbcTemplate.query(
                "SELECT PRODUCT.NAME AS NAME, PRODUCT.DESCRIPTION AS DESCRIPTION, CATEGORY.DESCRIPTION AS CATEGORY, " +
                        "SUBCATEGORY.DESCRIPTION AS SUBCATEGORY, SKU.PRICE AS PRICE, SKU.QUANTITY AS QUANTITY, MEDIA.ALT_TEXT AS ALT_TEXT, MEDIA.URL AS URL" +
                        " FROM PRODUCT, CATEGORY, SUBCATEGORY, SKU, MEDIA " +
                        "WHERE PRODUCT.CATEGORY_ID = CATEGORY.ID AND lower(CATEGORY.DESCRIPTION) = lower( ? ) " +
                        "AND PRODUCT.SUBCATEGORY_ID = SUBCATEGORY.ID " +
                        "AND PRODUCT.SKU_ID = SKU.ID " +
                        "AND PRODUCT.MEDIA_ID = MEDIA.ID "
                        , new Object[]{category},
                        new BeanPropertyRowMapper<ProductDisplay>(ProductDisplay.class));
        return pl;
    }

}