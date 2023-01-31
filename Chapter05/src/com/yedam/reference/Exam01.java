package com.yedam.reference;

public class Exam01 {

	public static void main(String[] args) {
		int intVal = 10;
		int[] array = {1,2,3};
		int[] array2 = {1,2,3};
		int[] array3 = null;
		int a;
		
		System.out.println(intVal);
		//스택 영역에 변수가 가지는 주소를 보여줌
		System.out.println(array);
		
		System.out.println(array2);
		System.out.println(array3); //그냥 초기화할 경우 error

		System.out.println(array==array2);//false
//		System.out.println(array.equals(array2)); false
		System.out.println(array[0]==array2[0]); //true
		//System.out.println(array3.length);//NullPointerException Error발생
		
		//memory leak -> 메모리 누수, 메모리 부족
		
		//String을 많이 사용하는 편이라 개념에 익숙해져보자<라는 목표
		
		
	}

}
