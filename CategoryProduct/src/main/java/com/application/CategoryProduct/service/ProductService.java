package com.application.CategoryProduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.CategoryProduct.entity.Product;
import com.application.CategoryProduct.repository.ProductRepository;

@Service
public class ProductService {
   @Autowired
   private ProductRepository productRepository;

   public Product addProduct(Product product){
    return productRepository.save(product);
   }

   public List<Product> getAllProducts(){
    return productRepository.findAll();
   }
}
