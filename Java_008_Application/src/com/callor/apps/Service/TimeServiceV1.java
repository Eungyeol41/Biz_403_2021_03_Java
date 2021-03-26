package com.callor.apps.Service;

public class TimeServiceV1 {

	int[] intNum;

	public void makenums() {
		intNum = new int[8];
	}

	public void printEven() {
		for(int i = 0; i < 8; i++) {
			intNum[i] = i + 2;
		}
	}

	public void sumPrint() {
		for(int i = 0; i < 8; i++) {
			System.out.println("==================");
			System.out.printf("%d단\n", intNum[i]);
			System.out.println("------------------");
			for(int j = 2; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", intNum[i], j, intNum[i] * j);
			}
		}
	}
}
