package com.clean.code;

public class FizzBuzzNumberGenerator {

	public String generateText(int inputNumber) {
		
		if(inputNumber == 3){
			return "Fizz";
		}
		if(inputNumber == 5){
			return "Buzz";
		}
		return null;
	}

}
