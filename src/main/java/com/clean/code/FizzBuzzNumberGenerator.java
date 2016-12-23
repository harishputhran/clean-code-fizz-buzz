package com.clean.code;

import java.util.HashMap;
import java.util.Map;

import com.clean.code.input.InputNumber;

public class FizzBuzzNumberGenerator {
	
	private Map<Integer, String> textMap;
	
	public FizzBuzzNumberGenerator(){
		textMap = new HashMap<>();
		textMap.put(3,  "Fizz");
		textMap.put(5,  "Buzz");
		textMap.put(6,  "Fizz");
	}

	public String generateText(InputNumber inputNumber) {
		return textMap.getOrDefault(inputNumber.getValue(), null);
	}
}
