package com.skysoft.twitterbot;

import java.util.List;

import twitter4j.JSONArray;
import twitter4j.JSONObject;
import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.User;

public class timeLine {
	public static void main(String[] args) {
		configurationB cb = new configurationB();
		
		try {
		Paging paging = new Paging(1,1);
		User user = cb.getTwitter().verifyCredentials();
		List<Status> statuses = cb.getTwitter().getHomeTimeline(paging);
//		System.out.println(statuses);
		
		for(Status status : statuses) {
			long id = status.getId();
			System.out.println("@"+status.getUser().getScreenName() +"=" + status.getText());
		//
			// cb.getTwitter().retweetStatus(Long.parseLong("1091548434434220032"));
			StatusUpdate statusUpdate = new StatusUpdate("hello "+status.getUser().getScreenName());
			
			statusUpdate.setInReplyToStatusId(status.getId());
			if("helloworld" == status.getText().toLowerCase()) {
				System.out.println("hello found in" + status.getId());
				
			}
			cb.getTwitter().updateStatus(statusUpdate);
			System.out.println("your last sattus succesfully deleted");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
