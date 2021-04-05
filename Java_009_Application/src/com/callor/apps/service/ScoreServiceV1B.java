package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1B {

	Scanner scan;
	
	int[] kor;
	int[] eng;
	int[] math;
	
	int[] total;
	float[] avg;
	
	int members= 5;
	
	public ScoreServiceV1B() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		
		kor = new int[members];
		eng = new int[members];
		math = new int[members];
		
		total = new int[members];
		avg = new float[members];
		
	}
	
	public void inputNum() {
		
		System.out.println("학생들의 국어 점수를 입력해주세요 ( 0 ~ 100 )");
		System.out.println("-".repeat(60));
		for(int i = 0; i < 5; i++) {
			System.out.printf("학생 %d >> ", i + 1);
			kor[i] = scan.nextInt();
			while(kor[i] < 0 || kor[i] > 100) {
				System.out.println("점수는  0 ~ 100 내에서 입력해주세요");
				System.out.printf("학생 %d >> ", i + 1);
				kor[i] = scan.nextInt();
			}
		}
		System.out.println("=".repeat(60));
		
		System.out.println("학생들의 영어 점수를 입력해주세요 ( 0 ~ 100 )");
		System.out.println("-".repeat(60));
		for(int i = 0; i < 5; i++) {
			System.out.printf("학생 %d >> ", i + 1);
			eng[i] = scan.nextInt();
			while(eng[i] < 0 || eng[i] > 100) {
				System.out.println("점수는  0 ~ 100 내에서 입력해주세요");
				System.out.printf("학생 %d >> ", i + 1);
				eng[i] = scan.nextInt();
			}
		}
		System.out.println("=".repeat(60));
		
		System.out.println("학생들의 수학 점수를 입력해주세요 ( 0 ~ 100 )");
		System.out.println("-".repeat(60));
		for(int i = 0; i < 5; i++) {
			System.out.printf("학생 %d >> ", i + 1);
			math[i] = scan.nextInt();
			while(math[i] < 0 || math[i] > 100) {
				System.out.println("점수는  0 ~ 100 내에서 입력해주세요");
				System.out.printf("학생 %d >> ", i + 1);
				math[i] = scan.nextInt();
			}
		}
		System.out.println("=".repeat(60));
		
	}
	
	public void totalAvg() {
		for(int i = 0; i < 5; i++) {
			total[i] = kor[i];
			total[i] += eng[i];
			total[i] += math[i];
			
			avg[i] = (float)total[i] / 3;
		}
	}
	
	public void printList() {
		this.totalAvg();
		
		System.out.println("빛고을 고등학교 성적리스트");
		System.out.println("=".repeat(70));
		System.out.printf("학번\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("-".repeat(70));
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d\t", i + 1);
			System.out.printf("%d\t", kor[i]);
			System.out.printf("%d\t", eng[i]);
			System.out.printf("%d\t", math[i]);
			System.out.printf("%d\t", total[i]);
			System.out.printf("%3.2f\n", avg[i]);
		}
		System.out.println("=".repeat(70));
		
	}
}
