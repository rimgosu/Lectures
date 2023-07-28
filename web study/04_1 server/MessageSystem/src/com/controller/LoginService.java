package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.MemberDAO;
import com.model.MemberDTO;

/**
 * Servlet implementation class LoginService
 */
@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		
		MemberDTO dto = new MemberDTO(email, pw);
		MemberDAO dao = new MemberDAO();
		
		MemberDTO info = dao.login(dto);
		
		if (info != null) {
			System.out.println("로그인 성공!");
			System.out.println(info.toString());
			
			//세션에 로그인 정보 저장; 세션은 서버에 있는 영역
			HttpSession session = request.getSession();
			session.setAttribute("info", info);
			
		} else {
			System.out.println("로그인 실패..");
		}
		
		response.sendRedirect("main.jsp");
		
	}

}
