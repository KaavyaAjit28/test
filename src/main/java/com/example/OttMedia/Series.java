package com.example.OttMedia;
import java.time.LocalDate;
import java.util.*;

public class Series implements VideoFile{
	
	String name;
    int episode;
	int season;
	String charName;
	LocalDate NextEpisodeDate;
	HashMap<String, String> favNames = new HashMap<String, String> ();
	
    Series(String name){
		this.name=name;
	}
    
	
	public String getname() {
		return name;
	}
	public String playing() {
		return "series is playing";
		
	}
	public String getMediaTypeott() {
		return "Series";
	}
	
	
	

}

