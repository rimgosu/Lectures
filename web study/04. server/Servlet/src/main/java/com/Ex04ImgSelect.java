package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex04ImgSelect
 */
@WebServlet("/Ex04ImgSelect")
public class Ex04ImgSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String selects = request.getParameter("select");
		System.out.println(selects);
		PrintWriter out = response.getWriter();
		String imgName;
		String upper = """
		<html>
		<body>
		""";
		String lower = """
		</html>
		</body>
		""";
		
		out.print(upper);
		
		if (selects.equals("1")) {
			imgName = "img1.gif";
		} else if (selects.equals("2")) {
			imgName = "img2.gif";
		} else {
			imgName = "img3.gif";
		}
		out.print("<div><image src=\"imgs/"+imgName+"\"></div>");
		out.print(lower);
		
	}

}
