package com.callor.review;

public class Controller_01 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 0; i < 100; i ++) {
			int num = i + 1;
			if(num % 3 == 0) {
				sum += num;
				System.out.println(sum);
			} else if(num % 4 == 0) {
				sum += num;
				System.out.println(sum);
			} else if(num % 3 == 0 && num % 5 == 0) {
				sum += num;
				System.out.println(sum);
			}
		}
	}
}
