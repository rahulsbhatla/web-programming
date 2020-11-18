import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**

 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	   // Method to handle GET method request.
	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {

	      // Set response content type
	      response.setContentType("text/html");

	      PrintWriter out = response.getWriter();
	      String title = "Reading Form Data";
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

	      out.println(docType +
	         "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor = \"#FFFF99\" align = \"center\" style = \"font-size: 20px;\">\n" +
	               "<h1 align = \"center\">" + title + "</h1><br>\n" +
	               "<div>\n" +
	                  "  <div><b>First Name: </b></div> "
	                  + request.getParameter("firstName") + "\n" + "<br><br>" +
	                  "  <div><b>Last Name: </b></div> "
	                  + request.getParameter("lastName") + "\n" + "<br><br>" +
	                  "  <div><b>Gender: </b></div> "
	                  + request.getParameter("gender") + "\n" + "<br><br>" +
	                  "  <div><b>Email: </b></div> "
	                  + request.getParameter("email") + "\n" + "<br><br>" +
	                  "  <div><b>Password: </b></div> "
	                  + request.getParameter("password") + "\n" + "<br><br>" +
	                  "  <div><b>Phone number: </b></div> "
	                  + request.getParameter("number") + "\n" + "<br><br>" +
	               "</ul>\n" +
	            "</body>"+
	         "</html>"
	      );
	   }

	   // Method to handle POST method request.
	   public void doPost(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {

	      doGet(request, response);
	   }
	}