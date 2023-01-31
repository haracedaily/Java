package com.yedam.array;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		int studentNum = 0;
		int[] scores = null;
		int max = 0;//최대값 및 평균값으로 사용할 변수 생성
		while(flag) {
			System.out.println("----------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {
			case 1:
				System.out.print("학생수>");
				studentNum=Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				break;
			case 2:
				for(int i=0;i<studentNum;i++) {
					System.out.println("scores["+i+"]>");
					scores[i] = Integer.parseInt(sc.nextLine());//scores를 int, 즉 정수로 만들었기에 정수화 시켜준다
					}
				break;
			case 3:
//				int i=0;
//				for(int var : scores) {
//					System.out.println("scores["+i+"]>"+var);
//					i++;
//				}
				for(int i=0;i<studentNum;i++) {//i<scores.length;되도록 length사용해보자!
					System.out.print("scores["+i+"]>");
					System.out.println(scores[i]);
				}
				break;
			case 4:
				max=0;
				for(int i=0;i<scores.length;i++) {
					if(scores[i]>max) {
						max=scores[i];
					}
				}
				System.out.println("최고 점수 :"+max);
				max=0;//합계 구하기 <=int sum으로 변수 새로 만들자 :D..
				for(int i=0;i<scores.length;i++) {
					max+=scores[i];
				}
				System.out.println("평균 점수 :"+((double)max/scores.length));
				break;
			case 5:
				System.out.println("프로그램 종료");
				flag=false;
				break;
			}
		}
		
		
		
		

	}

}
