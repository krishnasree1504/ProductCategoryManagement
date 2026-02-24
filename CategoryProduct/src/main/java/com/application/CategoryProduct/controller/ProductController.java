package com.application.CategoryProduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.CategoryProduct.entity.Product;
import com.application.CategoryProduct.service.ProductService;




@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    
    @PostMapping
public Product createProduct(@RequestBody Product product,
                             @PathVariable Long categoryId){
    return productService.addProduct(product);
}
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    @PutMapping("/{id}")
    public Product editProducts(@PathVariable Long id, @RequestBody Product product) {
      return productService.updateProduct(id,product);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }    
}
