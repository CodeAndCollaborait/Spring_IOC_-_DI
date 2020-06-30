package com.spring.di.di_demo;

import org.springframework.stereotype.Service;

@Service("EmailService")
public class EmailService implements MessageService {
  @Override
  public void sendMessage(String message) {
	System.out.println(message + "Email Message sending...");
  }
  
  @Override
  public void printMessage(String message) {
	System.out.println(message + "Email message printing..");
  }
}
