package com.callor.apps;

public class App_06 {

	public static void main(String[] args) {
		
		// for() 중첩하기
		// 바깥 for(int i)가 한 번 반복할 때마다 안 쪽 for(int j)가 5번 반복하라
		int nCount = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println(++nCount);
			}
		}
		System.out.println("====================");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("===================");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("===================");
		for(int i = 1; i < 6; i++) {
			for(int j = 5; j > 0; j--) {
				if(i < j) {
					System.out.print("  ");
				} else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
		System.out.println("===================");
		for(int i = 0; i < 5; i++) {
			for(int j = i; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
