package com.callor.apps.Service;

public class LinesService {

	/*
	 * 누군가 LinesService.dLines( 10 ) 형식으로 호출을 하면
	 * 		= 문자열을 10개 생성하여 return하라
	 * LinesService.sLine( 20 ) 형식으로 후출을 하면
	 * 		- 문자열을 20개 생성하여 return하라
	 */
	public static String dLines( int length ) {
		
		String dLine = "";
		for(int i = 0; i < length; i++) {
			dLine += "="; // length == 5; -> =====
		}
		return dLine; // 여기서 만든 문자열을 호출한 곳으로 보내라
	}
	
	public static String sLines( int length ) {
		
		String sLine = "";
		for(int i = 0; i < length; i++) {
			sLine += "-";
		}
		return sLine;
	}
	
}
