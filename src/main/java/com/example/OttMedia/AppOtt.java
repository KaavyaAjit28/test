package com.example.OttMedia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppOtt 
{
	public static void main(String[] args) {
		//Subscribers sub1 = new Subscribers();
		//sub1.checkPlan("movies only");

		ApplicationContext context = new ClassPathXmlApplicationContext("springottmedia.xml");


		VideoFile media1= (VideoFile)context.getBean("series1", VideoFile.class);
		VideoFile media2= (VideoFile)context.getBean("series2", VideoFile.class);
		VideoFile media3= (VideoFile)context.getBean("movie1", VideoFile.class);
		VideoFile media4= (VideoFile)context.getBean("movie2", VideoFile.class);

        /*System.out.println(media1.getMediaTypeott());
		System.out.println(media2.getMediaTypeott());
		System.out.println(media3.getMediaTypeott());
		System.out.println(media4.getMediaTypeott());*/


		Subscribers sub1= (Subscribers)context.getBean("sub", Subscribers.class);
		sub1.checkPlan("series only");
		sub1.nowPlaying(media1);
		sub1.nowPlaying(media2);
		sub1.nowPlaying(media3);
		sub1.nowPlaying(media4);

		System.out.println("******************************");

		Subscribers sub2= (Subscribers)context.getBean("sub", Subscribers.class);
		sub2.checkPlan("movies only");
		sub2.nowPlaying(media1);
		sub2.nowPlaying(media2);
		sub2.nowPlaying(media3);
		sub2.nowPlaying(media4);

		System.out.println("******************");
		System.out.println("hi");
		Endcredits ec = (Endcredits)context.getBean("ec", Endcredits.class);

		//
		ec.Endcreds();

	}

}
