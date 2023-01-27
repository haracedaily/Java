package com.yedam.variable;

public class Casting {
	public static void main(String[] args) {
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
		int iVar = 65;
		byte bVar = (byte)iVar;
		System.out.println(bVar);
		
		char cVar = (char)iVar;//문자->(유니코드)숫자 = 숫자->(유니코드식해석)문자
		System.out.println(cVar);
		
		//실수 -> 정수 강제 타입 변환
		double dVar = 3.14444;
		iVar = (int) dVar;
		System.out.println(iVar);
		//자동 타입 변환
		dVar = iVar;
		System.out.println(dVar);
		//손실되어진 값은 재변환해도 돌아오지x 사실상 del당함
		
		/*byte char short int타입이 산술 연산으로 계산되어질때 
		 해당 값이 나오는 순간 int형으로 변환되어 나와짐<
		 산술의 결과식은 결국 int로 적용 되어야 정상작동
		 만약 다른 타입 사용시 컴파일에 에러가 일어나서 작동이 안됨 
		 int를 주로 사용하는 이유 중 대표적인 이유 하나
		 int와 long의 산술의 결과값은 long타입으로 작동
		 자세한건 실습으로 익히기
		 int(≒강약약강)
		 손실의 위험을 피하기 위해
		 그리고 사실상 차후 추가적인 산술이 더 들어가기 위해*/
		
	}
}
