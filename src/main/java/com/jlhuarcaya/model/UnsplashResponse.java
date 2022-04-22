package com.jlhuarcaya.model;

import java.io.Serializable;
import java.util.List;

public class UnsplashResponse implements Serializable {

  private static final long serialVersionUID = 1L;
  private Integer total;
  private Integer total_pages;
  private List<SplashProduct> results;

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public Integer getTotal_pages() {
    return total_pages;
  }

  public void setTotal_pages(Integer total_pages) {
    this.total_pages = total_pages;
  }

  public List<SplashProduct> getResults() {
    return results;
  }

  public void setResults(List<SplashProduct> results) {
    this.results = results;
  }

}
