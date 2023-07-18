package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.impl.InvalidContentTypeException;

import com.google.gson.JsonObject;

import netscape.javascript.JSObject;

/**
 * Servlet implementation class ex02gson
 */
@WebServlet("/Gson")
public class ex02gson extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		JsonObject jsonobj = new JsonObject();
		jsonobj.addProperty("data", "Hello");
		jsonobj.addProperty("data2", "JSON객체생성성공!");
		
		System.out.println(jsonobj);
		
		// 응답할 형식을 지정 + 한글 데이터가 깨지지 않도록 설정!
		response.setContentType("application/json; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print(jsonobj);
	}

}
