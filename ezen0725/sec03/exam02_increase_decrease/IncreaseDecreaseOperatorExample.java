package ezen0725.sec03.exam02_increase_decrease;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------------------");
		x++; //10   ���׿�����(++)�� �ڿ� ������ ���� ���� ���� ���� �����ϰ� ���� ���꿡 +1 (x�� ��𼱰� ������ �� �� �� ���� ����)
		++x; //12
		System.out.println("x=" + x);		

		System.out.println("-----------------------");		
		y--; //10
		--y; //8
		System.out.println("y=" + y);		

		System.out.println("-----------------------");		
		z = x++;
		System.out.println("z=" + z); //12 ������� 12�̰� �� �Ŀ� +1
		System.out.println("x=" + x); //13
		
		System.out.println("-----------------------");		
		z = ++x;
		System.out.println("z=" + z); //14
		System.out.println("x=" + x); //14
		
		System.out.println("-----------------------");				
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}

