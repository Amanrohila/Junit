package com.aman.junit.junit.example.resoucres;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aman.junit.junit.example.utills.Util;

@Service
public class PersonService {

	private List<Person> persons = new ArrayList<>();

	@Autowired
	PersonDao dao;

//	public PersonService() {
//		persons.add(new Person(1, "aman", Constant.lastName, 28));
//	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public List<Person> getAllPersons() {
		if (persons.isEmpty()) {
			Person person = new Person(1, "aman", Constant.lastName, 28);
			persons.add(person);
		}
		return persons;
	}

	public Person getPerson(int id) throws IOException {
		if (id < 0 || persons.isEmpty()) {
			throw new IOException("Invalid Person id : " + id);
		}
		return persons.get(id);
	}

	public int checkException(int id) throws IOException {
		if (id < 0) {
			throw new IOException("Invalid Person id : " + id);
		}
		return 5;
	}

	public Person addPerson(Person person) {
		person.setId(persons.size() + 1);
		persons.add(person);
		return person;
	}

	public void removePersons() {
		dao.clearList(persons);
	}


	

	public int calculation(int a, int b) {
		int c = dao.add(a, b);
		return c;

	}

	public int doMinus(int a, int b) {
		return Util.minus(a, b);
	}

	public int multiply(int a, int b) {

		return doMultiply(a, b);
	}

	private int doMultiply(int a, int b) {
		int c = 5;
		return a * b * c;
	}

	public final int doCal(int a, int b) {
		int c = 5;
		return a * b * c;
	}

}
