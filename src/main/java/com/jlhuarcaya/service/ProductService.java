package com.jlhuarcaya.service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.jlhuarcaya.model.Master;
import com.jlhuarcaya.model.Product;
import com.jlhuarcaya.model.ProductMasterDetail;
import com.jlhuarcaya.model.SplashProduct;
import com.jlhuarcaya.model.UnsplashResponse;
import com.jlhuarcaya.repo.ProductRepository;

@Service
public class ProductService {

  @Autowired
  private ProductRepository productRepository;

  public List<Product> getProduct() {
    return productRepository.findAll();
  }

  public Product create(Product product) {
    product.setCreated(new Date());
    product.setModified(new Date());
    return productRepository.save(product);
  }

  public Product modify(Product product) {
    product.setCreated(productRepository.findById(product.getId()).get().getCreated());
    product.setModified(new Date());
    return productRepository.save(product);
  }

  public UnsplashResponse invokeRestService(String query, int page, int per_page) {
    UnsplashResponse unsplashResponse = new UnsplashResponse();
    Gson gson = new Gson();
    
    String url = "https://api.unsplash.com/search/photos/?query=" + query + "&page=" + page
        + "&per_page=" + per_page;

    RestTemplate restTemplate = new RestTemplate();

    HttpHeaders headers = new HttpHeaders();

    headers.setContentType(MediaType.APPLICATION_JSON);
    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

    headers.set("Authorization", "Client-ID oblI7hTeugtfjfM2RFbr2L4G-QAjwEqFOVxQiLcQ5Y4");

    HttpEntity request = new HttpEntity(headers);

    ResponseEntity<String> response =
        restTemplate.exchange(url, HttpMethod.GET, request, String.class, 1);
    unsplashResponse = gson.fromJson(response.getBody(), UnsplashResponse.class);

    if (response.getStatusCode() == HttpStatus.OK) {
      System.out.println("Request Successful.");
      System.out.println(response.getBody());
    } else {
      System.out.println("Request Failed");
      System.out.println(response.getStatusCode());
    }

    return unsplashResponse;
  }
  
  public ProductMasterDetail getById(Long id) {
    
    UnsplashResponse unsplashResponse = new UnsplashResponse();
    Product product = new Product();
    SplashProduct splashProduct = new SplashProduct();
    Master master = new Master();
    ProductMasterDetail productMasterDetail = new ProductMasterDetail();

    product = productRepository.findById(id).get();
    final String sku = product.getSku();
    
    unsplashResponse =
        invokeRestService(product.getProductCategory().getName(), 1, 10);
    splashProduct = unsplashResponse.getResults().stream()
        .filter(splash -> splash.getId().equals(sku)).findAny().orElse(null);
    
    master.setServicioExterno(splashProduct);
    master.setBaseDatos(product);
    productMasterDetail.setMaster(master);
    productMasterDetail.setDetail(product);
    
    return productMasterDetail;
  }
  
}
