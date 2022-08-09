package ezen0809_APIs.sec07.exam02_method;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA"); //해당 문자열을 대체
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		oldStr.replace("자바", "JAVA");
		System.out.println("-------------------------------------------------");
		System.out.println("*"+oldStr);
		System.out.println("ㄴ String은 한 번 저장한 값을 변경하지 않고");
		System.out.println("ㄴ 새로운 메모리를 만들어 접근하기 때문에");
		System.out.println("ㄴ oldStr.replace(\"자바\", \"JAVA\")처럼 쓴다고 해서 바뀌지 않음.");
		System.out.println("*"+newStr);
		System.out.println("ㄴ 이와같이 새 참조변수를 만들어서 메소드 리턴값을 넣어줘어야 함");
		
		
	}
}

