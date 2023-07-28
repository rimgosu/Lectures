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
 * Servlet implementation class updateService
 */
@WebServlet("/updateService")
public class updateService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	      
	      request.setCharacterEncoding("EUC-KR");
	      HttpSession session = request.getSession();
	      
	      MemberDTO _dto = (MemberDTO)session.getAttribute("info");
	      String email = _dto.getEmail();
	      String pw = request.getParameter("pw");
	      String phone = request.getParameter("phone");
	      String addr = request.getParameter("addr");

	      // System.out.println(email + "/" + pw + "/" + phone + "/" + addr);
	      
	      MemberDTO dto = new MemberDTO(email, pw, phone, addr);
	      System.out.println(dto.toString());
	      
	      MemberDAO dao = new MemberDAO();
	      int cnt = dao.update(dto);
	      
	      if (cnt >0) {
	    	  System.out.println("회원정보수정 성공!");
	      } else {
	    	  System.out.println("회원정보수정 실패..");
	      }
	      
	      response.sendRedirect("main.jsp");
	}

}
