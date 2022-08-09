package ezen0809_APIs.sec10_exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; //String 타입의 정규 표현식.
					//02 또는 010  //숫자 3~4자리  //숫자 4자리
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; //웹에서 쓰는 정규 표현식.
		data = "angel@navercom"; // com 앞에 .이 존재하지 않음. 정규식과 다른 부분.
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
//		정규 표현식은 외우려고 하지 말 것.
//		외우면 당연히 좋겠지만 외울 것이 너무 많다.
//		어떤식으로 동작하는지 원리를 보고 사용할 때는 필요한 만큼 찾아서 사용하면 된다.
		
	}
}
