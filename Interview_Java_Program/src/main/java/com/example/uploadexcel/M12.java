package com.example.uploadexcel;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class M12 {
	public static void main(String[] args) {
		ZoneId indian = ZoneId.of("Asia/Kolkata");
		ZoneId losAngeles = ZoneId.of("America/Los_Angeles");
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		ZonedDateTime indianDateTime = ZonedDateTime.of(LocalDateTime.now(), indian);
		System.out.println("indianDateTime:" + indianDateTime);
		ZonedDateTime tokyoDateTime = indianDateTime.withZoneSameInstant(tokyo);
		System.out.println("tokyoDateTime:" + tokyoDateTime);		
		ZonedDateTime losAngelesDateTime = indianDateTime.withZoneSameInstant(losAngeles);
		System.out.println("losAngelesDateTime:" + losAngelesDateTime);		
	}
}
