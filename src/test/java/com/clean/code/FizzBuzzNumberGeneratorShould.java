package com.clean.code;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.clean.code.input.InputNumber;

@RunWith(JUnit4.class)
public class FizzBuzzNumberGeneratorShould {
	
	private FizzBuzzNumberGenerator fizzBuzzNumberGenerator = new FizzBuzzNumberGenerator();
	
	@Test
	public void returnFizzWhenInputNumberIs3(){
		assertEquals("Fizz", fizzBuzzNumberGenerator.generateText(new InputNumber(3)));
	}
	
	@Test
	public void returnBuzzWhenInputNumberIs5(){
		assertEquals("Buzz", fizzBuzzNumberGenerator.generateText(new InputNumber(5)));
	}
	
	@Test
	public void returnFizzWhenInputNumberIs6(){
		assertEquals("Fizz", fizzBuzzNumberGenerator.generateText(new InputNumber(6)));
	}
	
	@Test
	public void return2WhenInputNumberIs2(){
		assertEquals("2", fizzBuzzNumberGenerator.generateText(new InputNumber(2)));
	}
	
	@Test
	public void returnBuzzWhenInputNumberIs10(){
		assertEquals("Buzz", fizzBuzzNumberGenerator.generateText(new InputNumber(10)));
	}

}
