package com.jlhuarcaya.rest;

import java.util.Date;
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
import com.jlhuarcaya.model.Master;
import com.jlhuarcaya.model.Product;
import com.jlhuarcaya.model.ProductMasterDetail;
import com.jlhuarcaya.model.SplashProduct;
import com.jlhuarcaya.model.UnsplashResponse;
import com.jlhuarcaya.repo.ProductRepository;
import com.jlhuarcaya.service.ProductService;

@RestController
@RequestMapping(Constants.SECURE_BASE_ENDPOINT)
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @Autowired
  private ProductService productService;

  @GetMapping(value = "/product")
  public @ResponseBody List<Product> getProduct() {
    return productService.getProduct();
  }

  @PostMapping(value = "/product")
  public @ResponseBody Product create(@RequestBody Product product) {
    return productService.create(product);
  }

  @PutMapping(value = "/product/{id}")
  public @ResponseBody Product modify(@RequestBody Product product) {
    return productService.modify(product);
  }

  @GetMapping(value = "/product/{id}")
  public @ResponseBody ProductMasterDetail getById(@PathVariable(value = "id") Long id) {    
    return productService.getById(id);
  }

}
