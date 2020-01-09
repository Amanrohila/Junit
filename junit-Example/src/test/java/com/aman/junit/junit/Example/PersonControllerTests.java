package com.aman.junit.junit.Example;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.aman.junit.junit.Example.resoucres.PersonController;

//@SpringBootTest
public class PersonControllerTests {
	
	
	PersonController personController = new PersonController(); 
	
//	@Before
//	public void init() {
//		personController = new PersonController(); 
//	}
	
	@Test
	public void helloTest() {
		int value = personController.hello();
		assertEquals(0, value);
	}

}
