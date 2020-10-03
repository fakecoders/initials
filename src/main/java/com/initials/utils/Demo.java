package com.initials.utils;

import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  
public class Demo extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");//setting the content type  
PrintWriter pw=res.getWriter();//get the stream to write the data  
  
//writing html in the stream  
pw.println("<html><body>");  
pw.println("Welcome to servlet");  
pw.println(" <div lass=\"container\"> <h1>Hello</h1></div>\n" + 
		"       <div class=\"row\">\n" + 
		"      <div class=\"col s12\">This div is 12-columns wide on all screen sizes</div>\n" + 
		"      <div class=\"col s6\">6-columns (one-half)</div>\n" + 
		"      <div class=\"col s6\">6-columns (one-half)</div>");
pw.println("</body></html>");  
  
pw.close();//closing the stream  
}}  