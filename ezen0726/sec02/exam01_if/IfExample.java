package ezen0726.sec02.exam01_if;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
		}
		
		if(score< 90) 
			System.out.println("������ 90���� �۽��ϴ�."); // ���� ���⶧���� ù�ٱ����� if���� ����
			
		System.out.println("����� B �Դϴ�."); // if���� ������ ��
	}
}
