package com.jsp.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Patientce
{
 @Id
 private int pid;
 private String pname;
 private String gender;
 
 @ManyToOne
 private Hospital hp;

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public Hospital getHp() {
	return hp;
}

public void setHp(Hospital hp) {
	this.hp = hp;
}
 
 
 
 
}
