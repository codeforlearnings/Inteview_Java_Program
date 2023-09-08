package com.example.uploadexcel;

import java.time.LocalDateTime;
import java.time.Month;

public class M3 {
	public static void main(String[] args) {
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("currentDateTime:" + currentDateTime);
		// 2014-10-02 12:30
		LocalDateTime secondAug2014 = LocalDateTime.of(2014, 10, 2, 12, 30);
		System.out.println("secondAug2014:" + secondAug2014);
		// 2014-12-24 12:00
		LocalDateTime christmas2014 = LocalDateTime.of(2014, Month.DECEMBER, 24, 12, 0);
		System.out.println("christmas2014:" + christmas2014);
	}
}
