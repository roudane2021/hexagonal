package com.roudame.hexagonal.domain.product.port.out;

import com.roudame.hexagonal.domain.product.exception.DoesNotExistException;
import com.roudame.hexagonal.domain.product.model.Product;

import java.util.List;

public interface ProductContollerPort {
    Product createOrUpdate(final Product product);

    boolean exist(final Product product);

    boolean deleteProduct(final Product product) throws DoesNotExistException;

    List<Product> getAllProducts();
}
