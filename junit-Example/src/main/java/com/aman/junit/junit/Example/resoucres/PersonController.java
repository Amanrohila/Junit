package com.aman.junit.junit.example.resoucres;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/persons/")
public class PersonController {

	List<Person> persons = new ArrayList<>();

	@Autowired
	PersonService personService;

	@GetMapping
	public List<Person> getAllPersons() {
		persons.clear();
		personService.setPersons(persons);
		return personService.getAllPersons();
	}

	@GetMapping("/{id}")
	public Person getPerson(@PathVariable(required = true) int id) throws Exception {
		return personService.getPerson(id);

	}

	@PostMapping
	public Person addPerson(@RequestBody Person person) {
		return personService.addPerson(person);
	}

}
