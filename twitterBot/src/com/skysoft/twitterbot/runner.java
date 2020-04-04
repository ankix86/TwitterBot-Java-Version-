package com.skysoft.twitterbot; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class runner {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//when your not enter argument in program
		if(args.length < 1) {
			System.out.println("Usage: java twitter4j.com.skysoft.runner [text]");
			System.exit(-1);
		}
		try {
			ConfigurationBuilder cb = new ConfigurationBuilder();
			cb.setDebugEnabled(false);
			cb.setOAuthConsumerKey("*****************************");
			cb.setOAuthConsumerSecret("*****************************");
			cb.setOAuthAccessToken("*****************************");
			cb.setOAuthAccessTokenSecret("*****************************");
			TwitterFactory tf = new TwitterFactory(cb.build());
			Twitter twitter = tf.getInstance();
		
	
                Status status = twitter.updateStatus(br.readLine());
                System.out.println("Successfully updated the status to ["+status.getText()+"].");
                System.exit(-1);
                
		} catch (Exception ie) {
			ie.printStackTrace();
			System.out.println("Failed to read the system input");
			System.exit(-1);
			// TODO: handle exception
		}
	}
}
