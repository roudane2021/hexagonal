package com.roudame.hexagonal.domain.product.impl;

import com.roudame.hexagonal.domain.product.ProductService;
import com.roudame.hexagonal.domain.product.model.Product;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    /**
     * @param product
     * @return
     */
    @Override
    public Product create(Product product) {
        return null;
    }

    /**
     * @param product
     * @return
     */
    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    /**
     * @param product
     * @return
     */
    @Override
    public boolean deleteProduct(Product product) {
        return false;
    }

    /**
     * @return
     */
    @Override
    public List<Product> getAllProducts() {
        return null;
    }
}
