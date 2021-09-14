package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Utilisateur extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		
		String nom = "Utilisateur";
		int age = 20;
		String[] tab = {"Jurassic Park", "Star Wars", "Retour vers le futur"};
		
		
		out.println("<html>");
		out.println(" <head>");
		out.println(" <title>Hello World Servlet</title>");
		out.println(" </head>");
		out.println(" <body>");
		out.println(" <h1>Hello World via Servlet</h1>");
		out.println("<p>Hello " + nom+ "</p>");
		String s= age>18?"Tu es majeur":"Tu es mineur" ;
		out.println("<p>"+s+"</p>");
		/*out.println("<table>\r\n"
				+ "    <thead>\r\n"
				+ "        <tr>\r\n"
				+ "            <th colspan=\"3\">Films</th>\r\n"
				+ "        </tr>\r\n"
				+ "    </thead>\r\n"
				+ "    <tbody>\r\n"
				+ "        <tr>\r\n"
				+ "            <td>"+tab[0]+"</td>\r\n"
				+ "            <td>"+tab[1]+"</td>\r\n"
				+ "            <td>"+tab[2]+"</td>\r\n"
				+ "        </tr>\r\n"
				+ "    </tbody>\r\n"
				+ "</table>");
		*/
			out.println("<table style=\"border: kk2px solid #333\";><tr>");
			for (String film : tab) {
				out.println("<td style=\"border: 1px solid #333\">"+film+"</td>");
			}
			out.println("</tr>   </tbody>    </table>");
 
		out.println(" </body>");
		out.println("</html>");
		
		
		
	}

}
