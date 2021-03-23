package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intMembers = 0;
		intMembers = rnd.nextInt(25) + 26;
		int intAvg = 0;
		intAvg = intMembers / 6;
		
		System.out.printf("인원 수 : %d\n", intMembers);
		
		/*
		 * if(intMembers % 6 == 0) {
		 * 		System.out.printf("주문할 피자 판 수 : %d", intMembers / 6);
		 * } else {
		 * 		System.out.printf("주문할 피자 판 수 : %d", intMembers / 6 + 1);
		 * } 
		 */
		
		if(intMembers % 6 == 0) {
			System.out.printf("주문할 피자 판수 : %d ", intAvg);
		} else {
			System.out.printf("주문할 피자 판수 : %d ", intAvg + 1);
		}
		
	}
}
