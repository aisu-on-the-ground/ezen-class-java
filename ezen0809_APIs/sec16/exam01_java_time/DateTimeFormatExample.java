package ezen0809_APIs.sec16.exam01_java_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy�� M�� d�� a h�� m��");
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);
	}
}

