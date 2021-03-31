package com.callor.classes;

public class String_01 {

	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 30;
		boolean bYes = num1 == num2; // true
		
		String str1 = "대한민국";
		String str2 = "우리나라";
		
		bYes = str1 == str2; // false
		
		str2 = "대한민국";
		bYes = str1 == str2; // true
		if(str1 == str2) {
			System.out.println("맞아!!");
		}
		
		str1 = "우리나라";
		str2 = new String("우리나라");
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 값");
		} 
		
		
	}
}
