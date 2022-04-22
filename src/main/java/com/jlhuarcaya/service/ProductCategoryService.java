package com.jlhuarcaya.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlhuarcaya.model.ProductCategory;
import com.jlhuarcaya.repo.ProductCategoryRepository;

@Service
public class ProductCategoryService {

  @Autowired
  private ProductCategoryRepository productCategoryRepository;
  
  public List<ProductCategory> getProductCategory() {
    return productCategoryRepository.findAll();
  }
  
  public ProductCategory create(ProductCategory productCategory) {
    productCategory.setCreated(new Date());
    productCategory.setModified(new Date());
    return productCategoryRepository.save(productCategory);
  }

  public ProductCategory modify(ProductCategory productCategory) {
    productCategory
        .setCreated(productCategoryRepository.findById(productCategory.getId()).get().getCreated());
    productCategory.setModified(new Date());
    return productCategoryRepository.save(productCategory);
  }
  
  public ProductCategory getById(Long id) {
    return productCategoryRepository.findById(id).get();
  }

}
