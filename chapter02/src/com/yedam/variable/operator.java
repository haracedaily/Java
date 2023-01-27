package com.yedam.variable;

public class operator {
	public static void main(String[] args) {
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
		
		//정수 자동 타입 변환 연산
		byte x = 10;
		byte y = 20;
		int result = x+y;
		System.out.println(result);
		
		//강제 타입 변환;int값을 쓸일이 절대 없는 경우<<인원수/보통사용x
		byte result2 = (byte)(x+y);
		
		//데이터 타입 크기에 따른 연산
		//long + int = long
		//byte + int = int
		//long or int + double or float = 실수 데이터 타입
		byte bVar = 10;
		int iVar1 = 100;
		long lVar = 1000;
		//long result3 = bVar+iVar1+lVar;
		int result3 = (int)(bVar+iVar1+lVar);
				
		System.out.println(result3);
		double dVal2=3.14444;
		double dResult = result3 + dVal2;
		System.out.println(dResult);
		
		int iResult = (int)dVal2 + iVar1;
		System.out.println(iResult);
		
		//정수간 연산에서 실수 결과값이 나오는 경우
		int iVal2 = 30; //+,-,*,/할때 더큰 타입을 따라가기 때문에 강제변환 혹은 아예 실수로 만들어서 계산
		double dVal3 = iVal2/4.0;
		System.out.println(dVal3);
		//정수끼리 계산시 정수만 나옴->즉 7.5가 나오는게 아니라 결과값 자체가 7이 나옴
		
		int iVal3 =4;
		dVal3 = iVal2/(double)iVal3;
		System.out.println(dVal3);
		
		//String + 연산
		String str1 = 10+2+"8";//128
		System.out.println("str1 : "+str1);//128
		
		String str2 = 10+"2"+8;
		System.out.println("str2 : "+str2);//1028
		
		String str3 = "10"+(2+8);
		System.out.println("str3 : "+str3);//1010
		
		//문자열 -> 숫자 |parse는 변환하다|단, 문자형 숫자만 가능,혼합 불가 
		int value = Integer.parseInt(str3);
		String iNo="10";//int
		String bNo="8";//byte
		String dNo="3.222";//double
		int sNo = Integer.parseInt(iNo);
		byte sNo2 = Byte.parseByte(bNo);
		double sNo3 = Double.parseDouble(dNo);
		
		System.out.println(sNo);
		System.out.println(sNo2);
		System.out.println(sNo3);
		
		//숫자 -> 문자열로 변환
		String str4=String.valueOf(value);
		String str5=String.valueOf(sNo);
		String str6=String.valueOf(sNo2);
		String str7=String.valueOf(sNo3);
		System.out.println(str5+str6+str7);
	}
}
