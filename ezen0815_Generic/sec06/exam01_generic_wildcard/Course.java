package ezen0815_Generic.sec06.exam01_generic_wildcard;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
		// 이 경우 students = new T[capacity]; 로 한번에 생성하려하면 에러가 뜬다.
		// new는 생성을 의미한다. 아직 정해지지도 않은 T라는 타입으로는 생성할 수 없기 때문이다.
		// 따라서, 일단 Object 타입으로 생성한 후
		// Course의 인스턴스를 생성할 때 명시해주는 T 타입으로 형변환을 해준다.
	}

	public String getName() { return name; }
	public T[] getStudents() { return students; }
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
