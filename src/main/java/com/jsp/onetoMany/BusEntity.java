package com.jsp.onetoMany;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BusEntity 
{
public static void main(String[] args) 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("ganesh");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	Passanger p=new Passanger();
	p.setGender("male");
	p.setName("ganesh");
	p.setPid(101);
	
	Passanger p2=new Passanger();
	p2.setGender("female");
	p2.setName("bhavana");
	p2.setPid(102);
	
	Passanger p3=new Passanger();
	p3.setGender("male");
	p3.setName("teja");
	p3.setPid(103);
	
	List<Passanger> list=new ArrayList();	
	list.add(p);
	list.add(p2);
	list.add(p3);
	
	Bus b=new Bus();
	b.setBid(201);
	b.setColor("red");
	b.setName("anantapur");
	b.setPl(list);
	
	
//	et.begin();
//	em.persist(b);
//	em.persist(p);
//	em.persist(p2);
//	em.persist(p3);
//	et.commit();
	
	Bus b1=em.find(Bus.class, 201);
	System.out.println(b1.getBid());
	System.out.println(b1.getColor());
	System.out.println(b1.getName());
	System.out.println("*****");
	
	List<Passanger>p1=b1.getPl();
	for(Passanger n:p1)
	{
		System.out.println(n.getGender());
		System.out.println(n.getName());
		System.out.println(n.getPid());
		System.out.println("********");
	}
	
}
}
