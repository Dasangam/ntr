package com.jsp.onetoOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Student 
{
	
	@Id
private int id;
private String name;
private String place;

@OneToOne
private Course c;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}

public Course getC() {
	return c;
}

public void setC(Course c) {
	this.c = c;
}


}
