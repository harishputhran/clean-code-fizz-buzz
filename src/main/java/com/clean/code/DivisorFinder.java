package com.clean.code;

import com.clean.code.input.InputNumber;

public class DivisorFinder {
	
	public InputNumber findDivisibility(InputNumber inputNumber){
		
		if(inputNumber.isDivisibleBy15()){
			return new InputNumber(15);
		}
		return isNumberDivisbleBy3Or5(inputNumber);		
	}

	private InputNumber isNumberDivisbleBy3Or5(InputNumber inputNumber) {		
		if(inputNumber.isDivisibleBy3()){
			new InputNumber(3);
		}
		if(inputNumber.isDivisibleBy5()){
			new InputNumber(5);
		}
		return inputNumber;
	}

}
