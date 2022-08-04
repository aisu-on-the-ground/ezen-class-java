package ezen0728_OOP.sec07.exam01_constructor_declaration;

public class CarExample {
	   public static void main(String[] args) {
	      
	      Car myCar = new Car("검정", 3000);      
	      System.out.println(myCar.color);
	      System.out.println(myCar.cc);
	      
	      Car myCar2 = new Car();
	      myCar2.color="white";
	      myCar2.cc=2000;
	      System.out.println(myCar2.color);
	      System.out.println(myCar2.cc);
	   }
	}