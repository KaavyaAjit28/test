package com.example.OttMedia;
import java.util.HashMap;
import java.util.Iterator;


public class Endcredits {
	
	 HashMap<String, String> gotcred = new HashMap<String, String>();
     HashMap<String, String> officecred = new HashMap<String, String>();
     HashMap<String, String> batmancred = new HashMap<String, String>();
     HashMap<String, String> hulkcred = new HashMap<String, String>();
     String mediaName;
     
     public Endcredits(String mediaName) {
		// TODO Auto-generated constructor stub
    	 this.mediaName = mediaName;
	}
     
     public void Endcreds(){
    	 
    	 if (mediaName.equals("Office")) {
    		 officecred.put("steve carell", "michael scott");
    	        officecred.put("john krasinski", "jim halpert");
    	        Iterator<String> itr = (officecred.keySet()).iterator();
    	        while(itr.hasNext()){
    	            String itr2= itr.next();
    	            System.out.println(itr2 + " as "+ officecred.get(itr2));
    	        }
    		 
    	 }
    	 
    	 else if(mediaName.equals("hulk")) {
    		 hulkcred.put("edward norton", "hulk");
    	     hulkcred.put("liv tyler", "betty ross");
    	     Iterator<String> itr = (hulkcred.keySet()).iterator();
    	     while(itr.hasNext()){
    	         String itr2= itr.next();
    	         System.out.println(itr2 + " as "+ hulkcred.get(itr2));
    	     }
    	 }
    	
    	 else if(mediaName.equals("GOT")) {
    		 gotcred.put("emilia clarke", "daenerys targaryen");
    	     gotcred.put("sophie turner", "sansa stark");
    	     Iterator<String> itr = (gotcred.keySet()).iterator();
    	     while(itr.hasNext()){
    	         String itr2= itr.next();
    	         System.out.println(itr2 + " as "+ gotcred.get(itr2));
    	     }
    	 }
    	 
    	 else if(mediaName.equals("batman")) {
    		 batmancred.put("robert pattinson", "batman");
    	     batmancred.put("zoe kravitz", "selina kyle");
    	     Iterator<String> itr = (batmancred.keySet()).iterator();
    	     while(itr.hasNext()){
    	         String itr2= itr.next();
    	         System.out.println(itr2 + " as "+ batmancred.get(itr2));
    	     }
    	 }
     }

  

}
