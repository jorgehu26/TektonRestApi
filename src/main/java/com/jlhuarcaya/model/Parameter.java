package com.jlhuarcaya.model;

import java.io.Serializable;

public class Parameter implements Serializable {

  private static final long serialVersionUID = 1L;
  
  private String url;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
  
}
