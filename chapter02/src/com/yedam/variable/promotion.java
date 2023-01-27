package com.yedam.variable;

public class promotion {
	public static void main(String[] args) {
		
		/*repeat.
		 * 타입변환 ---그 참고로 데이터용량 먹는 값이 정해져있어서
		해당하는 데이터용량 안의 값이라면 서로 연동가능!
		보통 설정값에서 변동이 있을때->>차후 업데이트로 서버 내렸을때 다시 설정하는 경우
		
		자동타입변환 ; 자동데이터 타입의 값을 큰 데이터 타입으로 변화하는 것
		상대적으로 적용; ex> byte<short<int<long<float<double
		교재 p73
		
		단 char A='A' int a=A <<-(유니코드값)65로 저장*/
		
		//자동 타입 변환
		char cVar = 'A'+1;//65+1=>66, 'B'
		int iVar = cVar;
		
		System.out.println(iVar); //66
		//int -> double
		double dVar = iVar;
		System.out.println(dVar); //66.0;실수라 0.0까지 표현
		
		/*강제 타입 변환 큰 용량->작은 용량
		1>어떤 데이터 타입으로 바꿀지 명시
		2>넘어서는 데이터들은 손실로 이어짐
		3>문법
		int intValue=10;
		byte byteValue = (byte) intValue
		이렇게 ()으로 명시해줘야함
		예외적으로 실수를 정수로 바꿀 경우 소숫점이하는 버려짐<<
		이해하기 나름이지만 넘쳐서 버려진다랑 느낌이 달라서..
		 */
		
	}
}

