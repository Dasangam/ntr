package com.jsp.onetoOne;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Entiti 
{
public static void main(String[] args) 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("ganesh");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	
	
	/*        Course c=new Course();
	c.setCid(201);
	c.setCname("golang");
	c.setPrice(16000); 
	
	Student s=new Student();
	s.setId(101);
	s.setName("ganesh");
	s.setPlace("pamidi");
	s.setC(c);
	
	et.begin();
	em.persist(s);
	em.persist(c);
	et.commit();          */
	
	/*         Course c1=new Course();
	c1.setCid(202);
	c1.setCname("java");
	c1.setPrice(20000); 
	
	Student s1=new Student();
	s1.setId(102);
	s1.setName("teja");
	s1.setPlace("ballari");
	s1.setC(c1);
	
	Course c2=new Course();
	c2.setCid(203);
	c2.setCname("c");
	c2.setPrice(5000); 
	
	Student s2=new Student();
	s2.setId(103);
	s2.setName("praveen");
	s2.setPlace("kondur");
	s2.setC(c2);
	
	et.begin();
	em.persist(s1);
	em.persist(c1);
	em.persist(s2);
	em.persist(c2);
	et.commit();          */
	
//	Course c=new Course();
//	c.setCid(204);
//	c.setCname("c++");
//	c.setPrice(10000); 
//	
//	Student s=new Student();
//	s.setId(104);
//	s.setName("jaina");
//	s.setPlace("konda");
//	s.setC(c);         //if in case we did not give this line one to one relation should not work because getC returns null
	
//	et.begin();
//	em.persist(s);
//	em.persist(c);
//	et.commit(); 
	
//	Course c=em.find(Course.class, 202);
//	System.out.println(c.getCid());
//	System.out.println(c.getCname());
//	System.out.println(c.getPrice());
	
	
	
//	Student s=em.find(Student.class, 104);
//	System.out.println(s.getId());
//	System.out.println(s.getName());
//	System.out.println(s.getPlace());
//	System.out.println(s.getC().getCid());
	
	String hql="SELECT c FROM Student c";
	Query q=em.createQuery(hql);
	List<Student> l=q.getResultList();
	for(Student n:l)
	{
		System.out.println(n.getId());
		System.out.println(n.getName());
		System.out.println(n.getPlace());
		System.out.println(n.getC().getCid());
		System.out.println(n.getC().getCname());
		System.out.println(n.getC().getPrice());
		System.out.println("************");
	}
}
}
