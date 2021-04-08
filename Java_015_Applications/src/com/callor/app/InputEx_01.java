package com.callor.app;

import com.Eungyeol41.standard.InputService;
import com.Eungyeol41.standard.impl.InputServiceImplV1;

public class InputEx_01 {

	public static void main(String[] args) {
		
		InputService isV1 = new InputServiceImplV1();
		
		isV1.inputValue("새우깡");
		
		System.out.println(isV1.toString());
		
		Integer num1 = 30;

		int[] nums = new int[2];
		nums[0] = 100;
		nums[1] = 200;

		System.out.println(nums.toString());

		Integer[] nums1 = new Integer[2];
		nums1[0] = 100;
		nums1[1] = 200;
		System.out.println(nums1.toString());
	}
}
