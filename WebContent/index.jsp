<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.net.URL"%>
<%@page import="java.net.URLConnection"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.InputStreamReader"%>
    <
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script language='Javascript' src='http://www.rss2java.com/feed.php?number=0&date=1&desc=1&html=1&new=1&url=https%3A%2F%2Fapi.flickr.com%2Fservices%2Ffeeds%2Fphotos_public.gne%3Fformat%3Djson%26nojsoncallback%3D%3Fhttps%3A%2F%2Fapi.flickr.com%2Fservices%2Ffeeds%2Fphotos_public.gne%3Fformat%3Djson%26nojsoncallback%3D%3F'>
</script>
<noscript><a href='http://www.rss2java.com/' target=_blank>RSS2JAVA</a></noscript>
</head>
<body>
<form action="GetDataDownload" method="post">
<button type="button" value="">click to get data</button>
</form>
<%
URL url;
try {
	url = new URL("http://www.tutorialspoint.com/servlets/servlets-first-example.htm");
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

%>

</body>
</html>