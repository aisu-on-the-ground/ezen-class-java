package ezen0809_APIs.sec07.exam01_constructor;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);

		String str = new String(bytes, 0, readByteNo-2);
		// -2인 이유는 엔터키도 13 10 이라는 두 가지 값을 가지기 때문.
		System.out.println(str);
	}
}
