package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex07RadioCheckBox
 */
@WebServlet("/Ex07RadioCheckBox")
public class Ex07RadioCheckBox extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("euc-kr");
//		String marriage = request.getParameter("marriage");
//		System.out.println(marriage);
		
		String[] hobbies = request.getParameterValues("hobby");
		if (hobbies != null) {
			for (String hobby : hobbies) {
				System.out.println(hobby);
			}
		}
	

	}

}

