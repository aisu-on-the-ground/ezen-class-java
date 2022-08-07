package ezen0727.sec06.exam07_array_copy;


public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length); // arraycopy() 메소드 사용 예시
		// 배열이름 다음에 나오는 0은 복사할 배열의 인덱스 시작점을 의미한다
		// oldStrArray[0]부터 oldStrArray.length만큼의 원소갯수만큼 newStrArray에 복사+붙여넣기 할 건데
		// 복사된 값은 newStrArray[0]부터 저장한다
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}