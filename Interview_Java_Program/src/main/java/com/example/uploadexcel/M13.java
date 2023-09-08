package com.example.uploadexcel;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;



public class M13 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		Instant instant = Instant.now();
		System.out.println(instant);   //  https://savvytime.com/converter/z-to-ist
	}
}
