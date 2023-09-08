package com.example.uploadexcel;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class M9 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2014, Month.FEBRUARY, 25); // 2014-02-25
		// first day of february 2014 (2014-02-01)
		LocalDate firstDayOfMonth = date.with(TemporalAdjusters.firstDayOfMonth());
		// last day of february 2014 (2014-02-28)
		LocalDate lastDayOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(date);
		System.out.println(firstDayOfMonth);
		System.out.println(lastDayOfMonth);		
	}
}
