package com.aman.junit.junit.example;
//import org.arpit.java2blog.model.ClassWithPrivateMethods;
//import com.aman.junit.junit.example.ClassWithPrivateMethods;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
 
@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.aman.junit.junit.*")
public class PowerMockPrivateMethodTest
{
	@Test
	public void testClassWithPrivateMethods_printMessage_privateMethod() throws Exception {
 
	    String message = "Hello PowerMockito";
	    String expectation = "expected";
 
	    ClassWithPrivateMethods mock = PowerMockito.spy(new ClassWithPrivateMethods());
	    PowerMockito.doReturn(expectation).when(mock, "printMessage", message);
 
	    String actual = mock.privateCall(message);
	    Assert.assertEquals(expectation, actual);
	}
	
}