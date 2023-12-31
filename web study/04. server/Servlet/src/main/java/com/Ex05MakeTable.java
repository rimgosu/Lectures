package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex05MakeTable
 */
@WebServlet("/Ex05MakeTable")
public class Ex05MakeTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String upper = """
			<html>
			<body>
			<table border="1px solid black">
			<tr>
			""";
		String lower = """
			</tr>
			</table>
			</body>
			</html>
			""";
		String room = request.getParameter("room");
		PrintWriter out = response.getWriter();
		int roomNumber = Integer.parseInt(room);
		
		out.print(upper);
		for (int i=1 ; i <= roomNumber; i++) {
			out.print("<td>" + i + "</td>");
		}
		out.print(lower);
		
	}

}
