package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.MessageDAO;
import com.model.MessageDTO;

/**
 * Servlet implementation class msgSendService
 */
@WebServlet("/msgSendService")
public class msgSendService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		
		MessageDAO dao = new MessageDAO();
		MessageDTO dto = new MessageDTO(0, name, email, message, null);
		
		int cnt = dao.send(dto);
		
		String alert = "";
		
		if (cnt >0) {
			alert += "메세지 전송 성공!";
		} else {
			alert += "메세지 전송 실패...";
		}
		
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		out.print("<script>alert("+"\""+ alert+ "\"" +");");
		out.print("location.href='main.jsp#two';"); // #two있는 위치로 감
		out.print("</script>");
	}

}
