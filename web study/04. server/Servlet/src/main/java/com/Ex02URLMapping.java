package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex02urlmapping
 */
@WebServlet("/Ex02")
public class Ex02URLMapping extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("euc-kr");
		System.out.println("Hello World");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<div>안녕하세용</div>");
		out.print("</body>");
		out.print("</html>");
	}

}
