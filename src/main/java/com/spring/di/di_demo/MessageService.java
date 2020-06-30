package com.spring.di.di_demo;

public interface MessageService {

  // Static , default , abstract method.
  // public and abstract..
   void sendMessage(String message);
   void printMessage(String message);

   static void printHello(){
     System.out.println("this is static hello method from interface");
   }
}
