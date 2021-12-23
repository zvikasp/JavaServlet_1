package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet(urlPatterns = { "/Servlet1" }, initParams = {
		@WebInitParam(name = "sql", value = "select * from employees"),
		@WebInitParam(name = "message", value = "Hello from Message attribute in Servlet 1") })
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet1() {
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
		out.print("<br><h1>Accessing Config Parameters in Servlet 1</h1>");
		out.print("sql = " + config.getInitParameter("sql"));
		out.print("<br/> Message = " + config.getInitParameter("message"));

		out.print("<br><h1>Accessing Context Parameters in Servlet 1</h1>");
		ServletContext application = getServletContext();
		out.print("Driver Name  = " + application.getInitParameter("driver"));
		out.print("<br> Url = " + application.getInitParameter("url"));
	}
}