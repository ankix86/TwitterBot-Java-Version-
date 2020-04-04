package com.skysoft.twitterbot;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class configurationB {
	private TwitterFactory tf;
	private Twitter twitter;
	private BufferedReader br;
	
	public configurationB() {
		br = new BufferedReader(new InputStreamReader(System.in));
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(false);

		//Replace This Api key
		cb.setOAuthConsumerKey("**********************");
		cb.setOAuthConsumerSecret("***********************");
		cb.setOAuthAccessToken("************************");
		cb.setOAuthAccessTokenSecret("****************");
	
		tf = new TwitterFactory(cb.build());
		twitter = tf.getInstance();		
	}
	public Twitter getTwitter() {
		return twitter;
	}
	public TwitterFactory getTwitterFactory() {
		return tf;
	}
	public BufferedReader useBufferedReader() {
		return br;
	}
}
