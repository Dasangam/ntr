package com.jsp.normal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class BottleDriver 
{
public static void main(String[] args) 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("ganesh");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Bottle1 b=new Bottle1();       //to add one row
	b.setColor("yellow");
	b.setId(6);
	b.setPrice(20);
	
	Bottle1 b1=new Bottle1();      //to add multiple rows
	b1.setColor("pink");
	b1.setId(5);
	b1.setPrice(20);
	
	Bottle1 b2=new Bottle1();        //to add multiple rows
	b2.setColor("green");
	b2.setId(7);
	b2.setPrice(20);
	
	
//	et.begin();                    //to add one row in database
//	em.persist(b2);
//	et.commit();
	
//	et.begin();                    //to add multiple rows in database
//	em.persist(b);
//	em.persist(b1);
//	em.persist(b2);
//	et.commit();
	
//	Bottle1 b10=em.find(Bottle1.class, 6);     //to get one row
//	System.out.println(b10.getColor());
//	System.out.println(b10.getId());
//	System.out.println(b10.getPrice());
	
	
	String hql="SELECT p FROM Bottle p";
	Query q=em.createQuery(hql);
	List<Bottle1> l=q.getResultList();
	
	for(Bottle1 n:l)
	{
		System.out.println(n.getColor());
		System.out.println(n.getId());
		System.out.println(n.getPrice());
		System.out.println("****************");
	}
	
	
}
}
