package com.callor.var;

public class Varriable_07 {
	
	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;
		
		// intNum = intNum + 1
		// intSum = intSum + intNum
		intSum += ++intNum; // 0 + 1 = 1
		intSum += ++intNum; // 1 + 2 = 3
		intSum += ++intNum; // 3 + 3 = 6
		intSum += ++intNum; // 6 + 4  = 10
		intSum += ++intNum; // 10 + 5 = 15
		intSum += ++intNum; // 15 + 6 = 21
		intSum += ++intNum; // 21 + 7 = 28
		intSum += ++intNum; // 28 + 8 = 36
		intSum += ++intNum; // 36 + 9 = 45
		intSum += ++intNum; // 45 + 10 ==55
		System.out.println(intSum);
		
		
		
	}

}
