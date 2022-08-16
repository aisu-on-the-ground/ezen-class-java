package ezen0815_Generic.sec02.exam01_none_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		
		//Object nameobj = box.get();
		//System.out.println(nameobj);
		
		String name = (String) box.get();
		System.out.println(name);
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
	}

}
