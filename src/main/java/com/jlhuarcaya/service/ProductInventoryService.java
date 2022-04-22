package com.jlhuarcaya.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlhuarcaya.model.ProductInventory;
import com.jlhuarcaya.repo.ProductInventoryRepository;

@Service
public class ProductInventoryService {

  @Autowired
  private ProductInventoryRepository productInventoryRepository;

  public List<ProductInventory> getProductInventory() {
    return productInventoryRepository.findAll();
  }

  public ProductInventory create(ProductInventory productInventory) {
    productInventory.setCreated(new Date());
    productInventory.setModified(new Date());
    return productInventoryRepository.save(productInventory);
  }

  public ProductInventory modify(ProductInventory productInventory) {
    productInventory.setCreated(
        productInventoryRepository.findById(productInventory.getId()).get().getCreated());
    productInventory.setModified(new Date());
    return productInventoryRepository.save(productInventory);
  }

  public ProductInventory getById(Long id) {
    return productInventoryRepository.findById(id).get();
  }

}
