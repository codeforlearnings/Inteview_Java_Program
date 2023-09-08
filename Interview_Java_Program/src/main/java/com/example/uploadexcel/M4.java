package com.example.uploadexcel;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

public class M4 {
	public static void main(String[] args) {
		LocalTime currentTimeInLosAngeles = LocalTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("currentTimeInLosAngeles:" + currentTimeInLosAngeles);
		ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");
		LocalTime currentTimeInKolkata = LocalTime.now(zoneid1);
		System.out.println("currentTimeInKolkata:" + currentTimeInKolkata);		
	    ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");  
	    LocalTime currentTimeInTokyo = LocalTime.now(zoneid2);
		System.out.println("currentTimeInTokyo:" + currentTimeInTokyo);	
	}
}
