package com.yedam.condtion;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적입력>");
		String point = sc.nextLine();//Scanner의 기능 중 nextLine은 문자열을 사용할때 쓰는 메소드 내가 입력할 값을 가져올떄 사용
		//타이핑한 글자를 받아옴
		//입력한 문자열 변수에 저장
		int scores = Integer.parseInt(point);
		//정수형으로 형변환
		//문자열을 int형으로 형 변환하는 과정
		
		String pass="";
//		if(scores>=90) {
//			pass = "A";
//		}else if(scores>=80) {
//			pass = "B";
//		} else if(scores>=70) {
//			pass="C";
//		}else {
//			pass="D";
//		}
		
		int score = (scores/10);
		System.out.println(score);
		switch(score) {
		case 10:
		case 9:
			pass="A";
			System.out.println("학점은"+pass+"입니다.");
			break;
		case 8:
			pass="B";
			System.out.println("학점은"+pass+"입니다.");
			break;
		case 7:
			pass="C";
			System.out.println("학점은"+pass+"입니다.");
			break;
//		case 0:
//			pass="A";
//			System.out.println("학점은"+pass+"입니다.");
//			break; 원래는 %10을 변수에 주었었음
		default:
			pass="D";
			System.out.println("학점은"+pass+"입니다.");
			break;
		}
		
		
		
		
		

	}

}
