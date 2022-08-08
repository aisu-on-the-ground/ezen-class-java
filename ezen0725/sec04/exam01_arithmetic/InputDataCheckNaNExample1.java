package ezen0725.sec04.exam01_arithmetic;

public class InputDataCheckNaNExample1 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf( userInput );
		// "NaN"을 Double형으로 변형하여 반환. 원래 숫자가 아니었으므로 그대로 "NaN"
		
		System.out.println(val);
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
	}
}

