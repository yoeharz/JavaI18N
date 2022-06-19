package org.yoeda.poc.i18n.main;

public class MainLocaleMessageChoce {

	public static void main(String[] args) {
		LocaleController localeController = new LocaleController();
		localeController.getLocaleMessageFornatStyleChoice("id", "ID", 1000000.333);
		System.out.println();
		localeController.getLocaleMessageFornatStyleChoice("id", "ID", 0);
		System.out.println();
		localeController.getLocaleMessageFornatStyleChoice("id", "ID", -1000000.333);
		System.out.println();
	}

}
