package com.yedam.array;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		//array.length
		Scanner sc = new Scanner(System.in);
		
		int[] ary = new int[6];
		
		System.out.println("ary의 배열 크기 : "+ ary.length);
		
		int[] ary2;
		System.out.println("배열의 크기>");
		
		int no = Integer.parseInt(sc.nextLine());
		ary2 = new int[no];
		System.out.println("ary2의 배열 크기 : "+ ary2.length);
		
		for(int i=0;i<ary2.length;i++) {
			System.out.println("입력>");
			ary2[i] = Integer.parseInt(sc.nextLine());
		}
		
		for(int i=0;i<ary2.length;i++) {
			System.out.println(ary2[i]);
		}
		
		//js -> forOf ||java -> 향상된 for문
		for(int var : ary2) {
			System.out.println(var);
		}
		
		//forOf 하나씩 꺼내와서 객체 변수에 사용하는 것
		//java의 향상된 for문은 js의 forOf처럼 하나씩 데이터를 가져와 앞에 대입 시켜준다
		//배열말고도 13장에서 또 사용한다<-
		//알면 편함//배열에 있는 데이터를 다 꺼내올때 사용
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
