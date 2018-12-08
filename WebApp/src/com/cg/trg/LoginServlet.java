package com.cg.trg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/LoginServlet"},
initParams={@WebInitParam(name="user",value="swarup"),
		@WebInitParam(name="password", value="abcd")}
)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("uname");
		String password=request.getParameter("pwd");
		String u=getServletConfig().getInitParameter("user");
		String p=getServletConfig().getInitParameter("password");
		PrintWriter out=response.getWriter();
		if(userName.equals(u) && password.equals(p))
		{
			//response.sendRedirect("success.html");
			/*ServletContext context=getServletContext();
			RequestDispatcher rd= context.getRequestDispatcher("/success.html");
			rd.forward(request, response);*/
			out.println("<h1> Welcome "+userName+"</h1>");
			
			// hidden form field
			/*out.println("<form method='post' action='GreetServlet'>");
			out.println("<input type='hidden' value='"+userName+"' name='uname'/>");
			out.println("<input type='submit' value='Greet'/>");
			out.println("</form>");*/
			out.println("<a href='GreetServlet?uname="+userName+"'>Greet</a>");
		}
		else
		{
			//response.sendRedirect("error.html");
			RequestDispatcher rd= request.getRequestDispatcher("error.html");
			rd.forward(request, response);
		}
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	

}
