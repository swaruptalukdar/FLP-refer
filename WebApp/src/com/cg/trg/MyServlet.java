package com.cg.trg;

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
 * Servlet implementation class MyServlet
 */
@WebServlet(urlPatterns={"/MyServlet","Hello"},
			initParams={@WebInitParam(name="user",value="Reni"),
						@WebInitParam(name="city",value="Bangalore")},
			loadOnStartup=1)
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		ServletConfig config=getServletConfig();
		String name=config.getInitParameter("user");
		String city=config.getInitParameter("city");
		printWriter.println("Hello "+name);
		printWriter.println("city is "+city);
		
		ServletContext context=getServletContext();
		String name1=context.getInitParameter("param1");
		String city1=context.getInitParameter("param2");
		printWriter.println("\n\n\nParam1 "+name1+ " Param2 "+ city1);
		
		name1=context.getInitParameter("param3");
		city1=context.getInitParameter("param4");
		printWriter.println("\n\n\nParam3 "+name1+ " Param4 "+ city1);
	}

}
