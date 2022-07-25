package ezen0725.sec04.exam02_string_concat;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0; // JDK6.0 이 된다
		String str2 = str1 + " 특징"; // JDK6.0 특징 이 된다
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; // JDK33.0 -> 문자열이 먼저 나오면 뒤의 수도 문자열로 묶인다
		String str4 = 3 + 3.0 + "JDK"; // 6.0JDK -> 수가 먼저 나왔기 때문에 연산이 제대로 수행된다
		System.out.println(str3);
		System.out.println(str4);	
		
		
	}
}