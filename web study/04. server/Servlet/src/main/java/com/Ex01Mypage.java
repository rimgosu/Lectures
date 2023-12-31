package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex01Mypage
 */
@WebServlet("/Ex01Mypage")
public class Ex01Mypage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		

		
		/*
		 * request:
		 * 페이지를 요청한 client의 ip 획득
		 *  
		 */
		String ip = request.getRemoteAddr();
		System.out.println(ip);

		/*
		 * response (응답 객체):
		 *  Web Page Text 및 Tag를 사용하기 위해서는 out객체 필요
		 * 
		 * 응답 객체에 인코딩 적용:
		 *  response.setCharacterEncoding("euc-kr");
		 */
		response.setCharacterEncoding("euc-kr");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		if (ip.equals("192.168.0.122")) {
			out.print("<h1> 짝꿍이를 환영합니다 - gosu</h1>");
			out.print("<img src = 'img.jpg'>");
		} else if (ip.equals("192.168.0.59")){
			out.print("<h1> 선생님 환영합니다 - gosu</h1>");
			out.print("<img src = 'img.jpg'>");
		} else {
			response.getWriter().println("<div style=\"font-size: 150px; width: 100%\">경고: 특정 IP 주소에 대한 접속 시도입니다.<br></div>");
			for (int i = 0 ; i< 10000; i++) {
				out.print("<img src = 'warning.jpg' style=\"width: 100%\"> <br>");
			}
			
		}
		out.print("<img src = 'img.jpg'>");
		
		out.print("</body>");
		out.print("</html>");
		
	}

}
