package com.spring.di.di_demo;

import org.springframework.stereotype.Service;

@Service("IMMessage")
public class IM_Message implements MessageService {
  @Override
  public void sendMessage(String message) {
    System.out.println(message + "IM message sending..");
  }
  
  @Override
  public void printMessage(String message) {
    System.out.println(message + "IM message sending..");
  }
}
