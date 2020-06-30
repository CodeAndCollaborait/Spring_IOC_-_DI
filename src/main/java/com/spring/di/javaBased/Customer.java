package com.spring.di.javaBased;

public class Customer {
  
  private String name;
  private int id;
  private boolean isActive;
  
  public String getName() {
	return name;
  }
  
  public void setName(String name) {
	this.name = name;
  }
  
  public int getId() {
	return id;
  }
  
  public void setId(int id) {
	this.id = id;
  }
  
  public boolean isActive() {
	return isActive;
  }
  
  public void setActive(boolean active) {
	isActive = active;
  }
  
  @Override
  public String toString() {
	return "Customer{" +
			"name='" + name + '\'' +
			", id=" + id +
			", isActive=" + isActive +
			'}';
  }
}
