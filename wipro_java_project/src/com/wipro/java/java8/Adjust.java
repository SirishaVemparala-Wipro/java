/**
 * 
 */
package com.wipro.java.java8;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

/**
 * 
 */
public class Adjust {

	/**
	 * 
	 */
	
	public static void checkingAdjusters() {
		// TODO Auto-generated method stub
		//current date
		LocalDate date=LocalDate.now();
		System.out.println("The current date is "+date);
		//current time
		LocalTime time=LocalTime.now();
		System.out.println("Current time is:"+time);
		//first day of next month
		LocalDate dayOfNextMonth=date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First day of next month: "+dayOfNextMonth);
		//get the next saturday
		LocalDate nextSaturday=date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Next saturday from now is: "+nextSaturday);
		//first day of current month
		LocalDate firstDay=date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("first day of month: "+firstDay);
		//last day of current month
		LocalDate lastDay=date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("last day of month:"+lastDay);

	}
	//Driver code
	public static void main(String a[]) {
		checkingAdjusters();
	}
}

