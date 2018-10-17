package com.primetgi.org.dateValidation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateValidation {

	/*
	 * public static boolean isValidDate(String inDate) { SimpleDateFormat
	 * dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	 * dateFormat.setLenient(false); try { dateFormat.parse(inDate.trim()); }
	 * catch (ParseException pe) { return false; } return true; }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * System.out.println(isValidDate("2004-01-32"));
	 * System.out.println(isValidDate("2005-02-29")); }
	 */
	public static void main(String[] args) {
		checkDate();
	}

	public static boolean checkDate() {

		boolean isDateValid = false;
		String completeDate = "";
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter Year");
			String year = scanner.next();

			System.out.println("Enter Month");
			String month = scanner.next();

			System.out.println("Enter Date");
			String date = scanner.next();

			completeDate = year + "-" + month + "-" + date;
			System.out.println("Given Date : "+completeDate);

			isDateValid = isDateValid(completeDate);
		} while (!isDateValid);

		System.out.println("Correct Date");
		return true;
		

	}

	private static boolean isDateValid(String checkdate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		try {
			dateFormat.parse(checkdate.trim());
		} catch (ParseException e) {
			System.out.println("Invalid Date");
			return false;
		}
		return true;
	}
}
