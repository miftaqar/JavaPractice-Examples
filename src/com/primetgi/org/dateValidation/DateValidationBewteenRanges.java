package com.primetgi.org.dateValidation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValidationBewteenRanges {
	public static void main(String[] args) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			sdf.setLenient(false);

			Date d1 = sdf.parse("01-12-2015");
			Date d2 = sdf.parse("1-12-2015");
			Date d3 = sdf.parse("05-12-2015");

			if (d2.compareTo(d1) >= 0) {
				if (d2.compareTo(d3) <= 0) {
					System.out.println("d2 is in between d1 and d3");
				} else {
					System.out.println("d2 is NOT in between d1 and d3");
				}
			} else {
				System.out.println("d2 is NOT in between d1 and d3");
			}

		} catch (ParseException pe) {
			pe.printStackTrace();
		}
	}
}
