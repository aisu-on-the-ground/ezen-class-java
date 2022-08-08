package ezen0725.sec03.exam01_sign;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x; //해당부호를 곱해준다
		int result2 = -x; //부호반전
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
		//short result3 = -s;  //컴파일 에러. short는
		int result3 = -s; 
		System.out.println("result3=" + result3);
		
		short형은 부호변환이 안되나요

	}
}

