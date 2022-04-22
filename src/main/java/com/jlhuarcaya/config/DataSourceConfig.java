package com.jlhuarcaya.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

@Configuration
public class DataSourceConfig {
  
  @Autowired
  private ApplicationContext ctx;
  
  @Profile({"test", "default", "localdev"})
  @Bean(name = "dataSource")
  public DataSource localSource() {

    Properties properties = buildProperties("application.properties");

    return buildDataSource(getDatabaseURL(properties),
        properties.getProperty("spring.datasource.username"),
        properties.getProperty("spring.datasource.password"));
  }

  @Profile({"prod", "contingency"})
  @Bean(name = "dataSource")
  public DataSource prodSource() {

    Properties properties = buildProperties("application.prod.properties");

    return buildDataSource(getDatabaseURL(properties),
        properties.getProperty("spring.datasource.username"),
        properties.getProperty("spring.datasource.password"));
  }

  private DataSource buildDataSource(String URL, String username, String password) {

    MysqlConnectionPoolDataSource ds = new MysqlConnectionPoolDataSource();
    ds.setUrl(URL);
    ds.setUser(username);
    ds.setPassword(password);

    return ds;

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

  private String getDatabaseURL(Properties properties) {
    String databaseURL = System.getProperty("JDBC_CONNECTION_STRING");
    if (databaseURL == null) {
      databaseURL = properties.getProperty("spring.datasource.url");
    }

    return databaseURL;
  }


}
