package com.skysoft.twitterbot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class statusUpdate {
public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			ConfigurationBuilder cb = new ConfigurationBuilder();
			cb.setDebugEnabled(false);
			cb.setOAuthConsumerKey("QUvSp5hpHvwrQnXW6IurxH35i");
			cb.setOAuthConsumerSecret("orGufYjSgT2VdF9kmMQE4RuOqCwLaU93XlWqAwEhpVObarnskc");
			cb.setOAuthAccessToken("1061260523138768897-iBMy4K9IdkCcJYpjdpholJOzDg00r0");
			cb.setOAuthAccessTokenSecret("3kpF3Kf0gN7idwMw4XblLqfQ5ytZlAb1hYi5KnaOMNpBv");
			
			TwitterFactory tf = new TwitterFactory(cb.build());
			Twitter twitter = tf.getInstance();
       
			try {	
			Status status = twitter.updateStatus(br.readLine());
			System.out.println("Successfully updated the status to ["+status.getText()+"].");
            System.exit(-1);
			}catch(TwitterException tw) {
				tw.printStackTrace();
				System.exit(-1);
			}
		} catch (Exception ie) {
			ie.printStackTrace();
			System.out.println("Failed to read the system input");
			System.exit(-1);
			// TODO: handle exception
		}
	}

}
