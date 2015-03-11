package com.itsoft.learn.ejb.local;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.itsoft.learn.ejb.domain.Person;

public class PersonEntityTest {
	
	static EntityManager em;
	static EntityTransaction tx;
	static EntityManagerFactory emf;
	Logger log = Logger.getLogger(PersonEntityTest.class);

	@BeforeClass
	public static void init() throws Exception{
		emf = Persistence.createEntityManagerFactory("SgePULocal");
	}
	
	@Before
	public static void setup() throws Exception{
		em = emf.createEntityManager();
	}
	
	@Test
	public void validate_person_insert_into_db() {
		log.info("Init testing");
		assertNotNull(em);
		
		EntityTransaction t = em.getTransaction();
		t.begin();
		
		Person p = new Person("Last Name", "Name", "myname@domain.com", "5684757785");
		log.info("Before persist Person");
		log.info(p.toString());
		
		try {
			em.persist(p);
			
			t.commit();
		} catch (Exception e) {			
			e.printStackTrace();
			t.rollback();
		}
		
		log.info("After persist Person");
		log.info(p.toString());
	}

}
