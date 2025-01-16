package com.roudame.hexagonal.domain.product;

import com.roudame.hexagonal.domain.product.model.Product;

import java.util.List;

public interface ProductService {
    Product create(Product product);
    Product updateProduct(Product product);
    boolean deleteProduct(Product product);
    List<Product> getAllProducts();
}
