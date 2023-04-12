package com.example.OttMedia;



public class Subscribers {
	int id;
	String name;
	String plan;
	
	
	
	public void checkPlan (String plan) {
		this.plan=plan;
		
		if(plan.equals("series only")){
			System.out.println("series are accessible"); 
		}
		else if (plan.equals("movies only")) {
			System.out.println("movies are accessible"); 
			
		}
		else if(plan.equals("both")) {
			System.out.println("Both series and movies are accessible"); 
			
		}
	}
	
	public void nowPlaying(VideoFile m) {
		
		if((plan.equals("series only") || plan.equals("both")) && m.getMediaTypeott().equals("Series")) {
			System.out.println(m.getname() +" is playing");
			
		}
		else if((plan.equals("movies only") || plan.equals("both")) && m.getMediaTypeott().equals("Movies")) {
			System.out.println(m.getname() +" is playing");
			
		}
		else {
			System.out.println("No access");
		}
	}
	
}