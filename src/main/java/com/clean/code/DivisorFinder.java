package com.clean.code;

import com.clean.code.input.InputNumber;

public class DivisorFinder {
	
	public int findDivisibility(InputNumber inputNumber){
		
		if(inputNumber.isDivisibleBy15()){
			return 15;
		}
		return isNumberDivisbleBy3Or5(inputNumber);		
		
	}

	private int isNumberDivisbleBy3Or5(InputNumber inputNumber) {
		int number = inputNumber.getValue();
		if(inputNumber.isDivisibleBy3()){
			number = 3;
		}
		if(inputNumber.isDivisibleBy5()){
			number = 5;
		}
		return number;
	}

}
