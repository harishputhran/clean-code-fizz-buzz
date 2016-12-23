package com.clean.code;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FizzBuzzNumberGeneratorShould {
	
	private FizzBuzzNumberGenerator fizzBuzzNumberGenerator = new FizzBuzzNumberGenerator();
	
	@Test
	public void returnFizzWhenInputNumberIs3(){
		assertEquals("Fizz", fizzBuzzNumberGenerator.generateText(3));
	}

}
