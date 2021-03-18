package com.callor.var;

public class Varriable_15A {
	
	public static void main(String[] args) {
		
		int intNum = 0;
		int intSum = 0;
		
		intNum += 2; // 2
		intSum += intNum; // 2
		
		intNum += 2; // 4
		intSum += intNum; // 2 + 4
		
		intNum += 2; // 6
		intSum += intNum; // 2 + 4 + 6
		
		intNum += 2; //8
		intSum += intNum; // 2 + 4 + 6 +8
		
		intNum += 2; //10
		intSum += intNum; // 2 + 4 + 6 +8 + 10
		
		System.out.println(intSum);
	}

}

