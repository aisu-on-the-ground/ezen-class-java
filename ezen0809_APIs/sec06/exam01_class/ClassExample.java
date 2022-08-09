package ezen0809_APIs.sec06.exam01_class;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		//.getPackage()에 마우스 갖다 대보면
		//이 메소드가 어떤 객체를 리턴해준다는 것을 알 수 있다.
		//그렇기 때문에 .getPackage().getName()같은 구조가 가능한 것.
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("ezen0809_APIs.sec06.exam01_class.Car");
			//문자열에 해당하는 위치에 진짜 클래스가 있다면 객체를 얻어낼 수 있다(?)
			//이 방법을 더 많이 쓴다고 함 = JAVA랭귀지와 DB시스템을 연결할 때 사용. 
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
