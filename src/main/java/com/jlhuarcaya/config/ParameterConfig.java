package com.jlhuarcaya.config;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;

import com.jlhuarcaya.model.Parameter;

@Configuration
public class ParameterConfig {

  @Autowired
  private ApplicationContext ctx;
  
  @Profile({"test", "default", "localdev"})
  @Bean(name = "parameter")
  public Parameter localParameter() {
    Parameter parameter = new Parameter();
    Properties properties = buildProperties("application.properties");
    parameter.setUrl(properties.getProperty("api.rest.extern"));
    return parameter;
  }

  @Profile({"prod", "contingency"})
  @Bean(name = "parameter")
  public Parameter prodParameter() {
    Parameter parameter = new Parameter();
    Properties properties = buildProperties("application.prod.properties");
    parameter.setUrl(properties.getProperty("api.rest.extern"));
    return parameter;
  }

  private Properties buildProperties(String propertiesFileName) {
    Properties prop = new Properties();
    Resource propertiesFile = ctx.getResource("classpath:" + propertiesFileName);
    try {
      prop.load(propertiesFile.getInputStream());
    } catch (IOException e) {
      e.printStackTrace();
    }

    return prop;
  }

}
