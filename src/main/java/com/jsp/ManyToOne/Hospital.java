package com.jsp.ManyToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital 
{
 @Id
 private int hid;
 private String hname;
 private String add;
 
 @OneToMany
 private List<Patientce> pl;

public int getHid() {
	return hid;
}

public void setHid(int hid) {
	this.hid = hid;
}

public String getHname() {
	return hname;
}

public void setHname(String hname) {
	this.hname = hname;
}

public String getAdd() {
	return add;
}

public void setAdd(String add) {
	this.add = add;
}

public List<Patientce> getPl() {
	return pl;
}

public void setPl(List<Patientce> pl) {
	this.pl = pl;
}
 
 
}
