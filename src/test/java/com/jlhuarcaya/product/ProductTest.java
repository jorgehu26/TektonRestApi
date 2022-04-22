package com.jlhuarcaya.product;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.jlhuarcaya.TestSuite;
import com.jlhuarcaya.model.Discount;
import com.jlhuarcaya.model.Product;
import com.jlhuarcaya.model.ProductCategory;
import com.jlhuarcaya.model.ProductInventory;
import com.jlhuarcaya.model.ProductMasterDetail;

public class ProductTest extends TestSuite {

  @Test
  public void createProduct() {
    ProductCategory productCategory = new ProductCategory();
    ProductInventory productInventory = new ProductInventory();
    Discount discount = new Discount();
    Product product = new Product();
    ProductMasterDetail productMasterDetail = new ProductMasterDetail();
    productCategory = createProductCategory(Long.valueOf(1), "car", "Car category");
    productInventory = createProductInventory(Long.valueOf(1), Long.valueOf(12));
    discount =
        createDiscount(Long.valueOf(1), "20%", "20% de descuento", new BigDecimal(0.2), true);
    product = createProduct(Long.valueOf(1), "Car Ford", "Car Ford sports", "a4S6KUuLeoM",
        Long.valueOf(1), Long.valueOf(1), Long.valueOf(1), new BigDecimal(300000));
    productMasterDetail = getById(Long.valueOf(1));

    assertNotNull(productCategory);
    assertNotNull(productInventory);
    assertNotNull(discount);
    assertNotNull(product);
    assertNotNull(productMasterDetail);
  }

}
