package test.de.dhbw.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

import main.de.dhbw.tutorial.CalculatorException;

public class TutorialCalculatorTest {
	
	@Test
	public void addTest(){
		assertTrue(false);
	}
	
	@Test
	public void subtractTest(){
		assertTrue(false);
	}
	
	@Test
	public void multiplyTest(){
		assertTrue(false);
	}
	
	@Test
	public void devideTest(){
		assertTrue(false);
	}
	
	@Test(expected = CalculatorException.class)
	public void devideByZeroTest(){
		assertTrue(false);
	}
}
