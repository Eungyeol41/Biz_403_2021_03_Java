package com.callor.apps;

public class Pay_03 {

	public static void main(String[] args) {
		
		int nPay = 3_723_560;
		int nPaper = 50_000;
		int nCount = nPay / nPaper;
		
		for(int index = 0; nPay > 0; index++) {
				
			nCount = nPay / nPaper;
			System.out.printf("%6d 원권 : %5d매\n", nPaper, nCount);
			nPay %= nPaper;
			
			// nPaper값을 2 또는 5로 나누기
			if(index % 2 == 0) {
				nPaper /= 5;
			} else {
				nPaper /= 2;
			}
		}
	}
}
