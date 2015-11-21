package com.uom.azd;

import javax.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;



@WebServlet("/registers")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		response.setContentType("text/html");  
            PrintWriter pw = response.getWriter();    
            Connection conn=null;
       
      try{  
    	  
          String Fname = request.getParameter("fname");  
          String Mname = request.getParameter("mname");  
          String Lname = request.getParameter("lname");  
          String Uname = request.getParameter("username");  
          String Emailid = request.getParameter("emailid");  
          String Mobno = request.getParameter("mobno");  
          String Address = request.getParameter("address");  
          String Password1 = request.getParameter("password1");  
          String Password2 = request.getParameter("password2");  

          Class.forName("com.mysql.jdbc.Driver"); 
          if(conn==null)
          {
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","");
          }
          
          
         String sql="INSERT INTO registertable(Fname,Mname,Lname,Uname,Emailid,Mobno,Address,Password1,Password2) VALUE(?,?,?,?,?,?,?,?,?);";

          PreparedStatement pst =(PreparedStatement) conn.prepareStatement(sql);

          pst.setString(1,Fname);  
          pst.setString(2,Mname);        
          pst.setString(3,Lname);
          pst.setString(4,Uname);
          pst.setString(5,Emailid);
          pst.setString(6,Mobno);
          pst.setString(7,Address);
          pst.setString(8,Password1);
          pst.setString(9,Password2);

          pst.execute();
       
          pst.close();
        }  
        catch (SQLException ed){  
        	ed.printStackTrace();
        
        } 
      catch (ClassNotFoundException ex){  
    	  ex.printStackTrace();
        }
     
      }}


