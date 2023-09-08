package com.example.uploadexcel;

import java.time.LocalTime;

public class M2 {
	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now(); // current time
		System.out.println("currentTime:" + currentTime);
		LocalTime midday = LocalTime.of(12, 0); // 12:00
		System.out.println("midday:" + midday);
		LocalTime afterMidday = LocalTime.of(13, 30, 15); // 13:30:15
		System.out.println("afterMidday:" + afterMidday);
		// 12345th second of day (03:25:45)
		LocalTime fromSecondsOfDay = LocalTime.ofSecondOfDay(12345);
		System.out.println("fromSecondsOfDay:" + fromSecondsOfDay);
			
	}
}
