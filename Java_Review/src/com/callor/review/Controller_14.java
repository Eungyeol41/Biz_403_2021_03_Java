package com.callor.review;

import java.util.Random;

public class Controller_14 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int kor;
		int eng;
		int math;
		int total;
		float avg;
		
		kor = rnd.nextInt(100) +1;
		eng = rnd.nextInt(100) +1;
		math = rnd.nextInt(100) +1;
		
		total = kor;
		total += eng;
		total += math;
		
		avg = (float)total / 3;
		
		System.out.println("==============================");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("------------------------------");
		System.out.printf("총점 : %d\t,평균 : %3.2f\n", total, avg);
		System.out.println("==============================");
		
	}
}
