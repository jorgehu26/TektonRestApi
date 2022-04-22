package com.jlhuarcaya.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "discount")
public class Discount {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "descrip")
  private String descrip;

  @Column(name = "discount_percent")
  private BigDecimal discountPercent;

  @Column(name = "active")
  private Boolean active;

  @Column(name = "created")
  private Date created;

  @Column(name = "modified")
  private Date modified;

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

  public BigDecimal getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscount_percent(BigDecimal discountPercent) {
    this.discountPercent = discountPercent;
  }

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
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

}
