package ezen0722.sec02.exam03_int;
public class IntExample {
	public static void main(String[] args) {
		int var1 = 10;		//10진수로 저장
		int var2 = 012;		//8진수로 저장
		int var3 = 0xA;		//16진수로 저장
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		int var4 = 01;
		int var5 = 011;
		System.out.println(var4);
		System.out.println(var5);
		
		int var6 = 120;
		String var6_bi = Integer.toBinaryString(var6);
		String var6_octal = Integer.toOctalString(var6);
		String var6_hex = Integer.toHexString(var6);
		
		System.out.println(var6_bi);
		System.out.println(var6_octal);
		System.out.println(var6_hex);
		
	}
}
