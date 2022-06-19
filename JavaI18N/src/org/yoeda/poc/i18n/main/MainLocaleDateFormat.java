package org.yoeda.poc.i18n.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class MainLocaleDateFormat {

	public static void main(String[] args) {
		LocaleController localeController = new LocaleController();
		localeController.getLocaleDateFormat("id", "ID");
		System.out.println();
		
		localeController.getLocaleDateFormat("en", "US");
		System.out.println();
		
		localeController.getLocaleDateFormat("ja", "JP");
		System.out.println();
		
		//parse Date Format
		Locale locale = new Locale("id", "ID");
		DateFormat dateFormat = new SimpleDateFormat("EEEE dd MMMM yyyy",locale);
		try {
			System.out.println(dateFormat.parse("Minggu 19 Juni 2022"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
