package com.itsoft.learn.ejb.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;

import org.junit.Before;
import org.junit.Test;

import com.itsoft.learn.ejb.domain.Person;
import com.itsoft.learn.ejb.service.impl.PersonImpl;

public class PersonaServiceLTest {

	private static Context context;
	private static PersonServiceRemote person;
	
	@Before
	public void init() throws NamingException{
		EJBContainer container = EJBContainer.createEJBContainer();
		context = container.getContext();
		person = (PersonImpl)context.lookup("java:global/classes/PersonImpl!com.itsoft.learn.ejb.service.impl.PersonService");
	}
	
	@Test
	public void test() {
		
		assertNotNull(person);
		
		List<Person> personResult = person.getPersonsList();
		
		assertTrue(personResult.size() == 4);
	}

}
