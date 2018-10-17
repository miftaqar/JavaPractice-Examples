package com.primetgi.org.dateValidation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateValidationAfterOneWeek {

	public static void main(String[] args) throws ParseException {

		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		dateFormat.setLenient(false);
		
		Calendar calendar = Calendar.getInstance();
		
		// Set time fields to zero
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		
		
		Date currentDate = new Date();
		currentDate = calendar.getTime();
		
		System.out.println("Current Date : " + dateFormat.format(currentDate));

		calendar.add(Calendar.DAY_OF_YEAR, 7);
		Date dateAfterOneWeek = calendar.getTime();
		System.out.println("Date After One Week : "
				+ dateFormat.format(dateAfterOneWeek));

		System.out.println("Enter Year");
		String year = scanner.next();

		System.out.println("Enter Month");
		String month = scanner.next();

		System.out.println("Enter Date");
		String date = scanner.next();

		String completeDate = date + "-" + month + "-" + year;
		
		Date userDate = dateFormat.parse(completeDate);
		System.out.println(userDate);
		
		//validating the date
		if(userDate.compareTo(currentDate) >= 0 && userDate.compareTo(dateAfterOneWeek) <=0 ) {
			System.out.println("Date Is valid");
		} else {
			System.out.println("Date is invalid");
		}
	
	}
}
