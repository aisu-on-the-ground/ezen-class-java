package ezen0728_OOP.sec06.exam02_field_default_value;

public class FieldInitValueExample {
	public static void main(String[] args) {	
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField: " + fiv.byteField);
		System.out.println("shortField: " + fiv.shortField);
		System.out.println("intField: " + fiv.intField);
		System.out.println("longField: " + fiv.longField);		
		System.out.println("booleanField: " + fiv.booleanField); // boolean 기본값 false
		System.out.println("charField: " + fiv.charField);		
		System.out.println("floatField: " + fiv.floatField);
		System.out.println("doubleField: " + fiv.doubleField);		
		System.out.println("arrField: " + fiv.arrField); // 배열 기본값 null
		System.out.println("referenceField: " + fiv.referenceField); // String 기본값 null
	}
}
