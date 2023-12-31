package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex08Join
 */
@WebServlet("/Ex08Join")
public class Ex08Join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("euc-kr");
		response.setCharacterEncoding("euc-kr");
		String upper ="""
				<html><body>
				""";
		String lower ="""
				</body></html>
				""";
		
		
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String birthday = request.getParameter("birthday");
		String color = request.getParameter("color");
		String country = request.getParameter("select");
		String talk = request.getParameter("talk");
		
		PrintWriter out = response.getWriter();
		
		out.print(upper);
		out.print("ID : "+id + "<br>");
		out.print("NAME : "+name + "<br>");
		out.print("EMAIL : "+email + "<br>");
		out.print("TEL : "+tel + "<br>");
		out.print("GENDER : "+gender + "<br>");
		out.print("COUNTRY : "+country + "<br>");
		out.print("BIRTH : "+birthday + "<br>");
		out.print("COLOR : "+color + "<br>");
		out.print("HOBBY : ");
		try {
			for (String h : hobby) {
				out.print(h+" ");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		out.print("<br>TALK : " + talk );
		out.print(lower);
		out.close();
	}

}
