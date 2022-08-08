package ezen0725.sec03.exam03_deny_logic;

public class DenyLogicOperatorExample {
	public static void main(String[] args) {
		boolean play = true;
    System.out.println(play);

    play = !play;
    System.out.println(play);

    play = !play; //run 변수 제어시에 사용 가능
    System.out.println(play);
	}
}
