package com.yedam.reference;

public class Exam02 {

	public static void main(String[] args) {
		//new 연산자 없는 String
		String strVal1 = "yedam";
		String strVal2 = "yedam";
		
		//==, equals
		//== 데이터를 비교하는 게 아니고, stack영역에 있는 값을 비교
		if(strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 메모리 주소 같음");
		}else {
			System.out.println("strVal1과 strVal2는 메모리 주소 다름");
		}
		//문자열(String)간의 데이터를 비교.
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2는 데이터가 같다.");
		}else {
			System.out.println("strVal1과 strVal2는 데이터가 다르다.");
		}
		
		//그런데 heap의 주소 호출된건 어떻게 활용하는거지
		//new 연산자가 있는 String 객체 비교
		//객체 : 참조타입의 변수
		
		String strVal3 = new String("yedam");
		String strVal4 = new String("yedam");
		
		if(strVal3 == strVal4) {
			System.out.println("strVal3과 strVal4는 같은 메모리 주소");
		}else {
			System.out.println("strVal3과 strVal4는 다른 메모리 주소");
		}
		
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3과 strVal4의 데이터는 같음.");
		}else {
			System.out.println("strVal3과 strVal4의 데이터는 다름.");
		}
		
		
		//new 연산자 안 쓴 String, new 연산자를 사용한 String 비교
		if(strVal1 == strVal3) {
			System.out.println("strVal1과 strVal3은 같은 메모리 주소");
		}else {
			System.out.println("strVal1과 strVal3은 다른 메모리 주소");
		}
		
		if(strVal1.equals(strVal3)) {
			System.out.println("strVal1과 strVal3의 데이터는 같음.");
		}else {
			System.out.println("strVal1과 strVal3의 데이터는 다름.");
		}
		//new는 기존의 공간 말고 완벽히 새로운 공간에 만들어주는 생성자함수
		//즉 데이터의 값은 절대로 겹치는 경우가 없다.
		
		
		
	}

}
