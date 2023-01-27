package com.yedam.variable;

public class Literalexample2 {
	public static void main(String[] args) {
		//자동 타입 변환
		char cVar = 'A'+1;//65+1=>66, 'B'
		int iVar = cVar;
		
		System.out.println(iVar); //66
		//int -> double
		double dVar = iVar;
		System.out.println(dVar); //66.0;실수라 0.0까지 표현
		
		
	}
}