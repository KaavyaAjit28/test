package com.example.OttMedia;
import java.time.*;
import java.util.*;

public class Movies implements VideoFile {
	List<String> CastCrew = new ArrayList<String>();
	LocalDate ReleaseDate;
	int ratings;
	String name;
	
	
	Movies(String name){
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public String playing() {
		return "movies are playing"; 
	}

	public String getMediaTypeott() {
		return "Movies";
	}

}
