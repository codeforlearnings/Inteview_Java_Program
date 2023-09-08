package com.example.uploadexcel;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class M8 {
	public static void main(String[] args) {
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println("tomorrow:" + tomorrow);
		
		// before 5 houres and 30 minutes
		LocalDateTime dateTime = LocalDateTime.now().minusHours(5).minusMinutes(30);
		System.out.println("dateTime:" + dateTime);
		
	}
}
