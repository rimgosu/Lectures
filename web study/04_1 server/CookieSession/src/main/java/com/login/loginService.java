package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginService")
public class loginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		session.setAttribute("id", id);
		session.setAttribute("pw", pw);
		
		String sessionId = (String)session.getAttribute("id");
		String sessionPw = (String)session.getAttribute("pw");
		
		System.out.println("loginService here");
		
		if (sessionId.equals("test") && sessionPw.equals("12345")) {
			response.sendRedirect("ex05login/main.jsp");
		} else {
			response.sendRedirect("ex05login/loginForm.html");
		}
		
	}

}
