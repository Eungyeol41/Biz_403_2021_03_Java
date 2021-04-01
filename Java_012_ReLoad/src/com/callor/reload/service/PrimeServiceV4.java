package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PrimeServiceV4 {

	protected Random rnd;
	List<Integer> intList;
	int[] intNum;

	public PrimeServiceV4() {

		rnd = new Random();
		intList = new ArrayList<Integer>();
		intNum = new int[50];
	}

	public void primeNum() {
		int i;
		int j;
		for (i = 0; i < 50; i++) {
			intNum[i] = rnd.nextInt(51) + 50;
			
		}
		for (j = 2; j < 50; j++) {
			if (intNum[i] % j == 0) {
				break;
				
			} else {
				intList.add(intNum[i]);
			}
		}

	}

	public void printPrimeNum() {
			for (int i = 0; i < intList.size(); i++) {
				Integer prime = intList.get(i);
				System.out.println("소수 : " + prime);
			}

	}
}
