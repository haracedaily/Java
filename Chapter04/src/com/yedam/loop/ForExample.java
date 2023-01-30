package com.yedam.loop;

public class ForExample {

	public static void main(String[] args) {
		//반복문
		//일정한 행동을 계속 반복
		//반복을 할 때 어떠한 규칙에 따라 행동 반복
		//규칙 찾는게 중요.
		
		//1~5까지의 누적 합
		int sum = 0;
		for (int i = 0; i < 6; ++i) {
//			sum = sum+i;
			sum +=i;
		}
		System.out.println(sum);
		
		//1~100 사이에서 짝수 구하는 반복문
		for(int i =1; i<=100;i++) {
			//i를 활용해서 뭔가를 해본다는 생각하기<<즉 i자체를 변수의 일부로 활용하는 것
			if(i%2==0) {System.out.println(i+"짝수입니다.\n");}//else {System.out.println(i+"홀수입니다.\n");}
		}
	
		//1~100 사이에서 홀수 구하는 반복문
		for(int i =1; i<=100;i++) {
			if(i%2==1) {System.out.println(i+"홀수입니다.\n");}
		}
		
		//1~100사이에서 2의 배수 또는 3의 배수 찾기
		for(int i =1; i<=100;i++) {
			if(i%2==0 || i%3==0) {System.out.println(i+" : 2 또는 3의 배수");}
		}
		
		
		//구구단 출력하기
		
		//2~9단까지 출력하는 반복문

		
		//기준이 되는 반복문이 바뀌는데 구성되는 조건도 변화해야한다면 중첩반복문을 사용한다.
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i+" * "+j+" = "+ (i*j));
			}
		}
		
		//2단 출력하기
		System.out.println("2단______________");
		for(int i=1;i<10;i++) {
			System.out.println("2X"+i+"="+(2*i));
		}
		
		//구구단 세로 찍기
		System.out.println("\t2단\t\t3단\t\t4단\t\t5단\t\t6단\t\t7단\t\t8단\t\t9단");
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.print("\t"+j+" X "+i+" = "+i*j);
			}			System.out.println();
		}

		//공포의 별찍기
		
		//*****
		//*****
		//*****
		//*****
		//*****
		//한칸씩 내려 갈때 쓰는 반복문
		for(int i=0;i<5;i++) {
			//별 출력할 때 쓰는 반복문
			String star="";
			for(int j=0; j<5; j++) {
				//+연산자를 활용해서 *****만듬
				//star = star + "*";
				System.out.print("*");
				
			}
			//System.out.println(star);
			System.out.println();
		}
		
		//*
		//**
		//***
		//****
		//*****
		for(int i=0;i<5;i++) {
			String star="";
			for(int j=0; i>=j;j++) {
				star = star+"*";
			}
			System.out.println(star);
		}
		System.out.println();		
		
		//거꾸로
		for(int i=5;i>0;i--) {
			String star="";
			for(int j=0; j<i;j++) {
				star+="*";
			}
			System.out.println(star);
		}
		
		//강사님vers
		for(int i=5;i>0;i--) {
			String star="";
			for(int j=i; j>0;j--) {
				star+="*";
			}
			System.out.println(star);
		}
		
		
		//띄워진 별
		for(int i=0;i<5;i++) {
			String blank="";
			String star="";
			for(int j=3;j>=i;j--) {
				blank+=" ";
			}
			for(int k=0;k<=i;k++) {
				star+="*";
			}
			System.out.println(blank+star);
		}
		
		//강사님ver
		for(int i=5;i>0;i--) {
			String blank="";
			String star="";
			for(int j=1;j<=5;j++) {
				if(i>j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		//트리
		for(int i=0;i<5;i++) {
			String blank="";
			String star="";
			String stars="";
			for(int j=3;j>=i;j--) {
				blank+=" ";
			}
			for(int k=0;k<=i;k++) {
				star+="*";
			}
				for(int l=1;l<=i;l++) {
					stars+="*";
				
			}
			System.out.println(blank+star+stars);
		}
		
		//트리 기둥
		for(int i=0;i<3;i++) {
			String blank="";
			String star="";
			for(int j=2;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<3;k++) {
				star +="*";
			}
			System.out.println(star);
		}
		
	}
	
}