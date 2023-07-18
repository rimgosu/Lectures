package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax")
public class Ex01Ajax extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");
		
		String data = request.getParameter("data");
		String data2 = request.getParameter("data2"); 
		System.out.println("서버에 요청이 들어옴..!");
		System.out.println("넘겨받은 데이터 : " + data);
		System.out.println("넘겨받은 데이터 : " + data2);
		
		// 요청한 곳으로 데이터 응답해주기
		PrintWriter out = response.getWriter();
//		out.print("success!");
	}

}
