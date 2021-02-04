package com.cg.datatime;

import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class FormattingDate {

	public static void main(String[] args) {
		
		Date d=new Date();
		System.out.println(d.toString());
		
		
		/*	DateTimeFormatter is used to configure the date time format
			DateTimeFormatter can also be obtained by using ofPattern() 
			which you can use for custom date and time format
		 */
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		//Almost every class in java.time package provides format() method to format the date or time
		System.out.println(currentDate.format(formatter));
		
	}
}
