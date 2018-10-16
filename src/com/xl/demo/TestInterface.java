package com.xl.demo;

@FunctionalInterface
public interface TestInterface {
	Integer add(Integer a ,Integer b);
	
	default Integer  del(Integer a,Integer b){
		return a - b;
	};
}
