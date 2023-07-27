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

@WebServlet("/JoinService")
public class JoinService extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      
      // 1.email, pw, phone, addr 값을 콘솔(이클립스)에 출력
      
      request.setCharacterEncoding("EUC-KR");
      
      
      String email = request.getParameter("email");
      String pw = request.getParameter("pw");
      String phone = request.getParameter("phone");
      String addr = request.getParameter("addr");

      // System.out.println(email + "/" + pw + "/" + phone + "/" + addr);
      
      MessageDTO dto = new MessageDTO(email, pw, phone, addr);
      System.out.println(dto.toString());
      
      MessageDAO dao = new MessageDAO();
      int cnt = dao.join(dto);
      
      if (cnt >0) {
    	  System.out.println("회원가입 성공!");
      } else {
    	  System.out.println("회원가입 실패..");
      }
      
      response.sendRedirect("main.jsp");
      
      
      
      
      
   }

}