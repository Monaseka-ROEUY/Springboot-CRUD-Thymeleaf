package com.kaka.dev.product_crud_thymeleaf.controller;

import ch.qos.logback.core.util.StringUtil;
import com.kaka.dev.product_crud_thymeleaf.entity.Product;
import com.kaka.dev.product_crud_thymeleaf.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public String saveProduct(Product product){
        productService.createProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/new")
    public String createProductForm(Model model) {
        model.addAttribute("product",new Product());
        return "product-create";
    }

    @GetMapping("/edit/{id}")
    public String showEditProductForm(@PathVariable("id") Long id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "product-edit";
    }

    @PostMapping("/update/{id}")
    public String updateProduct(@PathVariable("id") Long id, @ModelAttribute Product product) {
        product.setId(id);
        productService.createProduct(product);
        return "redirect:/products";
    }


    @GetMapping
    public String listAllProducts(Model model, @RequestParam(required = false) String name) {
        List<Product> products;
        if (!StringUtil.isNullOrEmpty(name)) {
            products = productService.getProductsByName(name);
        } else {
            products = productService.getAllProducts();
        }
        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("view/{id}")
    public String viewProduct(@PathVariable Long id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "product-view";
    }

    @GetMapping("delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProductById(id);
        return "redirect:/products";
    }
}
