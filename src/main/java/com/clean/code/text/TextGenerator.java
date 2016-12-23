package com.clean.code.text;

import java.util.HashMap;
import java.util.Map;

import com.clean.code.input.InputNumber;

public class TextGenerator {
	
	private Map<Integer, String> textMap;
	
	public TextGenerator(){
		textMap = new HashMap<>();
		textMap.put(3,  "Fizz");
		textMap.put(5,  "Buzz");
		textMap.put(15,  "FizzBuzz");
	}
	
	public String generateText(InputNumber number){
		return textMap.getOrDefault(number.getValue(), number.getValueAsString());
	}

}
