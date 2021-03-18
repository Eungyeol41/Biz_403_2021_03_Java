package com.callor.var;

public class Varriable_08 {
	
	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 1;
		
		// 1 ~ 10까지 덧셈을 수행
		
		intSum += intNum++; // 0 + 1
		intSum += intNum++; // 1 + 2
		intSum += intNum++; // 3 + 3
		intSum += intNum++;	// 6 + 4
		intSum += intNum++; // ...
		intSum += intNum++; 
		intSum += intNum++;
		intSum += intNum++; // ...
		intSum += intNum++;
		intSum += intNum++; 
		System.out.println(intSum);
		
	}

}
