package com.jlhuarcaya.model;

import java.io.Serializable;

public class ProductMasterDetail implements Serializable {

  private static final long serialVersionUID = 1L;
  
  private Master master;  
  private Product detail;
  
  public Master getMaster() {
    return master;
  }
  
  public void setMaster(Master master) {
    this.master = master;
  }
  
  public Product getDetail() {
    return detail;
  }
  
  public void setDetail(Product detail) {
    this.detail = detail;
  }
  
}
