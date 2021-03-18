package com.collar.values.var;

public class Varriable_06 {
	
	public static void main(String[] args) {
		
		// 정수형 변수선언과 clear
		int num1 = 0;
		Integer num2 = 0;
		
		// num1 = 30.0; (불가)
		//int, Integer로 선언된 변수는 정수값만 저장할 수 있다
		// 최대 (-2)^31 ~ 2^31 -1까지 범위만 저장할 수 있다
		num1 = 30;
		num2 = 30;
		
		// (-2)^63 ~ 2^63 -1까지 범위만 저장할 수 있다
		long numLong1 = 30L;
		Long numLong2 = 30L;
		
		float num3 = 30.0F;
		Float num4 = 30.0F;
		
		double num5 = 30.0;
		Double num6 = 30.0;
		
		
	}

}
