package ezen0815_Generic.sec05.exam01_bounded_type;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		//String str = Util.compare("a", "b"); (x)
		//Util.compare는 <T extends Number> 이므로 Number 타입의 자식타입만 들어올 수 있다. String은 아니다.
		
		int result1 = Util.compare(10, 20); // 오른쪽이 크면 1
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3); // 오른쪽이 작으면 -1
		System.out.println(result2);
	}
}
