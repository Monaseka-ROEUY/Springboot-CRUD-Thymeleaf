package com.kaka.dev.product_crud_thymeleaf.service.impl;

import com.kaka.dev.product_crud_thymeleaf.entity.Product;
import com.kaka.dev.product_crud_thymeleaf.repository.ProductRepository;
import com.kaka.dev.product_crud_thymeleaf.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void createProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductsByName(String productName) {
        return productRepository.findByNameContainingIgnoreCase(productName);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}
