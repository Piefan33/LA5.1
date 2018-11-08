package edu.wmich.cs1120.LA5.MPortis.JWarren;

import java.util.Formatter;

public class PhoneNumberFormatException extends Exception{
	public PhoneNumberFormatException(String name) {
		// TODO Auto-generated constructor stub
	}
	String phoneClean="";
	String phone="(";
	for(int i=0; i<phoneNumber.length(); i++) {
		if(Character.isDigit(phoneNumber.charAt(i))) {
			phoneClean.concat(phoneNumber).charAt(i);
		}
	}
	for(int i=0; i<phoneNumber.length(); i++) {
		if(i==4) {
			phone.concat(")-");
		}else if(i==7) {
			phone.concat("-");
		}
		if(Character.isDigit(phoneNumber.charAt(i))) {
			phone.concat(phoneNumber).charAt(i);
		}
	}
	System.out.println(phoneNumber);
}
