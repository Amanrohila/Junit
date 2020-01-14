package com.aman.junit.junit.example.resoucres;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PersonDao {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public void clearList(List<Person> persons) {
		deleteAllElement(persons);
	}

	private void deleteAllElement(List<Person> persons) {
		if (!persons.isEmpty()) {
			persons.clear();
		}
		
	}

}
