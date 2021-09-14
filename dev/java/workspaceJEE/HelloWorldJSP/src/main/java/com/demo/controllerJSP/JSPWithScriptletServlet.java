package com.demo.controllerJSP;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/scriptlet")
public class JSPWithScriptletServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/vue/jspWithScriptlet.jsp"

		).forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		doGet(request, response);
	}
}
