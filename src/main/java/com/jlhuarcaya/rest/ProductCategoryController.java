package com.jlhuarcaya.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jlhuarcaya.common.Constants;
import com.jlhuarcaya.model.ProductCategory;
import com.jlhuarcaya.service.ProductCategoryService;

@RestController
@RequestMapping(Constants.SECURE_BASE_ENDPOINT)
public class ProductCategoryController {

  @Autowired
  private ProductCategoryService productCategoryService;

  @GetMapping(value = "/product/category")
  public @ResponseBody List<ProductCategory> getProductCategory() {
    return productCategoryService.getProductCategory();
  }

  @PostMapping(value = "/product/category")
  public @ResponseBody ProductCategory create(@RequestBody ProductCategory productCategory) {
    return productCategoryService.create(productCategory);
  }

  @PutMapping(value = "/product/category/{id}")
  public @ResponseBody ProductCategory modify(@RequestBody ProductCategory productCategory) {
    return productCategoryService.modify(productCategory);
  }

  @GetMapping(value = "/product/category/{id}")
  public @ResponseBody ProductCategory getById(@PathVariable(value = "id") Long id) {
    return productCategoryService.getById(id);
  }

}
