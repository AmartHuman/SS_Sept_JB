package com.ss.dateandtime;

import java.time.*;


public class DateAndTime {
	
	public static void main(String[] args) {
	LocalDateTime currentTime = LocalDateTime.now();
	
	Month month = currentTime.getMonth();
	int year = currentTime.getYear();
	
	System.out.println(year);
	
	for(int x = 1;x <= 12;x++) {
		LocalDate date = LocalDate.of(year, month.of(x),1);
		System.out.println(date.getMonth()+" : "+ date.lengthOfMonth());
		
		date.withDayOfMonth(2);
	}
	
	
	
	}
}
