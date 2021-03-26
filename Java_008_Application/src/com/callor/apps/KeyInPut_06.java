package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.Service.LinesService;
import com.callor.apps.Service.NumberServiceV1;

public class KeyInPut_06 {

	public static void main(String[] args) {
		
		NumberServiceV1 nsV1 = new NumberServiceV1();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println(LinesService.dLines(50));
			System.out.println("넘버 체크!!");
			System.out.println(LinesService.dLines(50));
			nsV1.inputNum();
			nsV1.checkEven();
			nsV1.checkPrime();
			
			System.out.println(LinesService.dLines(50));
			System.out.println("계속할까요? (Yes : 1, No : 0)");
			int yesNo = scan.nextInt();
			if(yesNo == 0) {
				break;
			}
			
			
		}
		System.out.println("Game Over!!");
		
	}
}
