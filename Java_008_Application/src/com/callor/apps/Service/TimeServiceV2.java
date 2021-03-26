package com.callor.apps.Service;

public class TimeServiceV2 {

	int nums[];
	
	public TimeServiceV2() {
		nums = new int[8];
	}
	
	public void makeTimes() {
		
		for(int i = 0; i < nums.length; i++) {
			int num = i + 2; // 2 ~ ?? 
			nums[i] = num; // nums[i] = i + 2;
		}
	}
	
	public void printTimes() {
		
		for(int i = 0; i < nums.length; i++) {
			
			String dLines = LinesService.dLines(50);
			String sLines = LinesService.sLines(50);
			
			// Title 출력
			System.out.println(LinesService.dLines(50));
			System.out.printf("%d단 구구단\n", nums[i]);
			System.out.println(LinesService.sLines(50));
			
			// 계산값 출력
			for(int j = 2; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", nums[i], j, nums[i] * j);
			}
		}
	}
}
