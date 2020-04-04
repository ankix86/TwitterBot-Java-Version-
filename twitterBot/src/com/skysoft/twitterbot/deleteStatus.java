package com.skysoft.twitterbot;
import java.io.IOException;
import twitter4j.TwitterException;

public class deleteStatus {
	
	public static void main(String[] args) throws NumberFormatException, TwitterException, IOException {
		configurationB cb = new configurationB();	
		try { 
		System.out.println("Enter Status id the you want to delete");
		cb.getTwitter().destroyStatus(Long.parseLong(cb.useBufferedReader().readLine()));
		System.out.println("your status sucessfully Deletd");
		System.exit(-1);
		}
		catch(TwitterException tw) {
			tw.printStackTrace();
			System.out.println("check status or id or your status is allredy deleted");
			System.exit(-1);
		}
	}
}
