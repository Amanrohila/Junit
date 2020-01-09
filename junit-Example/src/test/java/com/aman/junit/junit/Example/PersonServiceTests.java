package com.aman.junit.junit.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.aman.junit.junit.example.resoucres.Constant;
import com.aman.junit.junit.example.resoucres.Person;
import com.aman.junit.junit.example.resoucres.PersonDao;
import com.aman.junit.junit.example.resoucres.PersonService;

public class PersonServiceTests {

	@InjectMocks
	PersonService personService;
	
	@Mock
	Person person;

	@Mock
	PersonDao dao;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
//		personService = new PersonService();
		person = new Person(2, "rahul", Constant.lastName, 27);
		personService.getAllPersons().add(person);
	}

	@Test
	public void getAllPersonsTest() {
		List<Person> persons = personService.getAllPersons();
		assertNotNull(persons);
	}

	@Test
	public void getPersonTest() throws IOException {
		Person person = personService.getPerson(0);
		assertNotNull(person);
		assertEquals(person, person);
	}

	@Test(expected = IOException.class)
	public void getPersonTestIOException() throws IOException {
		Person person = personService.getPerson(-1);
		assertNotNull(person);
	}

	@Test(expected = IOException.class)
	public void getPersonTestListEmptyIOException() throws IOException {
		personService.getAllPersons().clear();
		Person person = personService.getPerson(1);
		assertNotNull(person);
	}

	@Test
	public void addPersonTest() {
		Person personInstance = personService.addPerson(person);
		assertNotNull(personInstance);
	}

	@Test(expected = IOException.class)
	public void checkExceptionTestException() throws IOException {
		personService.checkException(-1);
	}

	@Test
	public void checkExceptionTest() throws IOException {
		assertEquals(5, personService.checkException(1));
	}

	@Test
	public void calculationTest() {
		int a = 1;
		int b=2;
		int c = 3;
		when(dao.add(a, b)).thenReturn(c);
		int value = personService.calculation(a, b);
		assertEquals(c, value);
	}
	
}
