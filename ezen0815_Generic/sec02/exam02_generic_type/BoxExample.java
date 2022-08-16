package ezen0815_Generic.sec02.exam02_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>(); // 인스턴스 생성 시에 타입을 정의
		box1.set("hello");
		String str = box1.get(); // 강제형변환 없이 값을 꺼내올 수 있음

		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();
		System.out.println(value);
		
		// int a = box2.t.intValue();
		// System.out.println(a);
		// t가 public 이면 getter 대신 Integer의 메소드 intValue()로 값에 접근 가능

		Box<Double> box3 = new Box<Double>();
		box3.set(3.141592);
		double valuedouble = box3.get();
		System.out.println(valuedouble);
		
	}
}
