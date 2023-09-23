package com.jsp.onetoMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Bus
{
	@Id
private int bid;
private String name;
private String color;

@OneToMany
private List<Passanger> pl;

public int getBid() {
	return bid;
}

public void setBid(int bid) {
	this.bid = bid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public List<Passanger> getPl() {
	return pl;
}

public void setPl(List<Passanger> pl) {
	this.pl = pl;
}



}
