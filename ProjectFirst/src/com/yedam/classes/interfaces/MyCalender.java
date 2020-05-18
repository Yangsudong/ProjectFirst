package com.yedam.classes.interfaces;

import java.time.DayOfWeek;
import java.util.Calendar;

public class MyCalender {
	public static void main(String[] args) {	
		Calendar cal = Calendar.getInstance();	//오늘 날짜 현재 시간 기준
//		cal.set(2020,5,18);
//		System.out.println(cal);
//		System.out.println("년도 : " + cal.get(Calendar.YEAR));
//		System.out.println("월 : " + cal.get(Calendar.MONTH));
//		System.out.println("일 : " + cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("요일 : " + cal.get(Calendar.DAY_OF_WEEK));
		showCal(2020,06);			
	}
	
	public static void showCal(int year, int month) {
		// year, month 달력 출력
		int today = 1;
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year,month);
		System.out.println(year + "년" + month + "월");
		String[] week = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		for(int i =0; i < week.length; i++) {
			System.out.print(week[i]);
		}
		System.out.println();
		for(int i = 1; i<dayOfWeek; i++) {
			System.out.printf("%3s","");	
		}
		
		for(int i=0; i < lastDay ; i++) {
			System.out.printf("%3d",today);	// -10 3개의 공백을받아 값을표현해서 모양맞춤
			if((today + dayOfWeek - 1)% 7 ==0) 
				System.out.println();
			today++;				
		}
	}
	public static int getDayOfWeek(int year,int month) {
		// 일(1), 월 (2), 화(3), 수(4), 목(5), 금(6), 토(7)'
		Calendar cal = Calendar.getInstance();
		cal.set(year,month-1,1);	// (년 ,월, 일)
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
				
		return dayOfWeek;
	}
	public static int getLastDay(int year,int month) {
				
		int lastDay = 0;		
		if((month <= 7 && month % 2 == 1)||(month >=8 && month % 2 == 1)) {
			lastDay = 31;
		}
		else if(month == 2 ) {
			// 윤년계산
			if ((year % 4 == 0 && year % 100 !=0) || (year % 400 ==0))
			lastDay = 29;
			else
			lastDay = 28;
		}
		else {
			lastDay = 30;
		}
			
	return lastDay;
	}
	
}
