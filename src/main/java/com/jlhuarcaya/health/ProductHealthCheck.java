package com.jlhuarcaya.health;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.jlhuarcaya.model.Product;
import com.jlhuarcaya.service.ProductService;

@Component("productHealthCheck")
public class ProductHealthCheck implements HealthIndicator {

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
      List<Product> product = new ArrayList<Product>();
      product = productService.getProduct();    
    } catch(Exception e) {
      e.printStackTrace();
      return 1;
    }
    return 0;
  }
}
