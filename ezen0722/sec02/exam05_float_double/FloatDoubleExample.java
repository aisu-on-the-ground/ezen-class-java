package ezen0722.sec02.exam05_float_double;
public class FloatDoubleExample {
	public static void main(String[] args) {
		//실수값 저장
		double var1 = 3.14;		
		//float var2 = 3.14;		//컴파일 에러(Type mismatch)
		float var3 = 3.14F;
		
		// ** 자바는 실수 리터럴 기본 타입을 double형으로 하기 때문에
		// ** float형을 사용하려면 F를 붙여야 한다
		
		//정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F; //소수점 이하 자릿수 표현의 갯수 차이가 있다. bit수가 다르기 때문
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e 사용하기 -> 10의 지수를 나타내는 e, E
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);
		
		
	} 
}
