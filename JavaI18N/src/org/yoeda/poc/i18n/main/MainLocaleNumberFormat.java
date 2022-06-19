package org.yoeda.poc.i18n.main;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class MainLocaleNumberFormat {

	public static void main(String[] args) {
		LocaleController localeController = new LocaleController();
		localeController.getLocaleNumberFormat("id", "ID");
		System.out.println();
		localeController.getLocaleNumberFormat("en", "US");
		System.out.println();
		localeController.getLocaleNumberFormat("ja", "JP");
		System.out.println();
		
		//Untuk melakukan parse number
		Locale locale = new Locale("id", "ID");
		try {
			System.out.println(NumberFormat.getInstance(locale).parse("10.000,255").doubleValue());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
