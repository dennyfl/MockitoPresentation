package test.de.dhbw.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

import main.de.dhbw.tutorial.CalculatorException;

public class TutorialCalculatorTest {
	
	/*
	I. First you create a mock object of the class you want to mock
		- since we want to test the Calculator class, we mock away it's dependency CalculatorService
		- try something like Class instanceName = Mockito.mock(Class.class);
		
	II. Second we create an instance of the class we want to test
	
	III. All test are still false, so the next step is to implement the actual tests and make them succeed
	*/
	
	
	@Test
	public void addTest(){
		// mock the behavior you expect from the CalculatorService and test the actual method
		// try when(mock.method(...)).thenXXX();
		assertTrue(false);
	}
	
	@Test
	public void subtractTest(){
		// mock the behavior you expect from the CalculatorService and test the actual method
		// try when(mock.method(...)).thenXXX();
		assertTrue(false);
	}
	
	@Test
	public void multiplyTest(){
		// mock the behavior you expect from the CalculatorService and test the actual method
		// try when(mock.method(...)).thenXXX();
		assertTrue(false);
	}
	
	@Test
	public void devideTest(){
		// mock the behavior you expect from the CalculatorService and test the actual method
		// try when(mock.method(...)).thenXXX();
		assertTrue(false);
	}
	
	@Test(expected = CalculatorException.class)
	public void devideByZeroTest(){
		// this one is a bit different, since we want to provoke an exception
		// but mockito not only lets you return something after a method call, you can also throw excptions
		// try when(mock.method(...)).thenXXX(); 
		assertTrue(false);
	}
}
