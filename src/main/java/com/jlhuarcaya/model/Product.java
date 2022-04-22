package com.jlhuarcaya.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "descrip")
  private String descrip;

  @Column(name = "sku")
  private String sku;

  @Column(name = "category_id")
  private Long categoryId;

  @Column(name = "inventory_id")
  private Long inventoryId;

  @Column(name = "discount_id")
  private Long discountId;

  @Column(name = "price")
  private BigDecimal price;

  @Column(name = "created")
  private Date created;

  @Column(name = "modified")
  private Date modified;

  @OneToOne(targetEntity = ProductCategory.class)
  @JoinColumn(name = "category_id", referencedColumnName = "id", insertable = false,
      updatable = false)
  private ProductCategory productCategory;

  @OneToOne(targetEntity = ProductInventory.class)
  @JoinColumn(name = "inventory_id", referencedColumnName = "id", insertable = false,
      updatable = false)
  private ProductInventory productInventory;

  @OneToOne(targetEntity = Discount.class)
  @JoinColumn(name = "discount_id", referencedColumnName = "id", insertable = false,
      updatable = false)
  private Discount discount;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescrip() {
    return descrip;
  }

  public void setDescrip(String descrip) {
    this.descrip = descrip;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Date getModified() {
    return modified;
  }

  public void setModified(Date modified) {
    this.modified = modified;
  }

  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public Long getInventoryId() {
    return inventoryId;
  }

  public void setInventoryId(Long inventoryId) {
    this.inventoryId = inventoryId;
  }

  public Long getDiscountId() {
    return discountId;
  }

  public void setDiscountId(Long discountId) {
    this.discountId = discountId;
  }

  public ProductCategory getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(ProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  public ProductInventory getProductInventory() {
    return productInventory;
  }

  public void setProductInventory(ProductInventory productInventory) {
    this.productInventory = productInventory;
  }

  public Discount getDiscount() {
    return discount;
  }

  public void setDiscount(Discount discount) {
    this.discount = discount;
  }

}
