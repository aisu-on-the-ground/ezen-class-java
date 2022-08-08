package ezen0725.sec03.exam01_sign;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x; //해당부호를 곱해준다
		int result2 = -x; //부호반전
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		// ** 부호연산자의 산출 타입은 'int'가 된다!
		
		short s = 100;
		//short result3 = -s;  //컴파일 에러. 산출 타입은 int 이므로 int형 변수에 저장할 수 있다.
		int result3 = -s; 
		System.out.println("result3=" + result3);

	}
}

