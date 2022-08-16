package ezen0812_Thread.sec04.exam02_synchronized;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator(); // 하나의 객체를 만들고
		
		User1 user1 = new User1(); 
		user1.setCalculator(calculator); // 스레드-User1에서 객체에 접근
		user1.start();

		User2 user2 = new User2();
		user2.setCalculator(calculator); // 스레드-User2에서도 같은 객체에 접근
		user2.start();
	}
}
