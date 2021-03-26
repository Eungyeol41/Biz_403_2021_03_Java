package com.callor.apps;

import com.callor.apps.Service.TimeServiceV1;

public class App_01 {

	public static void main(String[] args) {

		TimeServiceV1 tsV1 = new TimeServiceV1();

		tsV1.makenums();
		tsV1.printEven();
		tsV1.sumPrint();
	}
}
