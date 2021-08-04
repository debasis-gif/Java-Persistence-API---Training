package com.pcsglobal.JPADemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppJPADemo 
{

	public static void main(String[] args) 
	{
		AlienJPA al = new AlienJPA();	
		al.setAid(9);
		al.setAname("Maria");
		al.setTech("IT Services");
		al.setColor("red");
		
		// This "pu" argument is derived from the persistence.xml persistence-unit name
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		// EntityManager is an Interface so it should instantiate an object from another Interface/Class
		EntityManager em =  emf.createEntityManager();	
	
		// find is a JPA method from Interface EntityManager
		// getting a row from Alien having lid = 3
		AlienJPA a = em.find(AlienJPA.class, 3 );  
		System.out.println("View: " +a);

		em.getTransaction().begin();  // Beginning the transaction
		em.persist(al);   // JPA persistence
		em.getTransaction().commit();
		System.out.println("Inserted: "+al);
	}

}
