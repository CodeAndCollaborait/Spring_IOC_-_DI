package com.spring.di;


import com.spring.di.javaBased.AppConfig;
import com.spring.di.javaBased.Customer;
import com.spring.di.javaBased.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringDepedencyInjectionsApplication {
  
  
  public static void main(String[] args) {
	SpringApplication.run(SpringDepedencyInjectionsApplication.class, args);
 
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	HelloWorld objOne = context.getBean(HelloWorld.class);
	objOne.setMessage("This is Message One via Bean");
	System.out.println(objOne.getMessage());
	System.out.println(objOne.hashCode());
	
	HelloWorld objTwo = context.getBean(HelloWorld.class);
	objTwo.setMessage("This is Message Two via Bean");
	System.out.println(objTwo.getMessage());
	System.out.println(objTwo.hashCode());
 
	Customer customerOne = context.getBean(Customer.class);
	
	customerOne.setId(101);
	customerOne.setName("Mark Miller");
	customerOne.setActive(true);
 
	System.out.println(customerOne.getId());
	System.out.println(customerOne.getName());
	System.out.println(customerOne.isActive());
	
	
	
	// How to do set two messages using helloworld class.
//	HelloWorld helloWorld = new HelloWorld();
//	helloWorld.setMessage("Message One");
//	System.out.println(helloWorld.getMessage());
//	System.out.println(helloWorld.hashCode());
//
//
//	HelloWorld helloWorldTwo = new HelloWorld();
//	helloWorldTwo.setMessage("Message Two");
//	System.out.println(helloWorldTwo.getMessage());
//	System.out.println(helloWorldTwo.hashCode());
	
  }
  
  
  
  
  
}
