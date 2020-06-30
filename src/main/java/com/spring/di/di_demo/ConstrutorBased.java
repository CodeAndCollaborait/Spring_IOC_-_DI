package com.spring.di.di_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstrutorBased {
  
  
  
  private MessageService messageService;
  
 @Autowired
  public ConstrutorBased(@Qualifier("TextMessage") MessageService messageService){
    this.messageService = messageService;
  }
  
  public void processMessage(String message){
    messageService.sendMessage(message);
    messageService.printMessage(message);
  }
  
}
