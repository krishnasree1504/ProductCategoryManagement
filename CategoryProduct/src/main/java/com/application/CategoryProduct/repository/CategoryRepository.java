package com.application.CategoryProduct.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.application.CategoryProduct.entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{

}
