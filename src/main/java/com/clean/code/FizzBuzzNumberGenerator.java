package com.clean.code;

import com.clean.code.input.InputNumber;

public class FizzBuzzNumberGenerator {

	public String generateText(InputNumber inputNumber) {
		return inputNumber.isDivisibleBy3And5() ? "FizzBuzz" : getTextForNumberDivisbleBy3Or5(inputNumber);
	}

	protected String getTextForNumberDivisbleBy3Or5(InputNumber inputNumber) {
		return inputNumber.isDivisibleBy3() ? "Fizz" : getTextForNumberDivisibleBy5(inputNumber);
	}

	protected String getTextForNumberDivisibleBy5(InputNumber inputNumber) {
		return inputNumber.isDivisibleBy5() ? "Buzz" : inputNumber.getValueAsString();
	}
}
