package com.skysoft.twitterbot;

import java.util.List;

import twitter4j.DirectMessage;
import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.User;

public class getMension {
	public static void main(String[] args) {
		configurationB cb = new configurationB();
		Paging p = new Paging(1);
	
		try {
			User user = cb.getTwitter().verifyCredentials();
			String checker = "@" + user.getScreenName()+" "+"Hello";
			System.out.println(user.getId());
			DirectMessage dm = cb.getTwitter().showDirectMessage();
			System.out.println(dm.getText());
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	
