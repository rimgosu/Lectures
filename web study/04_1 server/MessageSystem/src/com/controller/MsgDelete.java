package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.MessageDAO;

/**
 * Servlet implementation class MsgDelete
 */
@WebServlet("/MsgDelete")
public class MsgDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String num = request.getParameter("num");
		int ch_num = Integer.parseInt(num);
		MessageDAO dao = new MessageDAO();
		dao.delete(ch_num);
		
		response.sendRedirect("main.jsp#two");
		
		
		
		
	}

}
