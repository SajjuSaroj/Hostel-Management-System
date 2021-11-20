package com.hms.servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
import java.sql.*;  
    
import java.sql.Connection;

@WebServlet(urlPatterns = "/StudentInfoServlet")

public class StudentInfoServlet extends HttpServlet  
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
             ResultSet rs = stmt.executeQuery("select * from application_form");  
             out.println("<table border=1 width=50% height=50%>");  
             out.println("<tr><th>StudentId</th><th>Name</th><th>DOB</th><th>Course</th><th>Year</th><th>Email</th><th>Address</th><th>Category</th><tr>");  
             if (rs.next()) 
             {  
                 String n = rs.getString("id");
                 String s = rs.getString("name"); 
                 String nm = rs.getString("dob");  
                 
                 String np = rs.getString("course");  
                 String nt = rs.getString("year");  
                 String sp = rs.getString("email");
                 String st = rs.getString("address");
                 String sk = rs.getString("category");
                 
                 
                 out.println("<tr><td>" + n + "</td><td>" + s + "</td><td>" + nm + "</td><td>" + np + "</td><td>" + nt + "</td><td>" + sp + "</td><td>" + st + "</td><td>" + sp + "</td></tr>");   
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