package com.clean.code;

import com.clean.code.input.InputNumber;

public class FizzBuzzNumberGenerator {

	public String generateText(InputNumber inputNumber) {
		return inputNumber.isDivisibleBy3And5() ? FizzBuzzEnum.FIZZBUZZ.getValue() 
				                                : getTextForNumberDivisbleBy3Or5(inputNumber);
	}

	protected String getTextForNumberDivisbleBy3Or5(InputNumber inputNumber) {
		return inputNumber.isDivisibleBy3() ? FizzBuzzEnum.FIZZ.getValue() 
				                            : getTextForNumberDivisibleBy5(inputNumber);
	}

	protected String getTextForNumberDivisibleBy5(InputNumber inputNumber) {
		return inputNumber.isDivisibleBy5() ? FizzBuzzEnum.BUZZ.getValue() 
				                            : inputNumber.getValueAsString();
	}
}
