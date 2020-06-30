package com.spring.di.di_demo;


import org.springframework.stereotype.Service;

@Service("TextMessage")
public class TextMessage implements MessageService {
  
  
  @Override
  public void sendMessage(String message) {
	System.out.println(message + " Text message sending...");
	
  }
  
  @Override
  public void printMessage(String message) {
	System.out.println(message + " Text message printing ");
	
  }
}
