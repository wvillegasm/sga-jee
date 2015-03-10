package com.itsoft.learn.ejb.service;

import static org.junit.Assert.*;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.itsoft.learn.ejb.domain.Person;
import com.itsoft.learn.ejb.service.impl.PersonImpl;

public class PersonaServiceTest {

	private static Context context;
	private static PersonService person;
	
	@Before
	public void init() throws NamingException{
		context = new InitialContext();
		person = (PersonImpl)context.lookup("java:global/sga-jee/PersonImpl!com.itsoft.learn.ejb.service.impl.PersonService");
	}
	
	@Test
	public void test() {
		List<Person> personResult = person.getPersonsList();
		assertTrue(personResult.size() == 4);
	}

}
