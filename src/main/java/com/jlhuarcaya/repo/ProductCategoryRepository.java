package com.jlhuarcaya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlhuarcaya.model.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
