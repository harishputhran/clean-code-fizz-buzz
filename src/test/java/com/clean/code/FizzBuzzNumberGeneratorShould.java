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
	public void return_Fizz_When_Input_Number_is_3(){
		assertEquals("Fizz", fizzBuzzNumberGenerator.generateText(new InputNumber(3)));
	}
	
	@Test
	public void return_Buzz_When_Input_Number_is_5(){
		assertEquals("Buzz", fizzBuzzNumberGenerator.generateText(new InputNumber(5)));
	}
	
	@Test
	public void return_Fizz_When_Input_Number_is_6(){
		assertEquals("Fizz", fizzBuzzNumberGenerator.generateText(new InputNumber(6)));
	}
	
	@Test
	public void return_2_When_Input_Number_is_2(){
		assertEquals("2", fizzBuzzNumberGenerator.generateText(new InputNumber(2)));
	}
	
	@Test
	public void return_Buzz_When_Input_Number_is_10(){
		assertEquals("Buzz", fizzBuzzNumberGenerator.generateText(new InputNumber(10)));
	}
	
	@Test
	public void return_FizzBuzz_When_Input_Number_is_15(){
		assertEquals("FizzBuzz", fizzBuzzNumberGenerator.generateText(new InputNumber(15)));
	}
	
	@Test
	public void return_FizzBuzz_When_Input_Number_is_30(){
		assertEquals("FizzBuzz", fizzBuzzNumberGenerator.generateText(new InputNumber(30)));
	}
	
	@Test
	public void return_Fizz_When_Input_Number_is_27(){
		assertEquals("Fizz", fizzBuzzNumberGenerator.generateText(new InputNumber(27)));
	}
	
	@Test
	public void return_Buzz_When_Input_Number_is_25(){
		assertEquals("Buzz", fizzBuzzNumberGenerator.generateText(new InputNumber(25)));
	}
}
