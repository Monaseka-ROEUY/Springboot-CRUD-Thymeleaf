package com.kaka.dev.product_crud_thymeleaf.service;

import com.kaka.dev.product_crud_thymeleaf.entity.Product;

import java.util.List;

public interface ProductService {
    void createProduct(Product product);

    List<Product> getAllProducts();

    List<Product> getProductsByName(String productName);

    Product getProductById(Long id);

    void deleteProductById(Long id);

}
