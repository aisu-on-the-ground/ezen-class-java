package ezen0725.sec03.exam04_bit_reverse;
public class BitReverseOperatorExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		System.out.println(toBinaryString(v1) + " (십진수: " + v1 + ")");
		System.out.println(toBinaryString(v2) + " (십진수: " + v2 + ")");
		System.out.println(toBinaryString(v3) + " (십진수: " + v3 + ")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4; //비트반전 시에 절대값이 달라짐! 양수로 변할 때 -1. 음수값 범위가 1만큼 더 넓다
		int v6 = ~v4 + 1;
		System.out.println(toBinaryString(v4) + " (십진수: " + v4 + ")");
		System.out.println(toBinaryString(v5) + " (십진수: " + v5 + ")");
		System.out.println(toBinaryString(v6) + " (십진수: " + v6 + ")");
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}


//10진수를 2진수로 바꾸는 법
//int v1 = 10
//ㄴ v1을 toBinaryString()으로 진수 변환하면?
//00000000 00000000 00000000 00001010
//즉, 자동으로 2진수 변환을 해주는 메소드이다.