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

import com.application.CategoryProduct.entity.Category;
import com.application.CategoryProduct.service.CategoryService;




@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    public CategoryService categoryService;
  
    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }
    @GetMapping
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }
     @PutMapping("/{id}")
    public Category editCategories(@PathVariable Long id, @RequestBody Category category) { 
     return categoryService.updateCategory(id,category);
    }
@DeleteMapping("/{id}")
public void deleteCategory(@PathVariable Long id){
    categoryService.deleteCategory(id);
}
}
