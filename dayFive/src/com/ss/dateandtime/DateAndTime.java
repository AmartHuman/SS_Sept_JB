package com.ss.dateandtime;

import java.time.*;
import java.time.temporal.TemporalAdjusters;





public class DateAndTime {
	
	public static void main(String[] args) {
	LocalDateTime currentTime = LocalDateTime.now();
	
	System.out.println("1.)");
	Month month = currentTime.getMonth();
	int year = currentTime.getYear();
	
	System.out.println(year);
	
	for(int x = 1;x <= 12;x++) {
		LocalDate date = LocalDate.of(year, month.of(x),1);
		System.out.println(date.getMonth()+" : "+ date.lengthOfMonth());
		date.withDayOfMonth(2);
	}
	LocalDate date2 = Year.now().atMonth(month).atDay(1);
	
	System.out.println("\n2)");
	System.out.println("\nMondays");
	date2 = date2.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
	while(date2.getMonth() == month) {
		System.out.println(date2);
		date2 = date2.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
	}
	
	
	
	System.out.println("\n\n\n");
	date2 = date2.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
	while(date2.getYear() == 2019) {
		if(date2.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)) != null) {
		System.out.print("Firday the 13!");	
		}
		System.out.println(date2);
		date2 = date2.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
	}
	//LocalDate date2 = LocalDate.of(2019, month.SEPTEMBER, DayOfWeek.FRIDAY);
	
	
	
	}
}
