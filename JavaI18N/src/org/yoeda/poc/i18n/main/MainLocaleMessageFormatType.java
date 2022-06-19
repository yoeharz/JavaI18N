package org.yoeda.poc.i18n.main;

public class MainLocaleMessageFormatType {

	public static void main(String[] args) {
		LocaleController localeController = new LocaleController();
		localeController.getLocaleMessageFornatType("id", "ID");
		System.out.println();
		localeController.getLocaleMessageFornatType("en", "US");
		System.out.println();
		localeController.getLocaleMessageFornatType("ja", "JP");
		System.out.println();
	}

}
