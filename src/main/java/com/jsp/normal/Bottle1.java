package com.jsp.normal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bottle1 
{
	
	@Id
private int id;
private String color;
private int price;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}


}
