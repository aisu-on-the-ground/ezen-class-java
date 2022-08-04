package Exercise_ControlStatement;

public class Exercise12 {

	public static void main(String[] args) {
		// 1~10000사이에 8이 몇번 나오는가?

	}
}

/*

public static void main(String[] args) {

int count = 0;

for(int i=1; i<=10000; i++){ // 이 경우 i가 아래에서 변질되면 안됨

	int temp = i; // i가 변질되는 것을 방지하기 위해 수를 temp에 저장

	while(true) {
		if (temp%10==8) {   // 10으로 나누어 나머지가 8이면 카운트
			count++;
		}
		if (temp>=10) {
			temp = temp/10; // 10보다 크면 1의 자리 수 제거 한 후 temp를 다시 올려보냄
		}else if(temp<10) { // 만약 i값이 8이어도 위에서 카운트해서 그냥 break
			break;
		} // temp의 1의 자리 깎기 중단하고 다음 수로 넘어감.

	} // while 문 안에 생으로 i를 넣었다면 무한대로 돌았을 것...
}

System.out.println("1에서 10,000 사이에 존재하는 8의 개수는? " + count);
// 답 : 4000
}

}

*/