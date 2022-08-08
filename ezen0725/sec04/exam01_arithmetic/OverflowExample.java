package ezen0725.sec04.exam01_arithmetic;
public class OverflowExample {
	public static void main(String[] args) {
		/*
		int x = 1000000;
		int y = 1000000;
		int z = x * y;  //int형 데이터타입의 범위 초과
		System.out.println(z);
		*/
		
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
	}
}

