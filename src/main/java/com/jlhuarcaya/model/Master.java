package com.jlhuarcaya.model;

import java.io.Serializable;

public class Master implements Serializable {

  private static final long serialVersionUID = 1L;

  private SplashProduct servicioExterno;  
  private Product baseDatos;
  
  public SplashProduct getServicioExterno() {
    return servicioExterno;
  }
  
  public void setServicioExterno(SplashProduct servicioExterno) {
    this.servicioExterno = servicioExterno;
  }
  
  public Product getBaseDatos() {
    return baseDatos;
  }
  
  public void setBaseDatos(Product baseDatos) {
    this.baseDatos = baseDatos;
  }

}
