package com.jlhuarcaya;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.jlhuarcaya.common.Constants;
import com.jlhuarcaya.model.Discount;
import com.jlhuarcaya.model.Product;
import com.jlhuarcaya.model.ProductCategory;
import com.jlhuarcaya.model.ProductInventory;
import com.jlhuarcaya.model.ProductMasterDetail;
import com.jlhuarcaya.service.DiscountService;
import com.jlhuarcaya.service.ProductCategoryService;
import com.jlhuarcaya.service.ProductInventoryService;
import com.jlhuarcaya.service.ProductService;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
    classes = {TektonRestApi2Application.class})
public class TestSuite {

  protected String baseContext = "http://localhost:";
  protected String secureBaseVersion = Constants.SECURE_BASE_ENDPOINT;
  String baseUrl = baseContext + "8080" + secureBaseVersion;
  protected String productCategoryURL = baseUrl + "/product/category";
  protected String productInventoryURL = baseUrl + "/product/inventory";
  protected String discountURL = baseUrl + "/discount";
  protected String productURL = baseUrl + "/product";
  protected RestTemplate restTemplate;

  @Autowired
  private ProductCategoryService productCategoryService;

  @Autowired
  private ProductInventoryService productInventoryService;

  @Autowired
  private DiscountService discountService;

  @Autowired
  private ProductService productService;

  protected ProductCategory createProductCategory(Long id, String name, String descrip) {
    ProductCategory productCategory = new ProductCategory();
    productCategory.setId(id);
    productCategory.setName(name);
    productCategory.setDescrip(descrip);
    productCategory.setCreated(new Date());
    productCategory.setModified(new Date());
    return productCategoryService.create(productCategory);
  }

  protected ProductInventory createProductInventory(Long id, Long quantity) {
    ProductInventory productInventory = new ProductInventory();
    productInventory.setId(id);
    productInventory.setQuantity(quantity);
    productInventory.setCreated(new Date());
    productInventory.setModified(new Date());
    return productInventoryService.create(productInventory);
  }

  protected Discount createDiscount(Long id, String name, String descrip, BigDecimal perdiscount,
      Boolean active) {
    Discount discount = new Discount();
    discount.setId(id);
    discount.setName(name);
    discount.setDescrip(descrip);
    discount.setDiscount_percent(perdiscount);
    discount.setActive(active);
    discount.setCreated(new Date());
    discount.setModified(new Date());
    return discountService.create(discount);
  }

  protected Product createProduct(Long id, String name, String descrip, String sku, Long categoryId,
      Long inventoryId, Long discountId, BigDecimal price) {
    Product product = new Product();
    product.setId(id);
    product.setName(name);
    product.setDescrip(descrip);
    product.setSku(sku);
    product.setCategoryId(categoryId);
    product.setInventoryId(inventoryId);
    product.setDiscountId(discountId);
    product.setPrice(price);
    product.setCreated(new Date());
    product.setModified(new Date());
    return productService.create(product);
  }
  
  protected ProductMasterDetail getById(Long id) {
    return productService.getById(id);
  }

}
