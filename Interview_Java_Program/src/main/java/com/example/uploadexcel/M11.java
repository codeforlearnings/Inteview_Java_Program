package com.example.uploadexcel;

import java.time.ZoneId;
import java.util.Set;

public class M11 {
	public static void main(String[] args) {
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		System.out.println(allZoneIds);
	}
}
