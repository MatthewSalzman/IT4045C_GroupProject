package com.quickpass;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quickpass.dao.PasswordDAO;

//Taken from https://www.codejava.net/java-ee/servlet/handling-html-form-data-with-java-servlet
	@WebServlet("/addPassword")
	public class addPassword extends HttpServlet {
	 
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException {
	 
	        String username = request.getParameter("Username");
	        String url = request.getParameter("URL");
	        String password = request.getParameter("Password");
	        String retypePassword = request.getParameter("RetypePassword");
	        String securityQuestion = request.getParameter("SecQ");
	        
	        // get response writer
          PrintWriter writer = response.getWriter();
          String htmlRespone = "<html>";
	        if(password != retypePassword)
	        {
	        	htmlRespone += "<h2>Passwords did not match</h2>";
	        }
	        else
	        {
	        	PasswordDAO model = new PasswordDAO(username,url,password,securityQuestion);
	        	//Save model to database
	            htmlRespone += "<h2>Password successfully saved</h2>";
	            
	        }
	        htmlRespone += "</html>";
	        writer.println(htmlRespone);
	 
	    }
	 
	}