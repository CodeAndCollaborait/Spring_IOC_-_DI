package com.spring.di;


import com.spring.di.di_demo.ConstrutorBased;
import com.spring.di.di_demo.Di_Config;
import com.spring.di.javaBased.AppConfig;
import com.spring.di.javaBased.Customer;
import com.spring.di.javaBased.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringDepedencyInjectionsApplication {
  
  
  public static void main(String[] args) {
	SpringApplication.run(SpringDepedencyInjectionsApplication.class, args);
	
//	iocMethods();
	DI_methods();
	
  }
  
  public static void DI_methods(){
  
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	ConstrutorBased construtorBased = context.getBean(ConstrutorBased.class);
	construtorBased.processMessage("This is message for spring DI");
  
  }
  
  
  
  
  public static void iocMethods(){
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Di_Config.class);
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
  }
  
  
}
