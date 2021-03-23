package com.callor.apps;

public class Pay_02 {

	public static void main(String[] args) {
		
		int nPay = 3_723_560; // 금액
		int nPaper = 50_000; // 최고액면가 화폐
		
		// 정수 = 정수 / 정수 : 소숫점이하가 잘린다
		// 몫을 구하여 액면가액만큼 개수 계산
		int nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		
		// 액면가액만큼 개수를 구했으면 nPay에서 액면가액 금액만큼을 빼고 이후에 계산을 수행한다
		// 3723560 % 50000 => 3723560 - 5만원권 * 매수
		// nPay = nPay - (nPaper * nCount)
		// nPay = nPay % nPaper
		nPay %= nPaper;
		nPaper /= 5;
		System.out.println(nPay);
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 5;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 5;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 5;

		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 5;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
	}
}
