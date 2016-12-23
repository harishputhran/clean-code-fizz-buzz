package com.clean.code;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzzNumberGenerator {
	
	private Map<Integer, String> textMap;
	
	public FizzBuzzNumberGenerator(){
		textMap = new HashMap<>();
		textMap.put(3,  "Fizz");
		textMap.put(5,  "Buzz");
	}

	public String generateText(int inputNumber) {
		return textMap.getOrDefault(inputNumber, null);
	}
}
