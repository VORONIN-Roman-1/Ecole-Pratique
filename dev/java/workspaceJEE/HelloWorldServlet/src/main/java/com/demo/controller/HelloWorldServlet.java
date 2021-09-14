package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet{
public void doGet( HttpServletRequest request, HttpServletResponse response )

throws ServletException, IOException {

PrintWriter out = response.getWriter();
response.setContentType("text/html");
out.println("<html>");
out.println(" <head>");
out.println(" <title>Hello World Servlet</title>");
out.println(" </head>");
out.println(" <body>");
out.println(" <h1>Hello World via Servlet</h1>");
out.println(" </body>");
out.println("</html>");
}
}