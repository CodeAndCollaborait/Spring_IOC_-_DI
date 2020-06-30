package com.spring.di.printer;



public class OrderPrinter {
  
//  public static void main(String[] args) {
//	TypeOnePrinter onePrinter = new TypeOnePrinter();
//	System.out.println(onePrinter);
//  }
  

}


class TypeOnePrinter implements PrintColor, Wifi,Scan{
  @Override
  public void printColor() {
	
  }
  
  @Override
  public void scanDocument() {
	
  }
  
  @Override
  public void connectWifi() {
	
  }
// PrintColor, wifi,scan
}

class TypeTwoPrinter implements  PrintColor, Fax{
  @Override
  public void printColor() {
	
  }
  
  @Override
  public void sendingFax() {
	
  }
//2 = PrintColor,
}

class TypeThreePrinter implements  PrintColor,PrintBW , Scan{
  @Override
  public void printColor() {
	
  }
  
  @Override
  public void scanDocument() {
	
  }
  
  @Override
  public void printBlackAndWhight() {
	
  }
  
  //3.= PrintColor, PrintB/w and Scan...
}

interface Fax{
  void sendingFax();
}

interface PrintColor{
  void printColor();
}

interface PrintBW{
  void printBlackAndWhight();
}

interface Scan{
  void scanDocument();
}

interface Wifi{
  void connectWifi();
}