package com.example.uploadexcel;

import java.time.LocalDate;
import java.time.Year;

public class M7 {
	public static void main(String[] args) {
		Year currentYear = Year.now();
		Year twoThousand = Year.of(2000);
		boolean isLeap = currentYear.isLeap(); // false
		int length = currentYear.length(); // 365
		// sixtyFourth day of 2014 (2014-03-05)
		LocalDate date = Year.of(2014).atDay(64);		
	}
}
