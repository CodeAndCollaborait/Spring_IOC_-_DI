package com.spring.di.javaBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  
  @Bean
  public HelloWorld getHelloWorld() {
	HelloWorld helloWorld = new HelloWorld();
	helloWorld.setMessage("This is via App config Class");
	return helloWorld;
  }
  
  @Bean
  public Customer getCutomerInfo(){
    Customer customer = new Customer();
    return customer;
  }
  
}
