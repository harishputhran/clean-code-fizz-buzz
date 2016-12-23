package com.clean.code;

import java.util.HashMap;
import java.util.Map;

import com.clean.code.input.InputNumber;

public class FizzBuzzNumberGenerator {
	
	private Map<Integer, String> textMap;
	
	private DivisorFinder divisorFinder;
	
	public FizzBuzzNumberGenerator(){
		textMap = new HashMap<>();
		textMap.put(3,  "Fizz");
		textMap.put(5,  "Buzz");
		textMap.put(15,  "FizzBuzz");
		divisorFinder = new DivisorFinder();
	}

	public String generateText(InputNumber inputNumber) {
		return getText(inputNumber);
	}

	protected String getText(InputNumber inputNumber) {		
		return textMap.getOrDefault(divisorFinder.findDivisibility(inputNumber), inputNumber.getValueAsString());
	}
}
