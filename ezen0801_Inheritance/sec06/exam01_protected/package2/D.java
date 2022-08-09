package ezen0801_Inheritance.sec06.exam01_protected.package2;

import ezen0801_Inheritance.sec06.exam01_protected.package1.A;

public class D extends A {
	public D() {
		super(); 
		this.field = "value";
		this.method();
	}
	
	
	public static void main(String[] args) {
		D d = new D();
		System.out.println(d.field);
	}
}
