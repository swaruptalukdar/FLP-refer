package com.cg.trg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SimpleServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("Welcome to Simple Servlet...");
		out.println("<table> <tr><td>name:</td><td><input type=text/></td></tr>");
		out.println("<tr><td></td><td><input type=submit value=Submit></td></tr><table>");
		ServletConfig config=getServletConfig();
		String name=config.getInitParameter("myname");
		String city=config.getInitParameter("city");
		out.println("\n\n\nHello "+name+ " you are from the city "+ city);
		
		
		ServletContext context=getServletContext();
		String name1=context.getInitParameter("param1");
		String city1=context.getInitParameter("param2");
		out.println("\n\n\nParam1 "+name1+ " Param2 "+ city1);
		
		name1=context.getInitParameter("param3");
		city1=context.getInitParameter("param4");
		out.println("\n\n\nParam3 "+name1+ " Param4 "+ city1);
	}

	
	

}
