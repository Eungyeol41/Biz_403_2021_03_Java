package com.callor.review;

import java.util.Random;

public class Controller_15 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] kor = new int[10];
		int total = 0;
		float avg = 0;
		
		for(int i = 0; i < 10; i++) {
			kor[i] = rnd.nextInt(100) +1;
			total += kor[i];
			avg = (float)total / 10;
		}
		System.out.println("===============================");
		for(int i = 0; i < 10; i++) {
			System.out.printf("학생 %d : %d\n", i + 1, kor[i]);
		}
		System.out.println("-------------------------------");
		System.out.printf("총점 : %d\t,평균 : %3.2f", total, avg);
	}
}
