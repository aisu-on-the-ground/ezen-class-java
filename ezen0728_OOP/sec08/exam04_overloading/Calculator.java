package ezen0728_OOP.sec08.exam04_overloading;

public class Calculator {
	//정사각형의 넓이
	double areaRectangle(double width) { // 정사각형
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) { // 직사각형
		return width * height;
	}	
}

