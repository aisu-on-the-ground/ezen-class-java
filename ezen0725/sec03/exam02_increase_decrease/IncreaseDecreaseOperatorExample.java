package ezen0725.sec03.exam02_increase_decrease;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------------------");
		x++; //10   단항연산자(++)가 뒤에 붙으면 현재 연산 때는 값을 유지하고 다음 연산에 +1 (x를 어디선가 가져다 쓸 때 그 순간 증가)
		++x; //12
		System.out.println("x=" + x);		

		System.out.println("-----------------------");		
		y--; //10
		--y; //8
		System.out.println("y=" + y);		

		System.out.println("-----------------------");		
		z = x++;
		System.out.println("z=" + z); //12 여기까진 12이고 이 후에 +1
		System.out.println("x=" + x); //13
		
		System.out.println("-----------------------");		
		z = ++x;
		System.out.println("z=" + z); //14
		System.out.println("x=" + x); //14
		
		System.out.println("-----------------------");				
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}

