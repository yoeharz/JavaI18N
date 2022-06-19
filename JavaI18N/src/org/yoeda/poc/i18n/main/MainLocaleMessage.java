package org.yoeda.poc.i18n.main;

public class MainLocaleMessage {

	public static void main(String[] args) {
		LocaleController localeController = new LocaleController();
		localeController.getLocaleMessage("id", "ID");
		System.out.println();
		localeController.getLocaleMessage("en", "US");
		System.out.println();
		localeController.getLocaleMessage("ja", "JP");
	}

}
