package com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {

	public static void main(String[] args) {

		DateFormat dfZONE = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a Z");
		DateFormat dfYMD = new SimpleDateFormat("yyyy-MM-dd");

		try {

		String dateText = "Dec 1, 2014 12:45:19 AM PST";
		Date dt;
			dt = dfZONE.parse(dateText);
		String POST_DATE	= dfYMD.format(dt).toString();
		System.out.println("date= " + POST_DATE);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
