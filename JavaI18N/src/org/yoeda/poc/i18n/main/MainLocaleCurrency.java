package org.yoeda.poc.i18n.main;

public class MainLocaleCurrency {

	public static void main(String[] args) {
		LocaleController localeController = new LocaleController();
		localeController.getLocaleCurrency("id", "ID", 1000000.333);
		System.out.println();
		localeController.getLocaleCurrency("en", "US", 1000000.333);
		System.out.println();
		localeController.getLocaleCurrency("ja", "JP", 1000000.333);
		System.out.println();
	}

}
