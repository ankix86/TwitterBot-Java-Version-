package com.skysoft.testing;

import com.google.gson.Gson;

public class gson {
	
	public static void main(String[] args) {
		deserializeData();
	}
	public static void serializeData() {
		data d = new data("AngryBird",0,true);
		Gson gson = new Gson();
		String json = gson.toJson(d);
		System.out.println(json);
	}
	public static void deserializeData() {
		String jsonFormat = "{'name':'DeadRace','price':700.0,'isAwesome':true}";
		Gson gson = new Gson();
		data d = gson.fromJson(jsonFormat,data.class);
		System.out.println("name :"+d.name + "\nprice:"+d.price + "\nisAwesome :"+d.isAwesome);
	}
}
