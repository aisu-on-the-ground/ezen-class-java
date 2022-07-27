package ezen0726.sec03.exam01_for;
public class ForFloatCounterExample {
	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
			
			// 0.1은 float 타입으로 정확하게 표현할 수 없기 때문에 실제 값은 0.1보다 아주 조금 크고
			// 이 차이로 인해 for문으로 조건식을 판별할 때 결과가 달라지므로
			// for문에서는 float형의 데이터타입의 사용을 금하는 것이 좋다.
		}
	}
}


