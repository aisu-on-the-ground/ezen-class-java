package ezen0809_APIs.sec05.exam02_gc;

public class GcExample {
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);
		emp = null;	//매개변수1인 객체는 null로 설정된 순간 쓰레기값 가지므로 탈락
		emp = new Employee(2);		
		emp = new Employee(3); // 매개변수2인 객체는 매개변수3인 객체와 이름이 동일하기 때문에 2가 쓰레기값을 가지게되어 탈락
		
		System.out.print("emp가 최종적으로 참조하는 사원번호: ");
		System.out.println(emp.eno);
		System.gc();	
	}
}

