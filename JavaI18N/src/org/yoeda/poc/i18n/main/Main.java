package org.yoeda.poc.i18n.main;

public class Main {

	public static void main(String[] args) {
		LocaleController localeController = new LocaleController();
		localeController.getLocale("id", "ID");
		System.out.println();
		localeController.getLocale("en", "US");
	}

}
