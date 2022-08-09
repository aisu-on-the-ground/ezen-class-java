package ezen0809_APIs.sec07.exam02_method;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
						//01 2 34567
		int location = subject.indexOf("프로그래밍"); //3에서 시작
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
			System.out.println(subject.indexOf("헐"));
		} else {
			System.out.println("자바와 관련없는 책이군요");
			System.out.println(subject.indexOf("헐"));
		}
	}
}

