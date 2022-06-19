package org.yoeda.poc.i18n.main;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleController {

	public void getLocale(String language, String country) {
		Locale locale = new Locale(language, country);
		
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayCountry());
	}
	
	public void getLocaleMessage(String language, String country) {
		Locale locale = new Locale(language, country);
		ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);
		
		String pattern = resourceBundle.getString("welcome.message");
		MessageFormat messageFormat = new MessageFormat(pattern);
		String format = messageFormat.format(new Object[] {"Yoeda", "Jakarta"});
		System.out.println(format);
	}
	
	public void getLocaleNumberFormat(String language, String country) {
		Locale locale = new Locale(language, country);
		
		NumberFormat numberFormat = NumberFormat.getInstance(locale);
		String format = numberFormat.format(10000.255);
		System.out.println(locale.getDisplayCountry()+": "+format);
	}
	
	//Standard ISO 4217 currency codes
	public void getLocaleCurrency(String language, String country, Number number) {
		Locale locale = new Locale(language, country);
		Currency currency = Currency.getInstance(locale);
		
		System.out.println(currency.getDisplayName());
		System.out.println(currency.getCurrencyCode());
		System.out.println(currency.getSymbol(locale));
		System.out.println(NumberFormat.getCurrencyInstance(locale).format(number));
	}
	
	public void getLocaleDateFormat(String language, String country) {
		Locale locale = new Locale(language, country);
		String pattern = "EEEE dd MMMM yyyy";
		DateFormat dateFormat = new SimpleDateFormat(pattern, locale);
		System.out.println(dateFormat.format(new Date()));
	}
	
	
	/**
	 * Message Format Pattern {ArgumentIndex, FormatType, FormatStyle}
	 * FormatType: number date time choice
	 * FormatStyle: short medium long full integer currency percent SubFormatPattern
	 * @param language
	 * @param country
	 */
	public void getLocaleMessageFornatType(String language, String country) {
		Locale locale = new Locale(language, country);
		ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);
		
		String pattern = resourceBundle.getString("status");
		MessageFormat messageFormat = new MessageFormat(pattern, locale);
		String format = messageFormat.format(new Object[] {"Yoeda", new Date(), 1000000.333});
		System.out.println(format);
	}
	
	/**
	 * Message FormatStyle Choice example
	 * @param language
	 * @param country
	 */
	public void getLocaleMessageFornatStyleChoice(String language, String country, Number number) {
		Locale locale = new Locale(language, country);
		ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);
		
		String pattern = resourceBundle.getString("balance");
		MessageFormat messageFormat = new MessageFormat(pattern, locale);
		String format = messageFormat.format(new Object[] {number});
		System.out.println(format);
	}
}
