package org.rss.feed.photoSearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class DataDownload{
	public void getData(){
		
	URL url;
	try {
		url = new URL("http://www.oracle.com/");
		URLConnection con = url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(
                con.getInputStream()));
         String inputLine;
         while ((inputLine = in.readLine()) != null) 
             System.out.println(inputLine);
         in.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	}
} 
