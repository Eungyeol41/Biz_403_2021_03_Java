package com.callor.var;

public class Varriable_01 {
	
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		int minus = 0;
		int times = 0;
		int div = 0;
		
		num1 = 33;
		num2 = 55;
		sum = num1 + num2;
		minus = num2 - num1;
		times = num1 * num2;
		div = num2 / num1;
		
		System.out.printf("%d + %d = %d\n",num1, num2, sum );
		System.out.printf("%d - %d = %d\n", num2, num1, minus);
		System.out.printf("%d x %d = %d\n", num1, num2, times);
		System.out.printf("%d / %d = %d\n", num2, num1, div);
		
	}

}
