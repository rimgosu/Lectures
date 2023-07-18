package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.model.coffeeDTO;

/**
 * Servlet implementation class ex04javaToJson
 */
@WebServlet("/ex04javaToJson")
public class ex04javaToJson extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 5개의 커피정보를 보관하는 ArrayList를 생성
		ArrayList<coffeeDTO> list = new ArrayList<>();
		list.add(new coffeeDTO("AMERICANO", 4500, "XL"));
		list.add(new coffeeDTO("LATTE", 5000, "L"));
		list.add(new coffeeDTO("CAPUCHINO", 5500, "L"));
		list.add(new coffeeDTO("EINSHUPANER", 6000, "S"));
		list.add(new coffeeDTO("VANILA LATTE", 5500, "M"));
		
		// java객체 -> JSON 데이터로 변환
		Gson gson = new Gson();
		String jsonArr = gson.toJson(list);
		
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(jsonArr);
		System.out.println(jsonArr);
	}

}
