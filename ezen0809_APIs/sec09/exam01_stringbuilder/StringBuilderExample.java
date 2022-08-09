package ezen0809_APIs.sec09.exam01_stringbuilder;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2");
		System.out.println(sb.toString());

		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5); // 5 앞을 의미하므로 4번째 한 글자만
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총문자수: " + length);
		
		String result = sb.toString(); //앞에서 추가하고 삽입하고 대체하고 삭제하고 등등 다 한 다음에
		System.out.println(result);		//String 변수에 toString()으로 넘겨줌. 메모리는 String 변수 하나만 차지.
	}
}
