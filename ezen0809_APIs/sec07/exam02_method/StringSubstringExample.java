package ezen0809_APIs.sec07.exam02_method;

public class StringSubstringExample {
	public static void main(String[] args) {	
		String ssn = "880815-1234567 ";
					//0123456789 10 11 12 13
		String firstNum = ssn.substring(0, 6); // 6번째 앞(=5)까지 라는 의미라서 
		System.out.println(firstNum);		
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		//서브스트링은 문자열이 길 때 일 부분만 뽑아서 보여줄 때 사용
		//대표적인 예)
		//게시판에 작성한 글 제목이 너무 길면 1~20번째까지만 보여주고 그 뒤는 ...으로 처리할 수 있다.
		
	} 
}

