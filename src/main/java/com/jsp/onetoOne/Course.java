package com.jsp.onetoOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course 
{
	@Id
private int cid;
private String cname;
private int price;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}


}
