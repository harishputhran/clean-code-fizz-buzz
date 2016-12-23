package com.clean.code;

import com.clean.code.input.InputNumber;
import com.clean.code.text.TextGenerator;

public class FizzBuzzNumberGenerator {
	
	private DivisorFinder divisorFinder;
	
	private TextGenerator textGenerator;
	
	public FizzBuzzNumberGenerator(){
		divisorFinder = new DivisorFinder();
		textGenerator = new TextGenerator();
	}

	public String generateText(InputNumber inputNumber) {
		return getText(inputNumber);
	}

	protected String getText(InputNumber inputNumber) {		
		return textGenerator.generateText(divisorFinder.findDivisibility(inputNumber));
	}
}
