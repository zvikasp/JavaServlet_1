package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		PrintWriter out = response.getWriter();
		out.print("<br><h1>Accessing Config Parameters in Servlet 2</h1>");
		out.print("sql = " + config.getInitParameter("sql"));
		out.print("<br/> Message = " + config.getInitParameter("message"));

		out.print("<br><h1>Accessing Context Parameters in Servlet 2</h1>");
		ServletContext application = getServletContext();
		out.print("Driver Name  = " + application.getInitParameter("driver"));
		out.print("<br> Url = " + application.getInitParameter("url"));
	}
}