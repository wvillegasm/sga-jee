package com.itsoft.learn.ejb.service;

import static org.junit.Assert.*;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Before;
import org.junit.Test;

import com.itsoft.learn.ejb.domain.Person;
import com.itsoft.learn.ejb.service.impl.PersonImpl;

public class PersonaServiceRemoteTest {

	private static Context context;
	private static PersonServiceRemote person;
	
	@Before
	public void init() throws NamingException{
		context = new InitialContext();
		person = (PersonImpl)context.lookup("java:global/sga-jee/PersonImpl!com.itsoft.learn.ejb.service.impl.PersonServiceRemote");
	}
	
	@Test
	public void test() {
		List<Person> personResult = person.getPersonsList();
		assertTrue(personResult.size() == 4);
	}

}
