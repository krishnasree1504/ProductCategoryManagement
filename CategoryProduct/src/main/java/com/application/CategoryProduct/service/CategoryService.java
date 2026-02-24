package com.application.CategoryProduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.CategoryProduct.entity.Category;
import com.application.CategoryProduct.repository.CategoryRepository;


@Service
public class CategoryService {
  @Autowired
  private CategoryRepository  categoryRepository;
  public Category addCategory(Category category){
    return categoryRepository.save(category);
 }
 public List <Category> getAllCategory(){
    return categoryRepository.findAll();
 }
 public Category updateCategory(Long id,Category category){
  Category existingCategory = categoryRepository.findById(id)
     .orElseThrow(() ->
             new RuntimeException("Category with + "+id+ "not present"));
  existingCategory.setName(category.getName());
  existingCategory.setDescription(category.getDescription());
  return categoryRepository.save(existingCategory);
 }

 public void deleteCategory(Long id){
   Category category = categoryRepository.findById(id)
      .orElseThrow(() ->
              new RuntimeException("Course with +"+id+"not present"));
     categoryRepository.deleteById(id);
 }
}
