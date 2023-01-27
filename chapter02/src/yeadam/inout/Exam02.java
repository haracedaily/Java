package yeadam.inout;

import java.io.IOException;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) throws IOException {
		
	
//	int keyCode;
//	
//	System.out.println("입력>");
//	keyCode = System.in.read();
//	System.out.println("KeyCode : " + keyCode);
//	
//	System.out.println("입력>");
//	keyCode = System.in.read();
//	System.out.println("KeyCode : " + keyCode);
//	
//	System.out.println("입력>");
//	keyCode = System.in.read();
//	System.out.println("KeyCode : " + keyCode);
	
	//Scanner =기능을 빌려와야 해서 java.util 눌러서 빌려와야함
	//sc가 변수
	Scanner sc = new Scanner(System.in);
		
	System.out.println("입력>");
	//입력한 값들을 띄워주는게 nextLine
	String word = sc.nextLine();//입력할때 쓰는 기능
	//word에 입력한 값들을 넣음
	System.out.println(word);
	
	//문자열 데이터 비교, == 문자열은 equals로 비교해야함
	if(word.equals("test")) {
		System.out.println("equals");
	}
	if(word == "test") {
		System.out.println("==");
	}
	//==으로는 문자열을 비교할수가 없어서 데이터값 출력x
	
	}
}
