package ezen0727.sec06.exam05_array_in_array;

public class ArrayInArrayExample {
	public static void main(String[] args) {	
		
		int[][] mathScores = new int[2][3];
		for(int i=0; i<mathScores.length; i++) { //1차원배열의 크기 mathScores.length
			for(int k=0; k<mathScores[i].length; k++) { //2차원배열의 크기 mathScores[i].length
				System.out.println("mathScores["+i+"]["+k+"]="
						+mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][]; //2차원배열의 크기를 비워둠으로써 생성 시 지정하지 않음
		englishScores[0] = new int[2]; //1차원배열 [0]의 2차원배열의 크기 2
		englishScores[1] = new int[3]; //1차원배열 [1]의 2차원배열의 크기 3  -> 이런식으로 각각 따로 지정 가능
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]=" + englishScores[i][k]);
			}
		}
		System.out.println();		
		
		int[][] javaScores = { {95, 80}, {92, 96, 80} }; //초기화와 동시애 2차원 배열 형성
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]="
						+javaScores[i][k]);
			}
		}
		
		int[][] x2array01 = new int[2][];
		x2array01[0] = new int[4];
		x2array01[1] = new int[2];

		int[][] x2array02 = {{1, 2, 3},{10, 20}};
		
		int[][] x2array03 = new int[3][3];
		
		int[][] x2array04 = new int[2][];
		x2array04[0] = new int[1];
		x2array04[1] = new int[9];
		
		
		
		
		
	} 
}

