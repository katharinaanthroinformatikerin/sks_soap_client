package com.schallerl;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class PasswordAuthenticator {
	private PasswordAuthenticator() {}
	
	public static void install(String username, String password) {
		Authenticator.setDefault(new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password.toCharArray());
			}
		});
	}
}