package com.aman.junit.junit.example;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.doReturn;
import static org.powermock.api.mockito.PowerMockito.spy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.aman.junit.junit.example.resoucres.PersonService;

@RunWith(PowerMockRunner.class)
@PrepareForTest(PersonService.class)
//@PrepareForTest(fullyQualifiedNames = "com.aman.junit.junit.example.resoucres.*")
public class PowerMockPrivateMethodTests {
	
//	@InjectMocks
//	PersonService personService;
	
//	PersonService mock;
	
//	@Before
//	public void setUp() {
////		MockitoAnnotations.initMocks(this);
////		Person person = new Person(2, "rahul", Constant.lastName, 27);
////		personService.getAllPersons().add(person);
//		
////		 mock = spy(personService);
//	}
	
	
	@Test
	public void multiplyTest() throws Exception {
		int a = 5;
		int b=2;
		int c = 50;
		
		PersonService spy = spy(new PersonService());

		doReturn(c).when(spy, "doMultiply",a,b); //calling doMultiply method with two input arguments
		int value = spy.multiply(a, b);
		assertEquals(c, value);
	}

	@Test
	public void doCalTest() throws Exception {
		int a = 5;
		int b=2;
		int c = 50;
		
		PersonService spy = spy(new PersonService());
		when(spy.doCal(a, b)).thenReturn(c);
		
//		doReturn(c).when(spy, "doMultiply",a,b); //calling doMultiply method with two input arguments
		int value = spy.doCal(a, b);
		assertEquals(c, value);
	}

}
