package com.example.uploadexcel;

import java.time.LocalTime;

public class M6 {
	public static void main(String[] args) {
		// time information
		LocalTime time = LocalTime.of(15, 30); // 15:30:00
		int hour = time.getHour(); // 15
		int second = time.getSecond(); // 0
		int minute = time.getMinute(); // 30
		int secondOfDay = time.toSecondOfDay(); // 55800		
	}
}
