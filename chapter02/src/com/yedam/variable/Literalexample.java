package com.yedam.variable;

public class Literalexample {
	public static void main(String[] args) {
		
		//int 사용
		int var1 = 0b1011; //2진수(0b(binary)로 시작)
		int var2 = 0206; //8진수(0으로 시작)
		int var3 = 365; //10진수
		int var4 = 0xB3;//16진수(0x로 시작)
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		//byte -128~127
		byte bVal = -128;
		byte bVa12 = 0;
		byte bVa13 = 127;
		int bVa14 = 500;//데이터 타입 변경
		
		//long 
		
		long lVal = 10;
		//int가 가지는 범위를 넘어서 long에 넣게되면, long타입이라고 표현해줘야함 ~L; 정수의 default값은 int여서 long의 경우 long이라는 표현을 넣어줘야함
		long lVal2 = 100000000000L;
		
		//char(유니코드)
		//문자 다룰 때 쓰는 기본타입.
		
		char cVar='A'; //65
		char cVar2='가';
		char cVar3=67;
		char cVar4=0x0041;
		System.out.println(cVar);
		System.out.println(cVar2);
		System.out.println(cVar3);
		System.out.println(cVar4);
		
		//문자열
		//String ->참조타입이다
		//char cVa15 = '홍';
		String str="홍길동";
		String str2="프로그래머";
		
		System.out.println(str);
		System.out.println(str2);
		
		//이스케이프 문자
		//탭만큼 띄움(\t)
		System.out.println("번호\t이름\t직업");
		
		//엔터(\n)
		System.out.println("행 단위 출력\n");
		
		//특수문자 존재 여부 확인(\",\')
		System.out.println("우리는 \"개발자\'입니다.");
		
		//특수문자 존재 여부 확인(\\)
		System.out.println("봄\\여름\\가을\\겨울");
		
		//실수 타입
		//float 실수의 default값은 double이라 float의 경우 f를 넣어줘야함(=long
		float fVal = 3.14f;
		//double
		double dVal = 3.14;
		
		//e사용하기
		double dVal2 = 3e6; //3*10의 6승
		float fVal2 = 3e6f;//3*10의 6승
		double dVal3 = 2e-3;//2*10의 3승 => 2/1000
		
		System.out.println(dVal2);
		System.out.println(fVal2);
		System.out.println(dVal3);
		//실수의 값이 크면 E가 프린트 되어 나옴
		//ex> 300000000000000000000-> 3.0E22

		
		//논리타입
		
		boolean stop = true;
		
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
		
		/*타입변환 ---그 참고로 데이터용량 먹는 값이 정해져있어서
		해당하는 데이터용량 안의 값이라면 서로 연동가능!
		보통 설정값에서 변동이 있을때->>차후 업데이트로 서버 내렸을때 다시 설정하는 경우
		
		자동타입변환 ; 자동데이터 타입의 값을 큰 데이터 타입으로 변화하는 것
		상대적으로 적용; ex> byte<short<int<long<float<double
		교재 p73
		
		단 char A='A' int a=A <<-(유니코드값)65로 저장*/
		
		
		
		
		
	}
}