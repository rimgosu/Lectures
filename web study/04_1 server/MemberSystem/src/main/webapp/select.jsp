<%@page import="java.net.URLEncoder"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt=0;
	ResultSet rs = null;
	
	// id, pw, nick, email, phone, gender, age
	request.setCharacterEncoding("EUC-KR");
	response.setCharacterEncoding("EUC-KR");
	
	// jsp는 try문 필요 x - 어차피 service 매서드에서 예외처리 다 해줌
	Class.forName("oracle.jdbc.driver.OracleDriver");

	String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	String db_id = "shopping";
	String db_pw = "12345";
	
    conn = DriverManager.getConnection(db_url, db_id, db_pw);
	String sql = "select id,nick,email,phone,gender,age from member";
	psmt = conn.prepareStatement(sql);
	rs = psmt.executeQuery();
	
	String html = "";
	html += "<table border='1'>";
	html += "<tr><th>아이디</th><th>닉네임</th><th>이메일</th><th>전화번호</th><th>성별</th><th>나이</th></tr>";
	
	rs.next();
	
	while(rs.next()) {
		String id = rs.getString(1);
		String nick = rs.getString(2);
		String email = rs.getString(3);
		String phone = rs.getString(4);
		String gender = rs.getString(5);
		int age = rs.getInt(6);
		
		System.out.println(id+"/"+nick+"/"+email+"/"+phone+"/"+gender+"/"+age);
		
		html += "<tr>";
		html += "<td>"+id+"</td>";
		html += "<td>"+nick+"</td>";
		html += "<td>"+email+"</td>";
		html += "<td>"+phone+"</td>";
		html += "<td>"+gender+"</td>";
		html += "<td>"+age+"</td>";
		html += "</tr>";
	}
	
	html += "</table>";
	
	out.print(html);
	
	
	if (rs!=null) {
		psmt.close();
	}
	if (conn!=null) {
		conn.close();
	}
	
	
%>
</body>
</html>