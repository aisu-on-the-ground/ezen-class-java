package ezen0803_Interface.sec06.exam01_interface_extends;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		//ia.methodB(); //불가능
		//ia.methodC(); //불가능
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		//ib.methodA(); //불가능
		//ib.methodC(); //불가능
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}

