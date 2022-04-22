package com.jlhuarcaya.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import com.jlhuarcaya.model.ProductMasterDetail;
import com.jlhuarcaya.service.ProductService;

@Component("productGetByIdHealthCheck")
public class ProductGetByIdHealthCheck implements HealthIndicator {

  @Autowired
  private ProductService productService;

  @Override
  public Health health() {
    int errorCode = check();
    if(errorCode != 0) {
      return Health.down().withDetail("Error code", errorCode).build();
    }
    return Health.up().build();
  }
  
  public int check() {
    try {
      ProductMasterDetail product = new ProductMasterDetail();      
      product = productService.getById(Long.valueOf(1));    
    } catch(Exception e) {
      e.printStackTrace();
      return 1;
    }
    return 0;
  }
}
