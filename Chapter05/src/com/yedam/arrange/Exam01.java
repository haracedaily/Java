package com.yedam.arrange;

import java.util.Calendar;

public class Exam01 {

	public static void main(String[] args) {
		//int a = 1;
		Week today = null;
		//참조 타입<<Week.MONDAY
		//Week[타입명].~
		//오늘이 무슨 요일인지 알려주는 메소드
		Calendar cal = Calendar.getInstance();
		//일주일의 시작 1=sun 2=mon... 7=sat..
		int week = cal.get(Calendar.DAY_OF_WEEK);//오늘 날짜를 알려주되 숫자로 알려줌
		
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WENDESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘의 요일은 "+today);
		

	}

}
