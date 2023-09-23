package com.jsp.ManyToOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalDriver
{
  public static void main(String[] args) 
  {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("ganesh");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Hospital h=new Hospital();
	
	Patientce p1=new Patientce();
	p1.setPid(101);
	p1.setPname("Teja");
	p1.setGender("Male");
	p1.setHp(h);
	
	Patientce p2=new Patientce();
	p2.setPid(102);
	p2.setPname("Gani");
	p2.setGender("Male");
	p2.setHp(h);
	
	Patientce p3=new Patientce();
	p3.setPid(103);
	p3.setPname("Ramesh");
	p3.setGender("Male");
	p3.setHp(h);
	
	Patientce p4=new Patientce();
	p4.setPid(104);
	p4.setPname("Vinod");
	p4.setGender("Male");
	p4.setHp(h);
	
	List<Patientce> pl=new ArrayList<Patientce>();
	pl.add(p1);
	pl.add(p2);
	pl.add(p3);
	pl.add(p4);
	
	h.setHid(201);
	h.setHname("GOVT Hospital");
	h.setAdd("Anantapur");
	h.setPl(pl);
	
	et.begin();
	em.persist(h);
	em.persist(p1);
	em.persist(p2);
	em.persist(p3);
	em.persist(p4);
	et.commit();
	
	
	
  }
}
