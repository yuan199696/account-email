package com.fan.mvnbook.account.account_email;

public interface AccountEmailService {
		
	void sendMail(String to,String subject,String htmlText)
			throws AccountEmailException;
}
