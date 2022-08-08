package ezen0808_Exception.sec02_runtime_exception;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
				
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); //예외 발생. a가 number가 아니기 때문에.
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	}
}

