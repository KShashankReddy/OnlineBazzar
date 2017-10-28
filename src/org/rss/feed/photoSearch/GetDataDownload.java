package org.rss.feed.photoSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetDataDownload
 */
@WebServlet("/GetDataDownload")
public class GetDataDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetDataDownload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

	      response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + "this test to myself" + "</h1>");
	      //downloadData();
	      URL url;
    	  try {
  			url = new URL("http://www.oracle.com/");
  			URLConnection con = url.openConnection();
  			BufferedReader in = new BufferedReader(new InputStreamReader(
  	                con.getInputStream()));
  	         String inputLine;
  	         while ((inputLine = in.readLine()) != null) 
  	             out.println(inputLine);
  	         in.close();
  		} catch (Exception e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
		
	}
	
      void downloadData(){
    	  
  	    
      }

}
