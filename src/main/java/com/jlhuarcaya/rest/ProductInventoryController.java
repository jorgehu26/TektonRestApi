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
import com.jlhuarcaya.model.ProductInventory;
import com.jlhuarcaya.service.ProductInventoryService;

@RestController
@RequestMapping(Constants.SECURE_BASE_ENDPOINT)
public class ProductInventoryController {

  @Autowired
  private ProductInventoryService productInventoryService;

  @GetMapping(value = "/product/inventory")
  public @ResponseBody List<ProductInventory> getProductInventory() {
    return productInventoryService.getProductInventory();
  }

  @PostMapping(value = "/product/inventory")
  public @ResponseBody ProductInventory create(@RequestBody ProductInventory productInventory) {
    return productInventoryService.create(productInventory);
  }

  @PutMapping(value = "/product/inventory/{id}")
  public @ResponseBody ProductInventory modify(@RequestBody ProductInventory productInventory) {
    return productInventoryService.modify(productInventory);
  }

  @GetMapping(value = "/product/inventory/{id}")
  public @ResponseBody ProductInventory getById(@PathVariable(value = "id") Long id) {
    return productInventoryService.getById(id);
  }

}
