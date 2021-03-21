package com.callor.controller;

public class Cont_09A {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			boolean bYes = i % 2 == 0;
			if(bYes) {
				System.out.println("짝수");
			} else {
				System.out.println("짝수가 아님");
			}
		}
		
	}
}
