package com.hms.servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
import java.sql.*;  
    
import java.sql.Connection;

@WebServlet(urlPatterns = "/paymentInfoServlet")

public class paymentInfoServlet extends HttpServlet  
{    
     public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
      {  
         PrintWriter out = res.getWriter();  
         res.setContentType("text/html");  
         out.println("<html><body>");  
         try 
         {  
             
             Class.forName("org.mariadb.jdbc.Driver");

 			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/hms", "root", "root");
             
             
             Statement stmt = connection.createStatement();  
             ResultSet rs = stmt.executeQuery("select * from fee_verification");  
             out.println("<table border=1 width=50% height=50%>");  
             out.println("<tr><th>StudentId</th><th>Enroll</th><th>Name</th><th>Course</th><th>Year</th><th>Email</th><th>Receipt</th><tr>");  
             while (rs.next()) 
             {  
                 String n = rs.getString("cid");  
                 String nm = rs.getString("enroll");  
                 String s = rs.getString("sname");  
                 String np = rs.getString("course");  
                 String nt = rs.getString("year");  
                 String sp = rs.getString("email");
                 String st = rs.getString("receipt");
                 
                 
                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td><td>" + np + "</td><td>" + nt + "</td><td>" + sp + "</td><td>" + st + "</td></tr>");   
             }  
             out.println("</table>");  
             out.println("</html></body>");  
             connection.close();  
            }  
         
         
         
         
             catch (Exception e) 
            {  
             out.println("error");  
            }
         

 		

 		
      }
}