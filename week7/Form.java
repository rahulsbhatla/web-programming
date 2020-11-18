import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class Form extends HttpServlet {

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
                  + request.getParameter("fname") + "\n" + "<br><br>" +
                  "  <div><b>Last Name: </b></div> "
                  + request.getParameter("lname") + "\n" + "<br><br>" +
                  "  <div><b>Date of Birth: </b></div> "
                  + request.getParameter("dob") + "\n" + "<br><br>" +
                  "  <div><b>Telephone: </b></div> "
                  + request.getParameter("tel") + "\n" + "<br><br>" +
                  "  <div><b>Permanent Address: </b></div> "
                  + request.getParameter("addr") + "\n" + "<br><br>" +
                  "  <div><b>College Name: </b></div> "
                  + request.getParameter("col") + "\n" + "<br><br>" +
                  "  <div><b>Year: </b></div> "
                  + request.getParameter("year") + "\n" + "<br><br>" +
                  "  <div><b>Email: </b></div> "
                  + request.getParameter("email") + "\n" + "<br><br>" +
                  "  <div><b>Course Name: </b></div> "
                  + request.getParameter("course") + "\n" + "<br><br>" +
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