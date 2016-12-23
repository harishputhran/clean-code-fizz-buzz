package com.clean.code;

public enum FizzBuzzEnum {
	
	FIZZ("Fizz"), BUZZ("Buzz"), FIZZBUZZ("FizzBuzz");
	
	private String value;
	
	private FizzBuzzEnum(String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
}
