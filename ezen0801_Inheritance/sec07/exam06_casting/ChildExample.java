package ezen0801_Inheritance.sec07.exam06_casting;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2(); //오버라이드 하지 않았으므로 메소드1,2 모두 부모에게 상속받은 그대로
		/*
		parent.field2 = "data2";  //(불가능)
		parent.method3();         //(불가능) -> 자식클래스에만 독립적으로 정의된 것들은 사용 불가. 지금은 부모인 척 하고 있기 때문.
		*/
		
		Child child = (Child) parent; //다시 자식타입으로 형변환 할 때는 자동형변환X 강제O
		child.field2 = "yyy";  //(가능)
		child.method3();     //(가능)
		//즉, 자식->부모 형변환은 자동으로 되나,
		//    부모->자식 형변환은 강제로 형변환 해주어야 함.
		
		child.field1 = "data2";
		child.method1();
		child.method2();
	}
}
